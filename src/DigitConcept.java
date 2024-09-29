import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.util.Collections.sort;

public class DigitConcept
{
    static void countDigits(int n)
    {
        int counter = 0;
        while(n>0)
        {
            n /= 10;
            counter++;
        }
        System.out.println(counter);
    }

    static void ReverseTheDigits(int n)
    {
        int newNumber = 0;
        while(n>0)
        {
            int lastNumber = n%10;
            newNumber = newNumber*10 + lastNumber;
            n = n/10;
        }
        System.out.println(newNumber);
    }

    static void checkPalindrome(int n)
    {
        int duplicateN = n;
        int newNumber = 0;
        while(n>0)
        {
            int lastNumber = n%10;
            newNumber = newNumber*10 + lastNumber;
            n = n/10;
        }
        if(newNumber==duplicateN)
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }

    static void checkArmstrong(int n)
    {
        int sum = 0;
        int duplicateN = n;
        while(n>0)
        {
            int lastNumber = n%10;
            sum = sum + (lastNumber*lastNumber*lastNumber);
            n = n/10;
        }
        if(sum == duplicateN)
        {
            System.out.println("It is an Armstrong Number");
        }
        else
        {
            System.out.println("It is not an Armstrong Number");
        }
    }

    static void printAllDivisors(int n)
    {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i*i<=n; i++)
        {
            if (n % i == 0)
            {
                list.add(i);
                if (n / i != i)
                {
                    list.add(n / i);
                }
            }
        }

        Collections.sort(list);

        for (Integer num : list)
        {
            System.out.println(num);
        }
    }

    static void checkPrime(int n)
    {
        int counter = 0;
        for(int i = 1; i*i<=n; i++)
        {
            if(n%i==0)
            {
                counter++;
                if(n/i != i)
                {
                    counter++;
                }
            }
        }
        if(counter==2)
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        countDigits(n);
//        ReverseTheDigits(n);
//        checkPalindrome(n);
//        checkArmstrong(n);
//        printAllDivisors(n);
        checkPrime(n);
    }
}

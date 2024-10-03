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

    static void HCF(int n1, int n2)
    {
        int hcf = 1;

        for(int i = 1; i<=Math.min(n1,n2); i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                hcf=i;
            }
        }
        System.out.println(hcf);

        /*
        Method for better complexity

        for(int i = Math.min(n1,n2); i>=1; i--)
        {
            if(n1%i==0 && n2%i==0)
            {
                System.out.println(i);
                break;
            }
         */

        /*
        Here it is best case
        while(a>0 && b>0)
        {
            if(a>b)
            {
                a = a%b;
            }
            else
            {
                b = b%a;
            }
            if(a==0)
            {
                System.out.println(b)
            }
            else
            {
                System.out.println(a)
            }
         */
    }

    static Long[] lcmAndGcd(Long A, Long B)
    {
        // Initialize the GCD variable
        Long gcd = 1L;

        // Calculate GCD using the Euclidean algorithm
        Long a = A;
        Long b = B;
        while (b != 0) {
            gcd = b;
            b = a % b;
            a = gcd;
        }

        // Calculate LCM using the relationship with GCD
        Long lcm = (A * B) / gcd;

        // Return the result as an array of Long
        return new Long[] { lcm, gcd };
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
//        countDigits(n);
//        ReverseTheDigits(n);
//        checkPalindrome(n);
//        checkArmstrong(n);
//        printAllDivisors(n);
//        checkPrime(n);
        HCF(n1,n2);
    }
}

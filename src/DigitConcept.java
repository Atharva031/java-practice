import java.util.Scanner;

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

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        countDigits(n);
//        ReverseTheDigits(n);
        checkPalindrome(n);
    }
}

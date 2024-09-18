public class NumberPalindrome
{
    public static void main(String[] args)
    {
        int number = 12321;

        if(number<0)
        {
            System.out.println(number + " is not a palindrome");
            return;
        }

        int originalNumber = number;
        int reversedNumber = 0;

        while(number!=0)
        {
            int digit = number%10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if(originalNumber == reversedNumber)
        {
            System.out.println(originalNumber + " is a palindrome");
        }
        else
        {
            System.out.println(originalNumber + " is not a palindrome");
        }
    }
}

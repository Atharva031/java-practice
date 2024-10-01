import java.util.Scanner;

public class PalindromeRecursion
{
    static boolean isPalindrome(String word, int i)
    {
        if(i>=word.length()/2)
        {
            return true;
        }
        if(word.charAt(i)!=word.charAt(word.length()-i-1))
        {
            return false;
        }

        return isPalindrome(word, i+1);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(isPalindrome(word,0));

    }
}

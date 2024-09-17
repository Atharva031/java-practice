public class StringPalindrome
{
    public static boolean isPalindrome(String str)
    {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right)
        {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String input = "tenet";
        if (isPalindrome(input))
        {
            System.out.println("\"" + input + "\" is a palindrome");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome");
        }
    }
}

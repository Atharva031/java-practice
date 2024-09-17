public class ReverseString
{
    public static void main(String[] args) {
        String original = "Hello, World!";

        char[] charArray = original.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        String reversed = new String(charArray);

        System.out.println("Reversed String: " + reversed);
    }
}

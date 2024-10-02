import java.util.Scanner;

public class StringHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.next();

        System.out.println("Precomputing character frequencies...");
        //If the values being considered are more than the uppercase and lowercase characters change 26 to 256
        //since we are dealing with ASCII values

        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        System.out.print("Enter the number of queries: ");
        int queries = sc.nextInt();

        while (queries-- != 0) {
            System.out.print("Enter a character to query its frequency: ");
            String c = sc.next();
            char ch = c.charAt(0);
            System.out.println("Frequency of '" + ch + "': " + hash[ch - 'a']);
        }
    }
}

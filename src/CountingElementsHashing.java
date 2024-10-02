import java.util.Scanner;

public class CountingElementsHashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Precomputing frequency of elements...");
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();

        while (q-- != 0) {
            System.out.print("Enter a number to query its frequency: ");
            int number = sc.nextInt();
            System.out.println("Frequency of " + number + ": " + hash[number]);
        }
    }
}

/*
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 *        *
 **      **
 ***    ***
 ****  ****
 **********

 */


import java.util.Scanner;

public class PatternNineteen {
    static void patternNineteen(int n) {
        int initialSpace = 0;
        for (int i = 0; i < n; i++) {
            // First set of stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // Spaces in between
            for (int j = 0; j < initialSpace; j++) {
                System.out.print(" ");  // Print spaces
            }

            // Second set of stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // Increment the number of spaces for the next row
            initialSpace += 2;
            System.out.println();  // Move to the next line after each row
        }
    }

    static void patternNineteenPartB(int n) {
        int initialSpace = 2 * (n - 1);  // Maximum spaces initially

        for (int i = 0; i < n; i++) {
            // First set of stars
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*");
            }

            // Spaces in between
            for (int j = 0; j < initialSpace; j++) {
                System.out.print(" ");  // Print spaces
            }

            // Second set of stars
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*");
            }

            // Decrease the number of spaces for the next row
            initialSpace -= 2;
            System.out.println();  // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternNineteen(n);
        patternNineteenPartB(n);
    }
}

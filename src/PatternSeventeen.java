/*

----A
---ABA
--ABCBA
-ABCDCBA
ABCDEDCBA

 */


import java.util.Scanner;

public class PatternSeventeen {
    static void patternSeventeen(int n) {
        // Loop through the number of rows
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("-");
            }

            char alphabet = 'A';  // Reset alphabet to 'A' at the start of each row
            int breakpoint = i;    // Breakpoint for increment and decrement

            // Print the pattern of letters
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(alphabet);

                // Increment alphabet until the breakpoint, then decrement
                if (j < breakpoint) {
                    alphabet++;
                } else {
                    alphabet--;
                }
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternSeventeen(n);
    }
}

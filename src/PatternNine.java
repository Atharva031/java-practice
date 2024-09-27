/*
   *
  ***
 *****
 *****
  ***
   *

 */



import java.util.Scanner;

public class PatternNine
{
    static void patternSeven(int n) {
        // Loop through the number of rows
        for(int i = 0; i < n; i++) {
            // Print leading spaces
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print("-");
            }

            // Print stars
            for(int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }

    static void patternEight(int n)
    {
        // Loop through the number of rows
        for(int i = 0; i < n; i++) {
            // Print leading spaces
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }

            // Print stars
            for(int j = 0; j < 2*n - (2 * i + 1); j++)
            {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternSeven(n);
        patternEight(n);
    }

}

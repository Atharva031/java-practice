/*
D
CD
BCD
ABCD
 */

import java.util.Scanner;

public class PatternEighteen
{

    static void patternEighteen(int n)
    {
        for(int i = 0; i<n; i++)
        {
            for(char alphabet = (char) ('E' - i); alphabet<='E' ; alphabet++)
            {
                System.out.print(alphabet);
            }
            System.out.println("-");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternEighteen(n);


    }
}

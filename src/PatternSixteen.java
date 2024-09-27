/*

A
BB
CCC
DDDD
EEEEE
FFFFFF



*/

import java.util.Scanner;



public class PatternSixteen
{

    static void patternSixteen(int n)
    {
        char alphabet = 'A';
        for(int i = 0; i<=n; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print(alphabet);

            }
            alphabet++;
            System.out.println("-");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternSixteen(n);


    }

}

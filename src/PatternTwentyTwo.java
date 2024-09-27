import java.util.Scanner;

import static java.lang.Math.min;

public class PatternTwentyTwo
{
    static void patternTwentyTwo(int n)
    {
        for(int i = 0; i<2*n-1; i++)
        {
            for(int j = 0; j<2*n-1; j++)
            {
                int top = i;
                int left = j;
                int right = (2*n - 2) - j;
                int down = (2*n-2) - i;
                System.out.print(n-min(min(top,down), min(left,right)) + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternTwentyTwo(n);

    }
}

/*                                      Pattern 3:
                                         1
                                         12
                                         123
                                         1234
                                         12345






 */

import java.util.Scanner;


public class PatternThree
{
    static void patternThree(int n)
    {
        for(int i = 0; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternThree(n);
    }

}

/*                                      Pattern 7:
                                           *
                                          ***
                                         *****
                                        *******
                                       *********




 */
import java.util.Scanner;

public class PatternSeven
{
    static void patternSeven(int n)
    {
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n-i+1; j++)
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
        patternSeven(n);
    }
}

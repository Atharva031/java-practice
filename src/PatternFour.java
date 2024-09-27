/*                                      Pattern 4:
                                         1
                                         22
                                         333
                                         4444
                                         55555






 */
import java.util.Scanner;

public class PatternFour
{
    static void patternFour(int n)
    {
        for(int i = 0; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println(" ");
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternFour(n);
    }
}

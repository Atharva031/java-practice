/*                                      Pattern 15:
 ABCDE
 ABCD
 ABC
 AB
 A






 */
import java.util.Scanner;

public class PatternFifteen
{
    static void patternFifteen(int n)
    {
        for(int i = 1; i<=n; i++)
        {
            for(char j = 'A'; j<= 'A' + (n-i-1); j++)
            {
                System.out.print(j);
            }
            System.out.println("-");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternFifteen(n);
    }
}

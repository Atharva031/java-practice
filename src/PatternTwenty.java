/*

 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *

 */




import java.util.Scanner;


public class PatternTwenty
{
    static void patternTwenty(int n)
    {
        int spaces = 2*n-2;
        for(int i = 1; i<=2*n-1;i++)
        {
            int stars = i;
            if(i>n)
            {
                stars = 2*n-i;
            }

            //Stars

            for(int j = 1; j<=stars; j++)
            {
                System.out.print("*");
            }

            for(int j = 1; j<=spaces; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j<=stars; j++)
            {
                System.out.print("*");
            }
            System.out.println("-");
            if(i<n)
            {
                spaces-=2;
            }
            else
            {
                spaces+=2;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternTwenty(n);

    }
}

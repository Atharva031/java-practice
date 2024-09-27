/*

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */





import java.util.Scanner;

public class PatternEleven
{
    static void patternEleven(int n)
    {
        int start = 0;
        for(int i = 0; i<n; i++)
        {
            if(i % 2 == 0)
            {
                start = 1;
            }
            else
            {
                start = 0;
            }
            for(int j = 0; j <=i; j++)
            {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println("-");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternEleven(n);



    }
}

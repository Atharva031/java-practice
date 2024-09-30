import java.util.Scanner;


public class Recursion
{
    static void recursion1(int i, int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println("Atharva");
        recursion1(i+1,n);

    }

    static void recursion2(int i, int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println(i);
        recursion2(i+1,n);

    }

    static void recursion3(int i, int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println(n);
        recursion3(i,n-1);


        /*
        Alternate method
        if(i<1)
        {
            return;
        }
        sout(i);
        recursion3(i-1,n)

         */
    }

    static void recursion4(int i, int n)
    {
        //Backtracking
        if (i < 1)
        {
            return;
        }
        recursion4(i - 1, n);
        System.out.println(i);
    }

    static void recursion5(int i, int n)
    {
        //Backtracking
        if (i > n)
        {
            return;
        }
        recursion5(i + 1, n);
        System.out.println(i);
    }


    public static void main(String[] args)
    {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Entered value " + n);
//        recursion1(i,n);
//        recursion2(i,n);
//        recursion3(i,n);
//        recursion4(n,n);
        recursion5(i,n);
    }
}

import java.util.Scanner;

public class FibonnaciRecursion
{
    static int fibonnaciRecursion(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int last = fibonnaciRecursion(n-1);
        int secondLast = fibonnaciRecursion(n-2);
        System.out.println("Last: " + last + " secondLast: " + secondLast + " sum: " + (last+secondLast) );
        return last + secondLast;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonnaciRecursion(n));
    }
}

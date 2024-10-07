import java.util.Scanner;
//Recursion for common digit problem statements

public class Recursion
{
    static void printNameNTimes(int i, int n)
    {
        if(i > n)
        {
            return;
        }
        System.out.println("Atharva");
        printNameNTimes(i + 1, n);
    }

    static void printNumbersAscending(int i, int n)
    {
        if(i > n)
        {
            return;
        }
        System.out.println(i);
        printNumbersAscending(i + 1, n);
    }

    static void printNumbersDescending(int i, int n)
    {
        if(i > n)
        {
            return;
        }
        System.out.println(n);
        printNumbersDescending(i, n - 1);
    }

    static void printNumbersAscendingBacktracking(int i)
    {
        if (i < 1)
        {
            return;
        }
        printNumbersAscendingBacktracking(i - 1);
        System.out.println(i);
    }

    static void printNumbersDescendingBacktracking(int i, int n)
    {
        if (i > n)
        {
            return;
        }
        printNumbersDescendingBacktracking(i + 1, n);
        System.out.println(i);
    }

    static void sumFirstNNumbersParameterized(int i, int sum)
    {
        if(i < 1)
        {
            System.out.println(sum);
            return;
        }
        sumFirstNNumbersParameterized(i - 1, sum + i);
    }

    static int sumFirstNNumbersFunctional(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return n + sumFirstNNumbersFunctional(n - 1);
    }

    static int calculateFactorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args)
    {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int option = sc.nextInt();
        System.out.println("Entered value of n: " + n);
        System.out.println("Entered value of Option: " + n);

        switch(option)
        {
            case 1:
                printNameNTimes(i, n);
                break;
            case 2:
                printNumbersAscending(i, n);
                break;
            case 3:
                printNumbersDescending(i, n);
                break;
            case 4:
                printNumbersAscendingBacktracking(n);
                break;
            case 5:
                printNumbersDescendingBacktracking(i, n);
                break;
            case 6:
                sumFirstNNumbersParameterized(n, 0);
                break;
            case 7:
                System.out.println(sumFirstNNumbersFunctional(n));
                break;
            case 8:
                System.out.println(calculateFactorial(n));
                break;

        }
    }
}

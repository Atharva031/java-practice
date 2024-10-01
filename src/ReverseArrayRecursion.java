import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayRecursion
{
    static void printArray(int arr[], int n)
    {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    //Function to reverse array using recursion
    static void reverseArray(int arr[], int start, int end)
    {
        if (start < end)
        {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start + 1, end - 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, 0, n - 1);
        printArray(arr, n);
    }
}

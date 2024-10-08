import java.util.Scanner;

public class SelectionSortDSA
{
    static void selectionSort(int[] arr, int n)
    {
        for(int i = 0; i<=n-2; i++)
        {
            System.out.println("Pass " + (i+1) + ":");
            int mini = i;
            for(int j = i; j<=n-1; j++)
            {
                if(arr[j]<arr[mini])
                {
                    mini = j;
                }
            }
            System.out.println("Minimum element found at index " + mini + " with value " + arr[mini]);

            // Swapping
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;

            System.out.println("Array after swapping: ");
            for(int k = 0; k < n; k++)
            {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i<n ;i++)
        {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr,n);

        System.out.println("Sorted array: ");
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

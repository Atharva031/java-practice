import java.util.Scanner;

public class BubbleSortDSA
{
    static void bubbleSort(int[] arr, int n)
    {
        for(int i = 0; i<n; i++)
        {
            int didSwap = 0;
            for(int j = 0; j<=i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0)
            {
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i<n ;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Initial array: ");
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr,n);

        System.out.println("Sorted array: ");
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }

}

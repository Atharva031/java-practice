public class QuickSort
{
    //Uses a pivot to sort, where the elements less than the pivot are arranged to the left of the pivot.
    //Elements more than the pivot are arranged to the right of the pivot.
    //Called recursively
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for(int j = low; j < high; j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int pi = partition(arr,low,high);
            quickSort(arr, low, pi-1);
            quickSort(arr,pi+1, high);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {10, 7, 8, 9, 1, 5}; // Example array to be sorted
        int n = arr.length;

        System.out.println("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Call the quickSort method
        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

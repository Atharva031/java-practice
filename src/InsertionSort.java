import java.util.Arrays;

//Compare two adjacent elements and sort them, now the first two sorted elements become a sorted set by themselves.
//Compare the next element with the sorted set and then place it at the appropriate index.
public class InsertionSort
{
    static void insertionSort(int[] arr)
    {
        int n = arr.length;
        for(int i = 1; i<n; ++i)
        {
            int key = arr[i];
            int j = i -1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {23,4,32,56};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

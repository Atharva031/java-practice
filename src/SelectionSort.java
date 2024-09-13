import java.util.Arrays;

public class SelectionSort
{
    static void SelectionSort(int arr[])
    {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++)
        {
            int minID = i;
            for(int j = i + 1; j < n; j++)
            {
                if(arr[j]<arr[minID])
                {
                    minID = j;
                }
            }
            int temp = arr[minID];
            arr[minID] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {22,3,444,55,232323};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

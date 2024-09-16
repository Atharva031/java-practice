import java.util.Arrays;


//Divides the array into subarrays, sorts the subarrays and then merges them.
public class MergeSort
{
    static void mergeSort(int[] arr, int left, int middle, int right) {
        int leftArraySize = middle - left + 1;
        int rightArraySize = right - middle;
        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        for (int i = 0; i < leftArraySize; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < rightArraySize; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }

        int i = 0;
        int j = 0;
        int mergedArrayIndex = left;

        while(i < leftArraySize && j<rightArraySize)
        {
            if(leftArray[i] <= rightArray[j])
            {
                arr[mergedArrayIndex] = leftArray[i];
                i++;
            }
            else
            {
                arr[mergedArrayIndex] = rightArray[j];
                j++;
            }
            mergedArrayIndex++;
        }

    }

    static void sort(int[] arr, int left, int right)
    {
        if(left<right)
        {
            int middle = (left+right)/2;
            sort(arr, left, middle);
            sort(arr, middle+1, right);
            mergeSort(arr, left, middle, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array: " + Arrays.toString(arr));

        // Calling sort method to sort the array
        sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

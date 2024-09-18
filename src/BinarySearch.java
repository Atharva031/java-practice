public class BinarySearch
{
    //If the element to be found is greater than the pointer x, consider all the elements to the right of x.
    //If the element to be found is less than the pointer x, consider all the elements to the left of x.
    static int binarySearch(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length-1;
        while(left<=right)
        {
            int mid = left + (right-1)/2;

            if(arr[mid] == target)
            {
                return mid;
            }

            if(arr[mid]<target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {22,3,5,6,7};
        int target = 5;
        System.out.println(binarySearch(arr, target));
    }
}

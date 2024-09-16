public class BinarySearch
{

    //If the element to be found is greater than the pointer x, consider all the elements to the right of x.
    //If the element to be found is less than the pointer x, consider all the elements to the left of x.
    static int binarySearch(int[] arr, int x)
    {
        int l = 0;
        int r = arr.length-1;
        while(l<=r)
        {
            int m = l + (r-1)/2;

            if(arr[m] == x)
            {
                return m;
            }

            if(arr[m]<x)
            {
                l = m + 1;
            }
            else
            {
                r = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {22,3,5,6,7};
        int x = 5;
        System.out.println(binarySearch(arr, x));
    }
}

public class LinearSearch
{
    //Searches through an array, element after element until the answer is found
    public static int search(int[] arr, int x)
    {
        int n = arr.length;
        for(int i = 0; i<n; i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {23,33,45,5,6};
        int x = 5;
        System.out.println(search(arr, x));
    }
}

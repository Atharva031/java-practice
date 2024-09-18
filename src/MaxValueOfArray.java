public class MaxValueOfArray
{
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,1};
        System.out.println(max(arr));
    }

    static int max(int[] arr)
    {
        int maxValue = arr[0];
        for(int i = 0; i< arr.length;i++)
        {
            if(arr[i]>maxValue)
            {
                maxValue = arr[i];
            }
        }
        return maxValue;

        //If asked to find the maximum value in a given range, declare two new variables int start and int end,
        //both containing the starting and ending index and use them as arguments in the for loop
    }
}

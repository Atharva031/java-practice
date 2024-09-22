import java.util.Arrays;

public class LearnArraysClass
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(a,4);
        System.out.println("The index of element 4 in the array is: " + index);

        Integer[] numbers = {10,2,33,22,4,3212};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.fill(numbers, 12);


    }
}

import java.util.Arrays;
import java.util.Scanner;


public class Array2D
{
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {

                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                System.out.println(arr[i][j] + " ");
            }
        }
    }
}

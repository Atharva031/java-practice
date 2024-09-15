import java.util.ArrayList;
import java.util.Scanner;

public class MultidimensionalArrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialize inner ArrayLists and add them to the outer ArrayList
        for (int i = 0; i < 5; i++) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                innerList.add(sc.nextInt());
            }
            list.add(innerList);
        }
        System.out.println(list);
    }
}

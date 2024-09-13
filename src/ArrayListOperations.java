import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations
{

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter the numbers");
            list.add(sc.nextInt());
        }

        for(int i = 0; i < 5; i++)
        {
            System.out.println(list.get(i));
        }

        //You can also use ArrayList.toString here to print the arrayList in String format
    }
}

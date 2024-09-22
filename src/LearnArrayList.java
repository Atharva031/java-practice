import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList
{
    public static void main(String[] args)
    {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext())
        {
            System.out.println("Iterator " + it.next());
        }

        System.out.println(list.get(2));
        list.remove(3);
        System.out.println(list);



    }
}

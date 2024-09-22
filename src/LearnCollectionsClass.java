import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionsClass
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        System.out.println("min element: " + Collections.min(list));
        System.out.println("max element: " + Collections.max(list));
        System.out.println("frequency of element: " + Collections.frequency(list,9));

    }
}

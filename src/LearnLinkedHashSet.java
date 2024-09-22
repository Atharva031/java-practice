import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet
{
        public static void main(String[] args)
        {
            Set<Integer> set = new LinkedHashSet<>();
            set.add(32);
            set.add(54);
            set.add(21);
            set.add(65);

            System.out.println(set);
            set.remove(21);
            System.out.println(set.contains(32));
            System.out.println(set.isEmpty());
            System.out.println(set.size());
            set.clear();
        }
}


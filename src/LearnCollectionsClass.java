
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        Collections.sort(list);
        System.out.println(list);


        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Atharva", 1));
        list2.add(new Student("Dattatray", 5));
        list2.add(new Student("Abhay", 2));
        list2.add(new Student("Varsha", 4));
        list2.add(new Student("Abhishek", 3));
        list2.add(new Student("Prabhavati", 6));

        Student s1 = new Student("Aakash", 7);
        Student s2 = new Student("Nishad", 8);

        System.out.println(list2);
//        System.out.println((s1.compareTo(s2)));
        Collections.sort(list2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(list2);


        Collections.sort(list2);


    }
}

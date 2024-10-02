import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementsHashMap
{
    public static void main(String args[]){
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;

        System.out.println("Calculating frequency of elements...");
        Frequency(arr, n);
    }

    static void Frequency(int arr[], int n)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            System.out.println("Processing element: " + arr[i]);
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
                System.out.println("Incremented frequency of " + arr[i] + " to " + map.get(arr[i]));
            }
            else
            {
                map.put(arr[i], 1);
                System.out.println("Added " + arr[i] + " to map with frequency 1");
            }
        }

        System.out.println("Frequencies of elements:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

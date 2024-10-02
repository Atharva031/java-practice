import java.util.HashMap;
import java.util.Map;

public class HighestAndLowestFrequencyHashMap {
    public static void main(String args[]) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;

        System.out.println("Calculating frequency of elements...");
        Frequency(arr, n);
    }

    static void Frequency(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequencies of elements
        for (int i = 0; i < n; i++) {
            System.out.println("Processing element: " + arr[i]);
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
                System.out.println("Incremented frequency of " + arr[i] + " to " + map.get(arr[i]));
            } else {
                map.put(arr[i], 1);
                System.out.println("Added " + arr[i] + " to map with frequency 1");
            }
        }

        System.out.println("Frequencies of elements:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Variables to track max and min frequency
        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;
        Integer keyWithMaxFrequency = null;
        Integer keyWithMinFrequency = null;

        // Find keys with maximum and minimum frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            // Check for max frequency
            if (value > maxFrequency) {
                maxFrequency = value;
                keyWithMaxFrequency = key;
            }

            // Check for min frequency
            if (value < minFrequency) {
                minFrequency = value;
                keyWithMinFrequency = key;
            }
        }

        // Print results
        System.out.println("Key with maximum frequency: " + keyWithMaxFrequency + " (Frequency: " + maxFrequency + ")");
        System.out.println("Key with minimum frequency: " + keyWithMinFrequency + " (Frequency: " + minFrequency + ")");
    }
}

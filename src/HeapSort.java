public class HeapSort {

    // Method to perform heap sort
    public void heapSort(int[] arr) {
        int n = arr.length;

        // Build the heap (rearrange the array)
        for (int i = n / 2 - 1; i >= 0; --i) {
            heapify(arr, n, i);
        }

        // One by one extract elements from heap
        for (int i = n - 1; i >= 0; --i) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is an index in arr[]
    private void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // See if left child of root exists and is greater than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // See if right child of root exists and is greater than root
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Change root, if needed
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Main method to test the heap sort
    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        heapSort.heapSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

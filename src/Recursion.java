public class Recursion {
    private int count = 0;  // Instance variable

    // Instance method for recursion
    public int callFunction() {
        if (count == 4) {
            return count;
        }
        count++;
        return callFunction();  // Return the result of the recursive call
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();  // Create an instance of Recursion
        int result = recursion.callFunction();  // Call the instance method
        System.out.println("Final count: " + result);  // Print the result
    }
}

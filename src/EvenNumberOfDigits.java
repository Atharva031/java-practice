public class EvenNumberOfDigits {

    // Leetcode problem 1295

    public static void main(String[] args) {
        int[] nums = {12, 23, 44, 32, 55};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits2(int num) {
        if (num < 0) { // Correcting the condition
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    static int digits(int num) {
        if (num < 0) { // Correcting the condition
            num = num * -1;
        }

        if (num == 0) { // Correcting the zero case
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}

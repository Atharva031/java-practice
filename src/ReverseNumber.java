public class ReverseNumber {
    public static void main(String[] args) {
        int newNumber = 0;
        int number = 12345;

        while (number>0)
        {
            int remainder = number%10;
            number = number / 10;

            newNumber = newNumber*10+remainder;
        }
        System.out.println(newNumber);
    }
}

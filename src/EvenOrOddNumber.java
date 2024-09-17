public class EvenOrOddNumber
{
    public static void evenOrOddNumber(int number)
    {
        if(number%2 == 0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        evenOrOddNumber(2);
    }
}

import java.util.Scanner;

public class FactorsOfANumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while(number>0)
        {
            number = number / 10;
            System.out.println(number);
        }
    }
}

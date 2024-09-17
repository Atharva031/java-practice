import java.util.Scanner;

public class VowelOrConsonant
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        for(int i = 0; i<input.length(); i++)
        {
            char ch = input.charAt(i);
            if(Character.isLetter(ch))
            {
                ch = Character.toLowerCase(ch);

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    System.out.println(ch + "is a vowel");
                }
                else
                {
                    System.out.println(ch + "is a consonant");
                }
            }
            else
            {
                System.out.println(ch + "is not an alphabetic character");
            }
        }
        sc.close();
    }
}

/*                                      Pattern 1:
                                          ****
                                          ****
                                          ****
                                          ****


 */

public class PatternOne
{
    static void patternOne()
    {
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<4; j++)
            {
                System.out.print("*");
            }
            System.out.println("-");

        }


    }
    public static void main(String[] args)
    {
        patternOne();
    }
}

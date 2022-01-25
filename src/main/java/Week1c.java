//package Week1;

public class Week1c
{
    public static void main (String args[])
    {
        for(int x = 102; x > 66; x = x-1)
        {
            var resultOfMod = x % 2;
            if(resultOfMod != 0)
            {
                System.out.print("Value of x : " + x);
                System.out.print("\n");
            }
        }
    }
}

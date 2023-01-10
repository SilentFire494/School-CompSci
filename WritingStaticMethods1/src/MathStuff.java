public class MathStuff
{
    public static boolean checkFactor(int factor, int number )
    {
        boolean factorable = false;
        if (number % factor == 0)
        {
            factorable = true;
            return factorable;
        }
        else
        {
            return factorable;
        }
    }

    public static int countFactor(int number)
    {
        int count = 0;
        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int number)
    {
        if (countFactor(number) <= 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
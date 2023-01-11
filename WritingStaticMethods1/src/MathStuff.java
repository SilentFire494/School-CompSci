public class MathStuff
{
    public static boolean checkFactor(int number, int factor)
    {
        if (factor % number == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int countFactor(int number)
    {
        int count = 0;
        for (int i = 1; i <= number; i++)
        {
            if (checkFactor(number, i))
            {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int number)
    {
        if (number<=1)
        {
            return false;
        }

        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }

}
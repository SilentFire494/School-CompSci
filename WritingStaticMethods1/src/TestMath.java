public class TestMath 
{
    public static void main(String[] args)
    {
        System.out.println(MathStuff.checkFactor(2, 3));
        System.out.println(MathStuff.countFactor(9));
        System.out.println(MathStuff.isPrime(13));

        for (int i = 1; i <= 100; i++)
        {
            if (MathStuff.isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        
    }
}
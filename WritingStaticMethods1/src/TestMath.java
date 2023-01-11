public class TestMath 
{
    public static void main(String[] args)
    {
        System.out.println(MathStuff.checkFactor(2, 4));
        System.out.println(MathStuff.countFactor(4));
        System.out.println(MathStuff.isPrime(8));

        for (int i = 1; i <= 100; i++)
        {
            if (MathStuff.isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        
    }
}
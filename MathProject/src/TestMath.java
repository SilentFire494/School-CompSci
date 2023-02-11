public class TestMath 
{
    public static void main(String[] args)
    {
        Rational r1 = new Rational(-1, -2);
        Rational r2 = new Rational(1, 2);
        Rational r3 = new Rational(1, 3);
        Rational r4 = new Rational(2, 4);
        Rational r5 = new Rational(1, 1);

        System.out.println(r1.equals(r2));
        System.out.println(r1.multiply(r3));
        System.out.println(r1.divide(r3));
        System.out.println(r1.equals(r4));
        System.out.println(r5);

        Point p1 = new Point(r1, r2);
        Point p2 = new Point(r1, r2);
        Point p3 = new Point(r1, r3);
        Point p4 = new Point(r1, r4);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        


    }
}

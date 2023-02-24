public class TestMath 
{
    public static void main(String[] args)
    {
        Rational r1 = new Rational(8, 9);
        Rational r2 = new Rational(3, 4);
        Rational r3 = new Rational(3);
        Rational r4 = new Rational(4);
        Rational r5 = new Rational(1, 3);
        Rational r6 = new Rational(-2, 3);
        Rational r7 = new Rational(1, 3);
        Rational r8 = new Rational(12);
        Rational r9 = new Rational(5, 6);
        Rational r10 = new Rational(1, 4);
        Rational r11 = new Rational(-6, 1);
        Rational r12 = new Rational(5, 4);

        System.out.println(r1.multiply(r2));
        System.out.println(r3.add(r4));
        System.out.println(r5.subtract(r6));
        System.out.println(r7.multiply(r8));
        System.out.println(r9.subtract(r10));
        System.out.println(r11.add(r12));

        Rational r13 = new Rational(2);
        Rational r14 = new Rational(1);
        Rational r15 = new Rational(-1, 2);
        Rational r16 = new Rational(0);
        Rational r17 = new Rational(-5);
        Rational r18 = new Rational(3);
        Rational r19 = new Rational(4);
        Rational r20 = new Rational(-1, 3);
        Rational r21 = new Rational(-2);
        Rational r22 = new Rational(3);
        Rational r23 = new Rational(4);
        Rational r24 = new Rational(1, 3);
        Rational r25 = new Rational(5, 6);
        Rational r26 = new Rational(1, 4);
        Rational r27 = new Rational(-9);
        Rational r28 = new Rational(-5, 6);




        Line l1 = new Line(r13, r14);
        Line l2 = new Line(r14, r15);
        Line l3 = new Line(r16, r17);
        Line l4 = new Line(r16, r16);
        Line l5 = new Line(r18, r19);
        Line l6 = new Line(r20, r21);
        Line l7 = new Line(r22, r23);
        Line l8 = new Line(r24, r21);
        Line l9 = new Line(r25, r26);
        Line l10 = new Line(r25, r27);
        Line l11 = new Line(r28, r26);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5.isPerpendicular(l6));
        System.out.println(l7.isPerpendicular(l8));
        System.out.println(l10.isParallel(l9));
        System.out.println(l11.isParallel(l10));



    }
}
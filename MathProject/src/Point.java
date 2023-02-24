public class Point 
{
    private Rational x;
    private Rational y;

    public Point(Rational x, Rational y)
    {
        this.x = x;
        this.y = y;
    }

    public Point()
    {
        this(new Rational(), new Rational());
    }

    public Rational getX()
    {
        return x;
    }

    public Rational getY()
    {
        return y;
    }

    public boolean equals(Point other)
    {
        return (this.x == other.x && this.y == other.y);
    }

    @Override public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    
}

public class Line
{
    private Rational slope;
    private Rational yIntercept;

    public Line(Rational slope, Rational yIntercept)
    {
        this.slope = slope;
        this.yIntercept = yIntercept;
    }
    
    public Rational getSlope()
    {
        return this.slope;
    }

    public Rational getYIntercept()
    {
        return this.yIntercept;
    }

    public boolean isParallel(Line other)
    {
        return this.slope.equals(other.slope);
    }

    public boolean isPerpendicular(Line other)
    {
        Rational negOne = new Rational(-1);
        Rational reciprocal = other.slope.reciprocal();
        Rational negReciprocal = reciprocal.multiply(negOne);
        return this.slope.equals(negReciprocal);
    }

    public boolean equals(Line other)
    {
        return (other.slope == this.slope && other.yIntercept == this.yIntercept);
    }

    public boolean containsPoint(Point p)
    {
        return (p.getY() == this.slope.multiply(p.getX()).add(this.yIntercept));
    }

    @Override public String toString()
    {
        boolean zeroSLope = this.slope.isZero();
        boolean zeroYIntercept = this.yIntercept.isZero();
        boolean negYIntercept = this.yIntercept.isNegetive();
        boolean negSlope = this.slope.isNegetive();
        boolean slopeOne = this.slope.equals(new Rational(1)) || this.slope.equals(new Rational(-1));
        String mx = "";
        String b = "";

        if (slopeOne)
        {
            mx = "x ";
        }
        else if (slopeOne && negSlope)
        {
            mx = "-x ";
        }
        else if (!zeroSLope)
        {
            mx = this.slope + "x ";
        }

        if (negYIntercept)
        {
            b = "" + this.yIntercept;
        }
        else if (!zeroYIntercept)
        {
            b = "+" + this.yIntercept;
        }

        return "y = " + mx + b;
        }
    }
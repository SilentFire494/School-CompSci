public class Circle
{
    private double radius;


    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public double getArea()
    {
        return 3.14 * this.radius * this.radius;
    }

    public double getCircumference()
    {
        return 2 * 3.14 * this.radius;
    }


}
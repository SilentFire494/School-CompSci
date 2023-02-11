public class Exercise 
{
    private String name;
    private double calsBurnPerMin;

    public Exercise (String name, double calsBurnPerMin) 
    {
        this.name = name;
        this.calsBurnPerMin = calsBurnPerMin;
    }

    public String getName() 
    {
        return this.name;
    }

    public double getCaloriesBurnedPerMin() 
    {
        return this.calsBurnPerMin;
    }

    
}
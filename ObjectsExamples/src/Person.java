public class Person 
{
    private String name;
    private double weight;

    public Person(String name, double weight) 
    {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() 
    {
        return this.weight;
    }

    public String getName() 
    {
        return this.name;
    }

    public void eat(Food food) 
    {
        int cals = food.getCalories();
        double poundsGained = cals / 3500.0;
        this.weight += poundsGained;
    }

    public void exercise(Exercise exercise, double minutes) 
    {
        double calsBurned = exercise.getCaloriesBurnedPerMin() * minutes;
        double poundsLost = calsBurned / 3500.0;
        this.weight -= poundsLost;
    }
}

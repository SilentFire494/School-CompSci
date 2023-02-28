public class Helment 
{
    private Stats stats;
    private String name;

    public Helment()
    {
        this.stats = new Stats();
    }

    public Stats getStats()
    {
        return stats;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
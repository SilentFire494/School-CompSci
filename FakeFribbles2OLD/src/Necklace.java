public class Necklace 
{
    private Stats stats;
    private String name;

    public Necklace()
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
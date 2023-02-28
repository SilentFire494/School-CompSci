public class Boots 
{
    private Stats stats;
    private String name;

    public Boots()
    {
        this.stats = new Stats();
        this.name = name;
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
public class SuperHero
{
    public int getStrength(int strength)
    {
        return strength;
    }

public static boolean fight(SuperHero hero, Villian villian)
{
    int heroStrength = hero.getStrength(10);
    int villianStrength = villian.getStrength(10);
    return heroStrength > villianStrength;
}

}
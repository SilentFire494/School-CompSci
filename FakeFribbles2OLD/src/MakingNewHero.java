import java.util.Scanner;

public class MakingNewHero 
{
    public static Weapon makeSword()
    {
        Scanner input = new Scanner(System.in);
        // ask player for sword main stat
        System.out.println("What is the main stat of your sword?");
        int mainStat = input.nextInt();

        System.out.println("What is the first substat of your sword?");
        int subStat1 = input.nextInt();

        System.out.println("What is the second substat of your sword?");
        int subStat2 = input.nextInt();

        System.out.println("What is the third substat of your sword?");
        int subStat3 = input.nextInt();

        System.out.println("What is the fourth substat of your sword?");
        int subStat4 = input.nextInt();

        input.close();

        //set the stats of the sword
        Weapon sword = new Weapon();
        sword.getStats().setMainAtk(mainStat);
        sword.getStats().setAtk(subStat4);
        sword.getStats().setDef(subStat3);
        sword.getStats().setHp(subStat2);
        sword.getStats().setSpeed(subStat1);

        return sword;





    }
}

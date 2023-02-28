public class Optimizer 
{
    public static void main(String[] args) 
    {
        Hero hero = new Hero();

        System.out.println("Hero's base Attack: " + hero.getBaseStats().getAtk());
        System.out.println("Hero's base Defense: " + hero.getBaseStats().getDef());
        System.out.println("Hero's base HP: " + hero.getBaseStats().getHp());
        System.out.println("Hero's base Speed: " + hero.getBaseStats().getSpeed());
        System.out.println("Hero's base Crit Rate: " + hero.getBaseStats().getCritRate());
        System.out.println("Hero's base Crit Damage: " + hero.getBaseStats().getCritDmg());
        System.out.println("Hero's base Effectiveness: " + hero.getBaseStats().getEff());
        System.out.println("Hero's base Effectiveness Resistance: " + hero.getBaseStats().getEffRes());

        //run make sword
        Weapon sword = MakingNewHero.makeSword();

        //equip sword
        hero.equip(sword.getStats());

        System.out.println("Hero's base Attack: " + hero.getBaseStats().getAtk());
        System.out.println("Hero's base Defense: " + hero.getBaseStats().getDef());
        System.out.println("Hero's base HP: " + hero.getBaseStats().getHp());
        System.out.println("Hero's base Speed: " + hero.getBaseStats().getSpeed());
        System.out.println("Hero's base Crit Rate: " + hero.getBaseStats().getCritRate());
        System.out.println("Hero's base Crit Damage: " + hero.getBaseStats().getCritDmg());
        System.out.println("Hero's base Effectiveness: " + hero.getBaseStats().getEff());
        System.out.println("Hero's base Effectiveness Resistance: " + hero.getBaseStats().getEffRes());



    }
}
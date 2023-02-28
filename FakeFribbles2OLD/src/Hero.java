public class Hero 
{
    private Stats baseStats;


    public Hero()
    {
        this.baseStats = new Stats();
    }

    public Stats getBaseStats()
    {
        return baseStats;
    }

    public void displayStats()
    {
        System.out.println("Hero's base stats: " + this.baseStats);
    }

    public void equip(Stats stats)
    {
        this.baseStats.setHp(this.baseStats.getHp() + stats.getHp());
        this.baseStats.setHp(this.baseStats.getHp() + stats.getMainHP());
        this.baseStats.setAtk(this.baseStats.getAtk() + stats.getAtk());
        this.baseStats.setAtk(this.baseStats.getAtk() + stats.getMainAtk());
        this.baseStats.setDef(this.baseStats.getDef() + stats.getDef());
        this.baseStats.setDef(this.baseStats.getDef() + stats.getMainDef());
        this.baseStats.setSpeed(this.baseStats.getSpeed() + stats.getSpeed());
        this.baseStats.setCritRate(this.baseStats.getCritRate() + stats.getCritRate());
        this.baseStats.setCritDmg(this.baseStats.getCritDmg() + stats.getCritDmg());
        this.baseStats.setEff(this.baseStats.getEff() + stats.getEff());
        this.baseStats.setEffRes(this.baseStats.getEffRes() + stats.getEffRes());
    }


}
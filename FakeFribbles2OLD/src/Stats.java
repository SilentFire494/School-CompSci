public class Stats 
{
    private int mainAtk;
    private int mainDef;
    private int mainHP;
    private int hp;
    private int atk;
    private int def;
    private int spd;
    private int critRate;
    private int critDmg;
    private int eff;
    private int effRes;

    public Stats()
    {
        this.mainAtk = 0;
        this.mainDef = 0;
        this.mainHP = 0;
        this.hp = 0;
        this.atk = 0;
        this.def = 0;
        this.spd = 0;
        this.critRate = 0;
        this.critDmg = 0;
        this.eff = 0;
        this.effRes = 0;
    }

    public int getMainAtk()
    {
        return this.mainAtk;
    }

    public void setMainAtk(int mainAtk)
    {
        this.mainAtk = mainAtk;
    }

    public int getMainDef()
    {
        return this.mainDef;
    }

    public void setMainDef(int mainDef)
    {
        this.mainDef = mainDef;
    }

    public int getMainHP()
    {
        return this.mainHP;
    }

    public void setMainHP(int mainHP)
    {
        this.mainHP = mainHP;
    }

    public int getHp()
    {
        return this.hp;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getAtk()
    {
        return this.atk;
    }

    public void setAtk(int atk)
    {
        this.atk = atk;
    }

    public int getDef()
    {
        return this.def;
    }

    public void setDef(int def)
    {
        this.def = def;
    }

    public int getSpeed()
    {
        return this.spd;
    }
    
    public void setSpeed(int spd)
    {
        this.spd = spd;
    }

    public int getCritRate()
    {
        return this.critRate;
    }

    public void setCritRate(int critRate)
    {
        this.critRate = critRate;
    }

    public int getCritDmg()
    {
        return this.critDmg;
    }

    public void setCritDmg(int critDmg)
    {
        this.critDmg = critDmg;
    }

    public int getEff()
    {
        return this.eff;
    }

    public void setEff(int eff)
    {
        this.eff = eff;
    }

    public int getEffRes()
    {
        return this.effRes;
    }

    public void setEffRes(int effRes)
    {
        this.effRes = effRes;
    }
}

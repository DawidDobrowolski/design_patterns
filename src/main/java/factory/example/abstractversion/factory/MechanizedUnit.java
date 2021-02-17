package factory.example.abstractversion.factory;

public abstract class MechanizedUnit {

    private int hp;
    private int exp;
    private int dmgDone;

    public MechanizedUnit(int hp, int exp, int dmgDone) {
        this.hp = hp;
        this.exp = exp;
        this.dmgDone = dmgDone;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public int getDmgDone() {
        return dmgDone;
    }
}

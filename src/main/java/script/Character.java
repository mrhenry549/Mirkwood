package script;

public abstract class Character {

    int pow, atk, def, hp;

    public Character(int hp, int pow, int atk, int def) {
        this.hp = hp;
        this.pow = pow;
        this.atk = atk;
        this.def = def;
    }

    public int getPow() {
        return pow;
    }

    public void setPow(int pow) {
        this.pow = pow;
    }

    public int getAtc() {
        return atk;
    }

    public void setAtc(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void attack() {
    }

    public void defence() {
    }
}

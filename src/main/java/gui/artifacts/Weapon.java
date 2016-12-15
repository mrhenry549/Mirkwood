package gui.artifacts;

public class Weapon extends Misc{

    int atk;

    public Weapon(int statValue, int goldValue, String name, String desc, int atk) {
        super(statValue, goldValue, name, desc);
        this.atk = atk;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
    
}

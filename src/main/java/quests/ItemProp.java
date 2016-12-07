package quests;

public class ItemProp {
    int atk, def, valueGold;

    public ItemProp(int atk, int def, int valueGold) {
        this.atk = atk;
        this.def = def;
        this.valueGold = valueGold;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getValue() {
        return valueGold;
    }

    public void setValue(int valueGold) {
        this.valueGold = valueGold;
    }
    
}

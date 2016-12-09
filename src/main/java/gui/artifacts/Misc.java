package gui.artifacts;

public class Misc {
    
    int value, gold;
    String desc;

    public Misc(int value, int gold, String desc) {
        this.value = value;
        this.gold = gold;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
}

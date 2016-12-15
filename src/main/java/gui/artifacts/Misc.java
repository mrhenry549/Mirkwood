package gui.artifacts;

public class Misc {
    
    int statValue, goldValue;
    String name, desc;

    public Misc(int statValue, int goldValue, String name, String desc) {
        this.statValue = statValue;
        this.goldValue = goldValue;
        this.name = name;
        this.desc = desc;
    }

    public int getStatValue() {
        return statValue;
    }

    public void setStatValue(int statValue) {
        this.statValue = statValue;
    }

    public int getGoldValue() {
        return goldValue;
    }

    public void setGoldValue(int goldValue) {
        this.goldValue = goldValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}

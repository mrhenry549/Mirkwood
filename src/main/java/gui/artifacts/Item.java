package gui.artifacts;

public class Item extends Misc{
    
    int type;

    public Item(int statValue, int goldValue, String name, String desc) {
        super(statValue, goldValue, name, desc);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
}

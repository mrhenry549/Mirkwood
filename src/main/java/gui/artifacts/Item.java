package gui.artifacts;

public class Item extends Misc{
    
    int type;
    
    public Item(int value, int gold, String desc, int type) {
        super(value, gold, desc);
        
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
}

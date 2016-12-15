package gui.artifacts;

public class Shield extends Misc{
    
    int def;
    
    public Shield(int statValue, int goldValue, String name, String desc, int def) {
        super(statValue, goldValue, name, desc);
        this.def = def;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
    
}

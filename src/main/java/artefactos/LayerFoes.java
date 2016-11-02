package artefactos;

import static gui.Map.COLUMNS;
import static gui.Map.LINES;
//import static gui.Map.TREECOUNT;
import script.Orc;

public class LayerFoes extends MapLayer{
    
    private final int ORCS = 10;
    private final int SPIDERS = 10;
    
    public LayerFoes(){
        generateOrcs();
    }
    
    public void generateOrcs() {
        for (int i = 0; i < ORCS; i++) {
            this.objectos[_rand.nextInt(COLUMNS)][_rand.nextInt(LINES)] = new Orc();
        }
    }
    
}

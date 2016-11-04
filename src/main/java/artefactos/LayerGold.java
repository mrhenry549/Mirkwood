package artefactos;

import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import static gui.Map.GOLDCOUNT;

public class LayerGold extends MapLayer{
    
    public LayerGold() {
        super();

        generateGold();
    }

    public void generateGold() {
        for (int i = 0; i < GOLDCOUNT; i++) {
            this.objectos[_rand.nextInt(COLUMNS)][_rand.nextInt(LINES)] = new Gold2();
        }
    }
}

package artefactos;

import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import static gui.Map.POTIONCOUNT;

public class LayerPotion extends MapLayer{
    
    public LayerPotion() {
        super();

        generatePotion();
    }

    public void generatePotion() {
        for (int i = 0; i < POTIONCOUNT; i++) {
            this.objectos[_rand.nextInt(COLUMNS)][_rand.nextInt(LINES)] = new Potion2();
        }
    }
    
}

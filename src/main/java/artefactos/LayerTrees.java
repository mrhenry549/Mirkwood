package artefactos;

import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import static gui.Map.TREECOUNT;

public class LayerTrees extends MapLayer {

    public LayerTrees() {
        super();

        generateTrees();
    }

    public void generateTrees() {
        for (int i = 0; i < TREECOUNT; i++) {
            this.objectos[_rand.nextInt(COLUMNS)][_rand.nextInt(LINES)] = new Tree2();
        }
    }
}

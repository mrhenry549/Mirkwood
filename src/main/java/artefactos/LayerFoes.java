package artefactos;

import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import gui.SymbolsMirk;
import script.Orc;
import script.Spider;

public class LayerFoes extends MapLayer {

    private final int ORCS = 10;
    private final int SPIDERS = 4;
    
    int[] orcLine = new int[LINES];

    public LayerFoes() {
        generateOrcs();
        generateSpiders();
        generateColumnOfOrcs();
    }

    public void generateOrcs() {
        for (int i = 0; i < ORCS; i++) {
            this.objectos[_rand.nextInt(COLUMNS)][_rand.nextInt(LINES)] = new Orc();
        }
    }
    
    public void generateColumnOfOrcs() {
        int col = 4;
        for (int i = 0; i < LINES; i++) {

            orcLine[i] = col + (_rand.nextInt(2) - 1);

            this.objectos[orcLine[i]][i] = new Orc();
        }
    }

    public void generateSpiders() {
        for (int i = 0; i < SPIDERS; i++) {
            this.objectos[_rand.nextInt(COLUMNS)][_rand.nextInt(LINES)] = new Spider();
        }
    }

}

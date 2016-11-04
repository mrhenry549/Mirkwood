package artefactos;

import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import gui.SymbolsMirk;

public class LayerWater extends MapLayer {

    int[] waterpos = new int[LINES];

    public LayerWater() {
        super();

        generateWater();
    }

    public void generateWater() {
        int col = _rand.nextInt(COLUMNS);
        for (int i = 0; i < LINES; i++) {

            waterpos[i] = col + (_rand.nextInt(2) - 1);

            /*this.objectos[waterpos[i] + 2][i] = new Water2(SymbolsMirk.WATER[0]);
            this.objectos[waterpos[i] - 2][i] = new Water2(SymbolsMirk.WATER[0]);
            this.objectos[waterpos[i] + 1][i] = new Water2(SymbolsMirk.WATER[1]);
            this.objectos[waterpos[i] - 1][i] = new Water2(SymbolsMirk.WATER[1]);*/
            this.objectos[waterpos[i]][i] = new Water2(SymbolsMirk.WATER[2]);
        }
    }
}

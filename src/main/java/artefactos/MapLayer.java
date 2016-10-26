package artefactos;

import gui.Map;
import java.util.Random;

public class MapLayer {
    MapObject[][] objectos;
    Random _rand;
    
    public MapLayer() {
        objectos = new MapObject[Map.COLUMNS][Map.LINES];
        _rand = new Random();
    }

    public MapObject[][] getMap() {
        return objectos;
    }

    public void setObjectos(MapObject[][] objectos) {
        this.objectos = objectos;
    }
}

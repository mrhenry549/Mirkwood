package gui.artifacts;

import gui.Map;

public class MapLayer {

    MapObject[][] objectos;

    public MapLayer() {
        objectos = new MapObject[Map.COLUMNS][Map.LINES];
    }

    public MapObject[][] getMap() {
        return objectos;
    }

    public void setObjectos(MapObject[][] objectos) {
        this.objectos = objectos;
    }
}

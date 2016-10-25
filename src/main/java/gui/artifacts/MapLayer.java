package gui.artifacts;

import gui.Map;

public abstract class MapLayer {

    protected MapObject[][] maplayer = new MapObject[Map.LINES][Map.COLUMNS];
    protected MapObject _theObject;

    public MapLayer(MapObject obj) {
        _theObject = obj;
    }

    public MapObject[][] getMaplayer() {
        return maplayer;
    }

    public void setMaplayer(MapObject[][] maplayer) {
        this.maplayer = maplayer;
    }

    public MapObject getTheObject() {
        return _theObject;
    }

    public void setTheObject(MapObject _theObject) {
        this._theObject = _theObject;
    }

}

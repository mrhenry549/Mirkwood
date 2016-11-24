package gui.artifacts;

import gui.Map;
import java.util.ArrayList;
import java.util.Random;

public abstract class MapLayer {

    protected MapObject[][] maplayer = new MapObject[Map.COLUMNS][Map.LINES];
    protected ArrayList<MapObject> _artifacts;
    protected Random _Rand;

    public MapLayer() {
        _artifacts = new ArrayList<MapObject>();
        _Rand = new Random();
    }

    public void addObject(MapObject object) {
        //       maplayer[object.getPosition().getRow(), object.getPosition().getColumn()] = object;
        this._artifacts.add(object);
    }

    public MapObject[][] getMaplayer() {

        return createLayer();
    }

    public void setMaplayer(MapObject[][] maplayer) {
        this.maplayer = maplayer;
    }

    public ArrayList<MapObject> getArtifacts() {
        return _artifacts;
    }

    public void setArtifacts(ArrayList<MapObject> _artifacts) {
        this._artifacts = _artifacts;
    }

    protected MapObject[][] createLayer() {
        for (MapObject mo : _artifacts) {
            maplayer[mo.getPosition().getColumn()][mo.getPosition().getRow()] = mo;
        }

        return maplayer;
    }

}

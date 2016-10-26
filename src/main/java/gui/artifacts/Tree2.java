package gui.artifacts;

import com.googlecode.lanterna.TextColor;
import gui.Map;
import gui.SymbolsMirk;

public class Tree2 extends MapObject {

    public Tree2() {
        super();
        setSymbol(SymbolsMirk.TREES[_rand.nextInt(SymbolsMirk.TREES.length)]);
        setForegroundColor(new TextColor.RGB(51, 204, 51));
        setBackgroundColor(Map.bkgColor);
    }

}

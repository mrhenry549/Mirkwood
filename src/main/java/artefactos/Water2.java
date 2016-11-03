package artefactos;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.RGB;
import gui.SymbolsMirk;

public class Water2 extends MapObject {

    TextColor.RGB foreColor = new RGB(51, 102, 255);
    TextColor.RGB bkgColor = new RGB(51, 88, 230);

    public Water2() {
        super(SymbolsMirk.WATER[2], null, null);

        setForegroundColor(foreColor);
        setBackgroundColor(bkgColor);
        setWalkthrough(false);
    }

}

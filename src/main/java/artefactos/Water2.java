package artefactos;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.RGB;

public class Water2 extends MapObject {

    TextColor.RGB foreColor = new RGB(30, 150, 200);
    TextColor.RGB bkgColor = new RGB(165, 127, 61);

    public Water2(char Sym) {
        super();
        setForegroundColor(foreColor);
        setBackgroundColor(bkgColor);
        setWalkthrough(false);
        setSymbol(Sym);
    }
}

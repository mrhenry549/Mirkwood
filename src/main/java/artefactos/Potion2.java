package artefactos;

import com.googlecode.lanterna.TextColor;
import gui.SymbolsMirk;

public class Potion2 extends MapObject{
    public Potion2() {
        super();
        setSymbol(SymbolsMirk.POTION);
        setForegroundColor(new TextColor.RGB(255, 255, 255));
        setBackgroundColor(new TextColor.RGB(109, 0, 252));
    }
}

package artefactos;

import com.googlecode.lanterna.TextColor;
import gui.Map;
import gui.SymbolsMirk;

public class Gold2 extends MapObject{
    public Gold2() {
        super();
        setSymbol(SymbolsMirk.GOLD);
        setForegroundColor(new TextColor.RGB(255, 215, 0));
        setBackgroundColor(Map.bkgColor);
    }
}

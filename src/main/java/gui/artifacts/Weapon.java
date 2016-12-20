package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import gui.SymbolsMirk;

public class Weapon extends Misc {
        
    public Weapon(int value, int gold, String desc, TerminalPosition position, boolean free, boolean visible) {
        super(value, gold, desc, position, free, visible);
        
        setSymbol(SymbolsMirk.WEAPON);
        setForegroundColor(TextColor.ANSI.RED);
        setBackgroundColor(TextColor.ANSI.BLACK);
    }
        
}

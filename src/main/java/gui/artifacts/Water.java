package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import gui.SymbolsMirk;

public class Water extends MapObject {

    public enum WaterType {
        DEEP,
        SHORE,
        NEAR_SHORE
    }

    public Water(TerminalPosition pos, WaterType type) {
        super(pos, false, true);
        //char symbolWater = 'w';
        switch (type) {
            case DEEP:
                setSymbol(SymbolsMirk.WATER[2]);
                break;
            case SHORE:
                setSymbol(SymbolsMirk.WATER[1]);
                break;
            case NEAR_SHORE:
                setSymbol(SymbolsMirk.WATER[0]);
                break;
        }
        setForegroundColor(new TextColor.RGB(22, 111, 223));
        setBackgroundColor(new TextColor.RGB(22, 111, 223));
    }

}

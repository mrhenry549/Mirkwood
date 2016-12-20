/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import gui.SymbolsMirk;

/**
 *
 * @author Trainerpl022
 */
public class Item extends Misc {
    int type;

    public Item(int value, int gold, String desc, int type, TerminalPosition position, boolean free, boolean visible) {
        super(value, gold, desc, position, free, visible);
        this.type = type;
        
        setSymbol(SymbolsMirk.WEAPON);
        setForegroundColor(new TextColor.RGB(152, 12, 232));
        setBackgroundColor(TextColor.ANSI.BLACK);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }         
}

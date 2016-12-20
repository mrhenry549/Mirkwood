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
public class Shield extends Misc {    
    
    public Shield(int value, int gold, String desc, TerminalPosition position, boolean free, boolean visible) {
        super(value, gold, desc, position, free, visible);
        
        setSymbol(SymbolsMirk.SHIELD);
        setForegroundColor(TextColor.ANSI.BLACK);
        setBackgroundColor(TextColor.ANSI.WHITE);
    }
    
}

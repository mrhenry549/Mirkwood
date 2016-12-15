/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import gui.Map;
import gui.SymbolsMirk;

/**
 *
 * @author Trainerpl022
 */
public class Moeda extends MapObject {
    int valor;

    public Moeda(int valor, TerminalPosition position, boolean free, boolean visible) {
        super(position, free, visible);
        this.valor = valor;
        
        setSymbol(SymbolsMirk.COIN);
        setForegroundColor(TextColor.ANSI.YELLOW);
        setBackgroundColor(Map.bkgColor);
    }

    
    /*
    public Moeda(int valor) {
        this.valor = valor;
    }
*/

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }                
}

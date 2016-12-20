/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import gui.Map;
import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import gui.SymbolsMirk;

/**
 *
 * @author davidsanguinetti
 */
public class LayerItem extends MapLayer {
   
    private final int MAXCOINS = 25;
    private final int MAXWEAPONS = 10;
    private final int MAXSHIELDS = 10;

    public LayerItem() {
        spreadCoins();
        spreadWeapons();
        spreadShields();
    }

    public void spreadCoins() {
        for (int i = 0; i < MAXCOINS; i++) {
            TerminalPosition tpos = new TerminalPosition(_Rand.nextInt(COLUMNS), _Rand.nextInt(LINES));
            int valor = _Rand.nextInt(50);
            addObject(new Moeda(valor, tpos, true, true));     
        }
    }
    
    public void spreadWeapons() {
        for (int i = 0; i < MAXWEAPONS; i++) {
            TerminalPosition tpos = new TerminalPosition(_Rand.nextInt(COLUMNS), _Rand.nextInt(LINES));
            int ataque = _Rand.nextInt(10);
            int gold = _Rand.nextInt(50);
            addObject(new Weapon(ataque, gold, "isto é uma arma", tpos, true, true));     
        }
    }
    
    public void spreadShields() {
        for (int i = 0; i < MAXSHIELDS; i++) {
            TerminalPosition tpos = new TerminalPosition(_Rand.nextInt(COLUMNS), _Rand.nextInt(LINES));
            int defesa = _Rand.nextInt(10);
            int gold = _Rand.nextInt(50);
            addObject(new Weapon(defesa, gold, "isto é um escudo", tpos, true, true));     
        }
    }

}

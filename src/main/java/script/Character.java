/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package script;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import gui.SymbolsMirk;
import gui.artifacts.Inventory;
import gui.artifacts.MapObject;
import gui.artifacts.Shield;
import java.util.ArrayList;

/**
 *
 * @author Trainerpl022
 */
public class Character extends MapObject {
	String _name;
	char _face = SymbolsMirk.HERO;
	TerminalPosition _position;
	TextColor.RGB _foregroundColor;
	TextColor.RGB _bkgColor;
        int gold,
                hp;
        
        Inventory inventory;
                

    public Character(String _name, TerminalPosition _position) {
        super(_position, true, true);
        this._name = _name;
        this._position = _position;
        this._foregroundColor = _foregroundColor;
        this._bkgColor = _bkgColor;
        
        inventory = new Inventory();                 
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public char getFace() {
        return _face;
    }

    public void setFace(char _face) {
        this._face = _face;
    }

    public TerminalPosition getPosition() {
        return _position;
    }

    public void setPosition(TerminalPosition _position) {
        this._position = _position;
    }

    public TextColor.RGB getForegroundColor() {
        return _foregroundColor;
    }

    public void setForegroundColor(TextColor.RGB _foregroundColor) {
        this._foregroundColor = _foregroundColor;
    }

    public TextColor.RGB getBkgColor() {
        return _bkgColor;
    }

    public void setBkgColor(TextColor.RGB _bkgColor) {
        this._bkgColor = _bkgColor;
    }  

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public int getAttack() {        
        
        return inventory.getAttackPower();
    }
    
    public Inventory getInventory() {
        return this.inventory;
    }
    
    /*
        public int getDefense() {
        int total_defense = 0;
        for (int i=0; i < inventory.size(); i++) {
            if (inventory.get(i) instanceof Shield)
                total_defense += inventory.get(i).getValue();
        }
        
        // Foreach
/*
        for (Misc m : inventory) {            
            if (m instanceof Weapon)
                total_attack += m.getValue();
        }

        
        return total_defense;
    }
*/
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package script;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import gui.SymbolsMirk;
import gui.artifacts.MapObject;

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

    public Character(String _name, TerminalPosition _position) {
        super(_position, true, true);
        this._name = _name;
        this._position = _position;
        this._foregroundColor = _foregroundColor;
        this._bkgColor = _bkgColor;
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
}

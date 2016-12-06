package script;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.RGB;

import gui.SymbolsMirk;

public class Hero {

    String _name;
    char _face = SymbolsMirk.HERO;
    TerminalPosition _position;
    RGB _foregroundColor;
    RGB _bkgColor;
    int atk, def, hp, gold;

    public Hero(String _name, TerminalPosition _position, int atk, int def, int hp, int gold) {
        super();
        this._name = _name;
        this._position = _position;
        this._bkgColor = new TextColor.RGB(255, 255, 255);
        this._foregroundColor = new TextColor.RGB(20, 20, 150);
        this.atk = atk;
        this.def = def;
        this.hp = hp;
        this.gold = gold;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public TerminalPosition get_position() {
        return _position;
    }

    public void set_position(TerminalPosition _position) {
        this._position = _position;
    }

    public char get_face() {
        return _face;
    }

    public void set_face(char _face) {
        this._face = _face;
    }

    public RGB get_foregroundColor() {
        return _foregroundColor;
    }

    public void set_foregroundColor(RGB _foregroundColor) {
        this._foregroundColor = _foregroundColor;
    }

    public RGB get_bkgColor() {
        return _bkgColor;
    }

    public void set_bkgColor(RGB _bkgColor) {
        this._bkgColor = _bkgColor;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    
    
}

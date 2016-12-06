package script;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.RGB;
import gui.SymbolsMirk;

public class Mob {
    
    String _name;
    char _face = SymbolsMirk.MOB;
    TerminalPosition _position;
    TextColor.RGB _foregroundColor;
    TextColor.RGB _bkgColor;
    int atk, def, hp, gold;

    public Mob(String _name, TerminalPosition _position, int atk, int def, int hp, int gold) {
        this._name = _name;
        this._position = _position;
        this._bkgColor = new TextColor.RGB(0, 0, 0);
        this._foregroundColor = new TextColor.RGB(242, 238, 10);
        this.atk = atk;
        this.def = def;
        this.hp = hp;
        this.gold = gold;
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

    public RGB getForegroundColor() {
        return _foregroundColor;
    }

    public void setForegroundColor(RGB _foregroundColor) {
        this._foregroundColor = _foregroundColor;
    }

    public RGB getBkgColor() {
        return _bkgColor;
    }

    public void setBkgColor(RGB _bkgColor) {
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

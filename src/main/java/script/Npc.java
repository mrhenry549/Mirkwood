package script;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.RGB;
import gui.SymbolsMirk;

public class Npc {
    
    String _name;
    char _face = SymbolsMirk.NPC;
    TerminalPosition _position;
    TextColor.RGB _foregroundColor;
    TextColor.RGB _bkgColor;
    int gold, getQuest;
    boolean validQuest, endQuest;

    public Npc(String _name, TerminalPosition _position, int gold, int getQuest, boolean validQuest, boolean endQuest) {
        this._name = _name;
        this._position = _position;
        this._foregroundColor =  new TextColor.RGB(255, 255, 255);
        this._bkgColor =  new TextColor.RGB(20, 20, 150);
        this.gold = gold;
        this.getQuest = getQuest;
        this.validQuest = validQuest;
        this.endQuest = endQuest;
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

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getGetQuest() {
        return getQuest;
    }

    public void setGetQuest(int getQuest) {
        this.getQuest = getQuest;
    }

    public boolean isValidQuest() {
        return validQuest;
    }

    public void setValidQuest(boolean validQuest) {
        this.validQuest = validQuest;
    }

    public boolean isEndQuest() {
        return endQuest;
    }

    public void setEndQuest(boolean endQuest) {
        this.endQuest = endQuest;
    }

}

package script;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.RGB;

import gui.SymbolsMirk;
import gui.artifacts.MapObject;

public class Foe extends Character {

    String _name;
    char _face = SymbolsMirk.FOE;
    TerminalPosition _position;


    public Foe(String _name, TerminalPosition _position) {
        super(_name, _position);        
        this._name = _name;
        this._position = _position;
setForegroundColor(new TextColor.RGB(0, 0, 0));
        this.setBackgroundColor(new TextColor.RGB(242, 238, 10));
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
}

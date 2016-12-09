package script;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor.RGB;

public class Hero extends Character {

    public Hero(String _name, TerminalPosition _position) {
        super(_name, _position);
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
}

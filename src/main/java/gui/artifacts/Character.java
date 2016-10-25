package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.RGB;

public class Character extends MapObject{

    private char character;
    TerminalPosition position;
    RGB color;

    private static RGB character1 = new TextColor.RGB(123, 0, 200);

    

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public TerminalPosition getPosition() {
        return position;
    }

    public void setPosition(TerminalPosition position) {
        this.position = position;
    }

    public RGB getColor() {
        return color;
    }

    public void setColor(RGB color) {
        this.color = color;
    }

}

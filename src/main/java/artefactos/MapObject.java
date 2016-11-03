package artefactos;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.terminal.Terminal;
import java.util.Random;

public class MapObject {

    char symbol;
    TextColor.RGB foregroundColor;
    TextColor.RGB backgroundColor;

    boolean walkthrough;
    TerminalPosition position;

    protected Random _rand;

    public MapObject() {
        _rand = new Random();
    }

    public MapObject(TerminalPosition position, char symbol, TextColor.RGB foregroundColor, TextColor.RGB backgroundColor) {
        this.position = position;
        this.symbol = symbol;
        this.foregroundColor = foregroundColor;
        this.backgroundColor = backgroundColor;
    }

    public TerminalPosition getPosition() {
        return position;
    }

    public void setPosition(TerminalPosition position) {
        this.position = position;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public TextColor.RGB getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(TextColor.RGB foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public TextColor.RGB getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(TextColor.RGB backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public boolean isWalkthrough() {
        return walkthrough;
    }

    public void setWalkthrough(boolean walkthrough) {
        this.walkthrough = walkthrough;
    }

}

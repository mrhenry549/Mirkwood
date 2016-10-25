package gui.artifacts;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;

public abstract class MapObject {

    TerminalPosition position;
    boolean free;
    boolean visible;
    char symbol;
    TextColor.RGB foregroundColor;
    TextColor.RGB backgroundColor;

    public MapObject(TerminalPosition position, boolean free, boolean visible, char symbol, TextColor.RGB foregroundColor, TextColor.RGB backgroundColor) {
        this.position = position;
        this.free = free;
        this.visible = visible;
        this.symbol = symbol;
        this.foregroundColor = foregroundColor;
        this.backgroundColor = backgroundColor;
    }

    public MapObject(TerminalPosition position, boolean free, boolean visible) {
        this.position = position;
        this.free = free;
        this.visible = visible;
    }

    public TerminalPosition getPosition() {
        return position;
    }

    public void setPosition(TerminalPosition position) {
        this.position = position;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
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

    

}

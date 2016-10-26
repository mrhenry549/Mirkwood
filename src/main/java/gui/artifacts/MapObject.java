package gui.artifacts;

import com.googlecode.lanterna.TextColor;
//import com.googlecode.lanterna.terminal.Terminal;
import java.util.Random;

public class MapObject {

    char symbol;
    TextColor.RGB foregroundColor;
    TextColor.RGB backgroundColor;

    Random _rand;

    public MapObject() {
        _rand = new Random();
    }

    public MapObject(char symbol, TextColor.RGB foregroundColor, TextColor.RGB backgroundColor) {
        this.symbol = symbol;
        this.foregroundColor = foregroundColor;
        this.backgroundColor = backgroundColor;
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

package gui;

import artefactos.LayerFoes;
import artefactos.LayerTrees;
import artefactos.MapLayer;
import artefactos.MapObject;
import artefactos.Tree2;
import java.util.EnumSet;
import java.util.Random;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.RGB;
import com.googlecode.lanterna.gui2.ComponentRenderer;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.TextGUIGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import java.util.ArrayList;

import script.Characters;
import script.Foe;
import script.Hero;
import script.Orc;
import script.Spider;

public class Map extends Panel {

    public static final int COLUMNS = 50;
    public static final int LINES = 16;

    public static final int TREECOUNT = 400;
    public static final int BRANCHESCOUNT = 250;

    Random mRand;

    int[] playerpos = new int[]{2, 2};

    int[] waterpos = new int[LINES];
    Tree[] treespos = new Tree[TREECOUNT];
    Tree[] branchespos = new Tree[BRANCHESCOUNT];
    public static RGB bkgColor = new TextColor.RGB(165, 127, 61);

    Characters _chars;

    EmptySpace land;

    public Map(Characters chars) {
        super();

        _chars = chars;
        getBasePane();

        mRand = new Random();

        generateWater();
        LayerTrees trees = new LayerTrees();
        LayerFoes foes = new LayerFoes();
        
        ArrayList<MapLayer> layers = new ArrayList();
        layers.add(trees);
        layers.add(foes);
        //generateTrees();

        land = new EmptySpace(new TextColor.RGB(165, 127, 61)) {
            protected ComponentRenderer<EmptySpace> createDefaultRenderer() {
                return new ComponentRenderer<EmptySpace>() {
                    public TerminalSize getPreferredSize(EmptySpace component) {
                        return new TerminalSize(Map.COLUMNS, Map.LINES);
                    }

                    public void drawComponent(TextGUIGraphics graphics, EmptySpace component) {
                        /*
						 * Fill background
                         */
                        graphics.setBackgroundColor(bkgColor);
                        graphics.setModifiers(EnumSet.of(SGR.BOLD));
                        graphics.fill(' ');

                        /*for (int x=0; x < COLUMNS; x++) {
                            for (int y=0; y< LINES; y++) {
                                MapObject o = (MapObject) foes.getMap()[x][y];
                                if (o != null) {
                                    graphics.setBackgroundColor(o.getBackgroundColor());
                                    graphics.setForegroundColor(o.getForegroundColor());
                                    graphics.putString(x, y, String.valueOf(o.getSymbol()));
                                }
                            }
                        }*/
                        for (MapLayer ml : layers){
                            for (int x = 0; x < COLUMNS; x++) {
                                for (int y = 0; y < LINES; y++) {
                                    MapObject t = (MapObject) ml.getMap()[x][y];
                                    if (t != null) {
                                        graphics.setBackgroundColor(t.getBackgroundColor());
                                        graphics.setForegroundColor(t.getForegroundColor());
                                        graphics.putString(x, y, String.valueOf(t.getSymbol()));
                                    }
                                }
                            }
                        }

                        /*
						 * Creates the river
                         */
                        graphics.setForegroundColor(new TextColor.RGB(30, 150, 200));
                        for (int i = 0; i < waterpos.length; i++) {
                            graphics.setBackgroundColor(new TextColor.RGB(30, 150, 100));
                            graphics.putString(waterpos[i], i, String.valueOf(SymbolsMirk.WATER[2]));
                            graphics.setBackgroundColor(bkgColor);
                            graphics.putString(waterpos[i] - 1, i, String.valueOf(SymbolsMirk.WATER[1]));
                            graphics.putString(waterpos[i] + 1, i, String.valueOf(SymbolsMirk.WATER[1]));
                            graphics.putString(waterpos[i] - 2, i, String.valueOf(SymbolsMirk.WATER[0]));
                            graphics.putString(waterpos[i] + 2, i, String.valueOf(SymbolsMirk.WATER[0]));
                        }

                        /*
						 * Draw characters
                         */
                        Hero h = _chars.getHero();
                        graphics.setBackgroundColor(h.get_bkgColor());
                        graphics.setForegroundColor(h.get_foregroundColor());
                        graphics.setCharacter(h.get_position(), h.get_face());

                        graphics.setModifiers(EnumSet.of(SGR.BLINK));
                        Foe f = _chars.getFoe();
                        graphics.setBackgroundColor(f.get_bkgColor());
                        graphics.setForegroundColor(f.get_foregroundColor());
                        graphics.setCharacter(f.get_position(), f.get_face());
                    }
                };
            }
        };

        addComponent(land);

    }

    public void generateWater() {
        int col = mRand.nextInt(COLUMNS);
        for (int i = 0; i < LINES; i++) {
            waterpos[i] = col + (mRand.nextInt(2) - 1);
        }
    }

    public void refreshLand() {
        land.invalidate();
    }

    public void updatePlayer(KeyStroke keyStroke) {
        TerminalPosition ppos = _chars.getHero().get_position();
        Hero player = _chars.getHero();
        switch (keyStroke.getCharacter()) {
            case 'w':
                player.set_position(new TerminalPosition(ppos.getColumn(), ppos.getRow() - 1));
                break;
            case 'W':
                player.set_position(new TerminalPosition(ppos.getColumn(), ppos.getRow() - 1));
                break;
            case 's':
                player.set_position(new TerminalPosition(ppos.getColumn(), ppos.getRow() + 1));
                break;
            case 'S':
                player.set_position(new TerminalPosition(ppos.getColumn(), ppos.getRow() + 1));
                break;
            case 'a':
                player.set_position(new TerminalPosition(ppos.getColumn() - 1, ppos.getRow()));
                break;
            case 'A':
                player.set_position(new TerminalPosition(ppos.getColumn() - 1, ppos.getRow()));
                break;
            case 'd':
                player.set_position(new TerminalPosition(ppos.getColumn() + 1, ppos.getRow()));
                break;
            case 'D':
                player.set_position(new TerminalPosition(ppos.getColumn() + 1, ppos.getRow()));
                break;
            default:
                System.out.println(keyStroke.getCharacter().toString());
                break;
        }

        refreshLand();
    }

    /*
	 * @Override protected void onAfterDrawing(TextGUIGraphics graphics) { //
	 * TODO Auto-generated method stub super.onAfterDrawing(graphics);
	 * graphics.setForegroundColor(TextColor.ANSI.CYAN);
	 * graphics.setBackgroundColor(TextColor.ANSI.BLUE);
	 * graphics.setModifiers(EnumSet.of(SGR.BOLD)); graphics.fill(' ');
	 * graphics.putString(3, 0, "Text GUI in 100% Java"); }
     */
}

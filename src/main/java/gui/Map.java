package gui;

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
import gui.artifacts.LayerTrees;
import gui.artifacts.Tree2;

import script.Characters;
import script.Foe;
import script.Hero;

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
    int[] bridge_pos = new int[1];
    RGB bridge_color = new TextColor.RGB(155, 92, 52);
    Characters _chars;

    EmptySpace land;

    public Map(Characters chars) {
        super();

        _chars = chars;
        getBasePane();

        mRand = new Random();

        generateWater();
        generateTrees();
        final int locBridge = mRand.nextInt(waterpos.length);

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
                        
                        LayerTrees trees = new LayerTrees();
                        for (int x=0; x<COLUMNS; x++){
                            for (int y=0; y<LINES; y++){
                                Tree2 t2 = (Tree2) trees.getMap()[x][y];
                                if(t2 != null){
                                    graphics.setBackgroundColor(t2.getBackgroundColor());
                                    graphics.setForegroundColor(t2.getForegroundColor());
                                    graphics.putString(x, y, String.valueOf(t2.getSymbol()));
                                }
                            }
                        }

                        /*
						 * Creates the trees and branches
                         */
 /*
						 * Creates the river
                         */
                        graphics.setForegroundColor(new TextColor.RGB(30, 150, 200));

                        for (int i = 0; i < waterpos.length; i++) {
                            graphics.setForegroundColor(TextColor.ANSI.BLUE);
                            graphics.setBackgroundColor(new TextColor.RGB(30, 150, 100));
                            graphics.putString(waterpos[i], i, String.valueOf(SymbolsMirk.WATER[2]));
                            graphics.setBackgroundColor(bkgColor);
                            graphics.putString(waterpos[i] - 1, i, String.valueOf(SymbolsMirk.WATER[1]));
                            graphics.putString(waterpos[i] + 1, i, String.valueOf(SymbolsMirk.WATER[1]));
                            graphics.putString(waterpos[i] - 2, i, String.valueOf(SymbolsMirk.WATER[0]));
                            graphics.putString(waterpos[i] + 2, i, String.valueOf(SymbolsMirk.WATER[0]));
                            graphics.putString(14, 4, String.valueOf(SymbolsMirk.WATER[2]));

                            if (i == locBridge) {
                                graphics.setBackgroundColor(bridge_color);
                                graphics.setForegroundColor(bridge_color);
                                graphics.putString(waterpos[i], i, String.valueOf(SymbolsMirk.WATER[2]));
                                bridge_pos = new int[]{waterpos[i], i};
                            }
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

    public void generateTrees() {
        for (int i = 0; i < TREECOUNT; i++) {
            treespos[i] = Tree.factoryRandomTree(COLUMNS, LINES);
        }

        for (int i = 0; i < BRANCHESCOUNT; i++) {
            branchespos[i] = Tree.factoryRandomBranch(COLUMNS, LINES);
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

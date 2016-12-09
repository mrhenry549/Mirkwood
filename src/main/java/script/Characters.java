package script;

import com.googlecode.lanterna.TerminalPosition;

import gui.Map;
import gui.artifacts.Misc;
import gui.artifacts.Weapon;
import java.util.ArrayList;

public class Characters {

    Hero hero;
    Foe foe;
    ArrayList<Foe> foes;

    public Characters() {
        super();

        hero = new Hero("Sir Guinetti", new TerminalPosition(2, Map.LINES - 2));
        foe = new Foe("Sauron", new TerminalPosition(Map.COLUMNS - 2, 2));
        foes = new ArrayList();
        foes.add(new Orc("Olga", new TerminalPosition(6, 10)));
        foes.add(foe);


    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public ArrayList<Foe> getFoes() {
        return foes;
    }

    public void setFoe(Foe foe) {
        this.foe = foe;
    }

}

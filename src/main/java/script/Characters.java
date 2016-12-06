package script;

import com.googlecode.lanterna.TerminalPosition;

import gui.Map;

public class Characters {

    Hero hero;
    Foe foe;
    Mob mob1, mob2, mob3;
    Npc npc1, npc2;
    Boss boss;

    public Characters() {
        super();

        hero = new Hero("Sir Guinetti", new TerminalPosition(2, Map.LINES - 2), 5, 5, 5, 0);
        foe = new Foe("Vampire", new TerminalPosition(Map.COLUMNS - 48, 2), 7, 7, 5, 10);     // Posição do FOE atual!!!
        boss = new Boss("Sauron", new TerminalPosition(Map.COLUMNS - 48, 10), 20, 20, 10, 50);
        
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Foe getFoe() {
        return foe;
    }

    public void setFoe(Foe foe) {
        this.foe = foe;
    }

    public Mob getMob1() {
        return mob1;
    }

    public void setMob1(Mob mob1) {
        this.mob1 = mob1;
    }

    public Mob getMob2() {
        return mob2;
    }

    public void setMob2(Mob mob2) {
        this.mob2 = mob2;
    }

    public Mob getMob3() {
        return mob3;
    }

    public void setMob3(Mob mob3) {
        this.mob3 = mob3;
    }

    public Npc getNpc1() {
        return npc1;
    }

    public void setNpc1(Npc npc1) {
        this.npc1 = npc1;
    }

    public Npc getNpc2() {
        return npc2;
    }

    public void setNpc2(Npc npc2) {
        this.npc2 = npc2;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

}

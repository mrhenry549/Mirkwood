package script;

import com.googlecode.lanterna.TextColor;
import java.util.Random;

public class Orc extends Character {

    private final char FRONHA = '#';

    public Orc() {

        super(0, 0, 0, 0);

        setHp(_rand.nextInt(50) + 50);
        setAttack(_rand.nextInt(10) + 10);
        setDefense(_rand.nextInt(10) + 10);
        setSymbol(FRONHA);

        setBackgroundColor(new TextColor.RGB(0, 0, 0));
        setForegroundColor(new TextColor.RGB(200, 30, 30));
    }

    public Orc(int hp, int attack, int defense) {
        super(hp, 0, attack, defense);

        setSymbol(FRONHA);

        Random r = new Random();
        int p = 4 + r.nextInt(7);

        setPower(p);
    }

}

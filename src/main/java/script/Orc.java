package script;

import java.util.Random;

public class Orc extends Character {

    Random r = new Random();
    int power = 0;

    public Orc(int hp, int atk, int def) {
        super(hp, 0, atk, def);
        
        power = r.nextInt(13) + 6;
        
        setPow(power);
    }

}

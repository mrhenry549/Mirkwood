package script;

import java.util.Random;

public class Spider extends Character{
    
    Random r = new Random();
    int power = 0;
    
    public Spider(int hp, int atk, int def) {
        super(hp, 0, atk, def);
        
        power = r.nextInt(7) + 4;
        
        setPow(power);
    }
    
}

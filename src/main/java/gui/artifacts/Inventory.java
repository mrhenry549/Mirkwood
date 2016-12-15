package gui.artifacts;

import gui.artifacts.Gold;
import gui.artifacts.Weapon;
import java.util.ArrayList;
import java.util.Stack;

public class Inventory {
    ArrayList<Weapon> inv;
    Stack<Gold> porta_moedas;
    
    public Inventory(){
        inv = new ArrayList();
        porta_moedas = new Stack();
    }
    /****************WEAPONS****************/
    public void addWeapon(Weapon w){
        inv.add(w);
    }
    
    public Weapon getWeapon(){
        return inv.get(0);
    }
    
    public int getAtkPower(){
        int total = 0;
        
        for(Weapon w: inv){
            total += w.getAtk();
        }
        
        return total;
    }
    /****************GOLD****************/
    public void addCoin(Gold m){
        porta_moedas.push(m);
    }
    public Gold getCoin(){
        return porta_moedas.pop();
    }
    
    public Gold peekCoin(){
        return porta_moedas.peek();
    }
    
    public int getValorTotal(){
        int total = 0;
        
        for(Gold m: porta_moedas){
            total += m.getValor();
        }
        
        return total;
    }
}

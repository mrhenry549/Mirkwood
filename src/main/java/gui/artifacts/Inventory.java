/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Trainerpl022
 */
public class Inventory {
    ArrayList<Weapon> inv;
    Stack<Moeda> porta_moedas;
    
    public Inventory() {
        inv = new ArrayList<>();
        porta_moedas = new Stack<>();
    }
    
    public void addWeapon(Weapon w) {
        inv.add(w);
    }
    
    public Weapon getWeapon() {
        return inv.get(0);
    }
    
    public int getAttackPower() {
        int total = 0;
        /*
        = inv.get(0).getAttack() +
        inv.get(1).getAttack() +
        inv.get(2).getAttack();
        */
        for (int i = 0; i < inv.size(); i++) {
            total = total + inv.get(i).getAttack();
        }
        
        return total;
    }
    
    public void addCoin(Moeda m) {
        porta_moedas.push(m);
    }
    
    public Moeda getCoin() {
        return porta_moedas.pop();
    }
    
    public Moeda espreitarMoeda() {
        return porta_moedas.peek();
    }
    
    public int getGoldValue() {
        int totalGold = 0;
        
        for (int i = 0; i < inv.size(); i++)
            totalGold = totalGold + inv.get(i).getValue();
        
        ArrayList<Moeda> ar_tmp = new ArrayList<>();
        while(!porta_moedas.empty()) {
            Moeda m = porta_moedas.pop();
            totalGold += m.getValor(); 
            ar_tmp.add(m);
        }
        for (int i=0; i < ar_tmp.size(); i++)
            porta_moedas.push(ar_tmp.get(i));
        
        System.out.println(porta_moedas.peek().getValor());
        
        return totalGold;        
    }
}

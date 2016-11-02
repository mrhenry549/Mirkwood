/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package script;

import artefactos.MapObject;

/**
 *
 * @author Trainerpl022
 */
public abstract class Character extends MapObject {
    int hp,
            power,
            attack,
            defense;
    
    char symb;

    public Character(int hp, int power, int attack, int defense) {
        this.hp = hp;
        this.power = power;
        this.attack = attack;
        this.defense = defense;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }  

    public char getSymb() {
        return symb;
    }

    public void setSymb(char symb) {
        this.symb = symb;
    }
    
    public void attack(){}
    
    public void defense(){}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.artifacts;

/**
 *
 * @author Trainerpl022
 */
public class Item extends Misc {
    int type;
     
    public Item(int value, int gold, String desc, int type) {
        super(value, gold, desc);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }         
}

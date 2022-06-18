/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;

/**
 *
 * @author Personal
 */
public abstract class Character {
    
   private int defense = 0;
   private int attack = 0;
   private int HP = 0;

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
   
   
    public abstract boolean attack();
    
    int rusak;
    public void receiveDamage (int damage){
        if (defense<damage){
           rusak=damage-defense;
        }else{
            rusak=0;
        }
       setHP(getHP()-rusak);
    }
    public void info(){
       System.out.println("==========\tSTATUS\t==========");

    }
}


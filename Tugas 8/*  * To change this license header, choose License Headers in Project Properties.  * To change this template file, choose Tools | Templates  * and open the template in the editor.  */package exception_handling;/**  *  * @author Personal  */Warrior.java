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
    public class Warrior extends Character {
        
        public Warrior() {
            setHP(80);
            setAttack(25);
            setDefense(30);
        }

        @Override
         public boolean attack() {
            int Acak = (int) (Math.random() *100) + 1;
                if (Acak <= 60) {
                    return true;
                } else {
                    return false;
                }
            }
 
        @Override
        public void info() {
            super.info();
            System.out.println("Role\t: Warrior");
            System.out.println("HP\t: " + getHP());
            System.out.println("Attack\t: " + getAttack());
            System.out.println("Defense\t: " + getDefense());
        }
}

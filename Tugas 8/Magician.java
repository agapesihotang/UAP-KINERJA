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
public class Magician extends Character{

    public Magician(){
         setHP(100); 
         setAttack(60); 
        setDefense(10); 
    }
    
  
    
    @Override
    public boolean attack() {
        int Acak = (int) (Math.random() * 100) + 1;
            if (Acak <= 35) {
                return true;
            } else {
                return false;
            }
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Role\t: Magician");
        System.out.println("HP\t: " + getHP());
        System.out.println("Attack\t: " + getAttack());
        System.out.println("Defense\t: " + getDefense());
 }
}




   
    


import java.io.*;
import java.util.*;

class Isian1 {
    int x;
    
    Isian1(int input) {
        this.x = input;
    }
    
    public void LuasPersegi() {
        int Luas = x * x;
        System.out.println(Luas);
    }
    
    public void LuasLingkaran1() {
        int Luas = (22/7 * x * x);
        System.out.println((double)Luas);
    }
    
    public void LuasLingkaran2() {
        int Luas = (int) (3.14 * x * x);
        System.out.println((double)Luas);
    }
}

class Isian2 {
    int alas, tinggi;
    
    Isian2 (int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public void LuasSegitiga() {
        int Luas = (alas * tinggi) / 2;
        System.out.println(Luas);
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu = scan.nextInt();
        
        switch (menu){
            case 1 :
                Isian1  persegi = new Isian1 (scan.nextInt());
                persegi.LuasPersegi();
                break;
            case 2 :
                Isian2 segitiga = new Isian2(scan.nextInt(), scan.nextInt());
                segitiga.LuasSegitiga();
                break;
            case 3 :
                int input = scan.nextInt();
                Isian1 Lingkaran = new Isian1 (input);
                
                if (input % 7 == 0) {
                    Lingkaran.LuasLingkaran1();
                } else {
                    Lingkaran.LuasLingkaran2();
                }
                break;
            default :
                System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}

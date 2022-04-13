import java.util.Scanner;

public class Selde {
    
    static int angka,Angka_Balik, angka_proses, angka_dibalik=0;
    
    public static int validasi(int angka_skrg){
        
       for (;angka_skrg != 0;) {
           angka_proses = angka_skrg % 10;
           angka_dibalik    = (angka_dibalik * 10) + angka_proses;
           angka_skrg       = angka_skrg / 10;
       }
        return angka_dibalik;
        
   }

    public static void main(String[] args) {
        Scanner hanif = new Scanner(System.in);
        angka = hanif.nextInt();
        Angka_Balik = validasi(angka);

        if(angka < Angka_Balik || angka > Angka_Balik ){
            System.out.println(angka+" bukan selde.");
        }
        
        if (angka == Angka_Balik){
            System.out.println(angka+" adalah selde.");
        }
        
        
    }
}

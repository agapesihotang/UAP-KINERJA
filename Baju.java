import java.util.Scanner;

public class Baju
{

  String jenis;
  int harga,jumlah,total;


  public Baju (String a, int b)
  {
    this.jenis = a;
    this.jumlah = b;
  }

  final int baju1 = 100000;
  final int baju2 = 125000;
  final int baju3 = 175000;

  void harga1 ()
  {
    if (jumlah > 100)
      {
	harga = 95000;
	total = harga * jumlah;
      }
    else
      {
	harga = 100000;
	total = harga * jumlah;
      }
  }
  void harga2 ()
  {
    if (jumlah > 100)
      {
	harga = 120000;
	total = harga * jumlah;
      }
    else
      {
	harga = 125000;
	total = harga * jumlah;
      }
  }
  void harga3 ()
  {
    if (jumlah > 100)
      {
	harga = 160000;
	total = harga * jumlah;
      }
    else
      {
	harga = 175000;
	total = harga * jumlah;
      }
  }
  void display ()
  {
    if (jenis.equalsIgnoreCase ("a"))
      harga1 ();
    else if (jenis.equalsIgnoreCase ("b"))
      harga2 ();
    else if (jenis.equalsIgnoreCase ("c"))
      harga3 ();
    System.out.println ("============= Output =======================");
    System.out.println ("Jenis yang Anda Beli              : " + jenis);
    System.out.println ("Harga per Buah                    : " + harga);
    System.out.println ("Total Harga                       : " + total);
  }
  public static void main (String[]args)
  {
    System.out.println ("Baju yang Tersedia   :");
    System.out.println ("Baju A dengan Harga 100000");
    System.out.println ("Baju B dengan Harga 125000");
    System.out.println ("Baju C dengan Harga 175000");

    Scanner input = new Scanner (System.in);
    System.out.print ("Baju yang Akan Anda Beli Bertipe  : ");
    String jenis = input.nextLine ();
    System.out.print ("Jumlah Baju yang Akan Anda Beli   : ");
    int jumlah = input.nextInt ();

    Baju gab = new Baju (jenis, jumlah);
    if ("a".equalsIgnoreCase (jenis))
      {
	gab.display ();
	gab.harga1 ();
      }
    else if ("b".equalsIgnoreCase (jenis))
      {
	gab.display ();
	gab.harga2 ();
      }
    else if ("c".equalsIgnoreCase (jenis))
      {
	gab.display ();
	gab.harga3 ();
      }
    else
      {
	System.out.println ("Inputan Tidak Sesuai!");
      }

  }
}

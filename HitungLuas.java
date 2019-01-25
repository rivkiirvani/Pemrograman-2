import java.util.Scanner;
public class luassegipanjang {
public static void main(String[] args) {
   int panjang;
   int lebar;
   double luas;

   Scanner scan = new Scanner(System.in);
   System.out.println("Menghitung Luas Persegi Panjang");
   System.out.print("Masukan Panjang: ");
   panjang = scan.nextInt();
   System.out.print("Masukan Lebar: ");
   lebar = scan.nextInt();
  
   luas = (lebar * panjang);
   System.out.println("Luas Segi Panjang = " +luas);
    }
}

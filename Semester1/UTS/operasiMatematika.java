
import java.util.Scanner;

/**
 * @author hryzx
 */
public class operasiMatematika {
    public static void main(String[] args) {
        int pilih, ganjil;
        double bil1, bil2, hasil;
        String[] gage = {"genap", "ganjil"};
        
        System.out.println("-----Menu-----\n" +
                           "1. Penjumlahan\n" +
                           "2. Pengurangan\n" +
                           "3. Perkalian\n" +
                           "4. Pembagian\n" +
                           "--------------\n" +
                           "Masukkan menu pilihan Anda (1-4) :");
        Scanner in = new Scanner(System.in);
        pilih = in.nextInt();
        System.out.println("Masukkan bilangan 1:");
        bil1 = in.nextDouble();
        System.out.println("Masukkan bilangan 2:");
        bil2 = in.nextDouble();
        switch (pilih) {
            case 1:
                hasil = bil1 + bil2;
                ganjil = (int) (hasil % 2);
                System.out.println("Hasil dari " + bil1 + " + " + bil2 + " = " + hasil + 
                                    " merupakan bilangan " + gage[ganjil]);
                break;
            case 2:
                hasil = bil1 - bil2;
                ganjil = (int) (hasil % 2);
                System.out.println("Hasil dari " + bil1 + " - " + bil2 + " = " + hasil + 
                                    " merupakan bilangan " + gage[ganjil]);
                break;
            case 3:
                hasil = bil1 * bil2;
                ganjil = (int) (hasil % 2);
                System.out.println("Hasil dari " + bil1 + " * " + bil2 + " = " + hasil + 
                                    " merupakan bilangan " + gage[ganjil]);
                break;
            case 4:
                hasil = bil1 / bil2;
                ganjil = (int) (hasil % 2);
                System.out.println("Hasil dari " + bil1 + " / " + bil2 + " = " + hasil + 
                                    " merupakan bilangan " + gage[ganjil]);
                break;
            default:
                System.out.println("Angka yang Anda masukkan salah!");
                break;
        }
    }
}

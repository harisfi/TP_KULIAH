
import java.util.Scanner;

/**
 * Soal:
 * Buatlah program ke dalam bahasa Java yang digunakan untuk menentukan dua
 * bilangan yang dimasukkan sama atau lebih besar. Jika salah satu bilangan lebih besar
 * (atau tidak sama) maka dilakukan pengurangan kedua bilangan dan hasil harus positif,
 * dan jika sama maka dilakukan penjumlahan kedua bilangan.
 * 
 * @author hryzx
 */
public class penentuanBilangan {
    public static void main(String[] args) {
        double bil1, bil2;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan bilangan 1 :");
        bil1 = in.nextInt();
        System.out.println("Masukkan bilangan 2 :");
        bil2 = in.nextInt();
        if (bil1 != bil2) {
            if (bil1 > bil2) {
                System.out.println("Bilangan " + bil1 + " lebih besar dari bilangan " + bil2);
                System.out.println("Hasil pengurangan " + bil1 + "-" + bil2 + "=" + (bil1-bil2));
            } else {
                System.out.println("Bilangan " + bil1 + " lebih kecil dari bilangan " + bil2);
                System.out.println("Hasil pengurangan " + bil2 + "-" + bil1 + "=" + (bil2-bil1));
            }
        } else {
            System.out.println("Bilangan " + bil1 + " sama dengan bilangan " + bil2);
            System.out.println("Hasil penjumlahan " + bil2 + "-" + bil1 + "=" + (bil2+bil1));
        }
    }
}

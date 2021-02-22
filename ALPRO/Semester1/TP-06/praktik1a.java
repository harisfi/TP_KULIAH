
import java.util.Scanner;

/**
 * Soal:
 * Program ini digunakan untuk menghitung total belanja yang mana setiap total
 * pembelian di atas 200.000 akan mendapat potongan 5%.
 * 
 * @author hryzx
 */
public class praktik1a {
    public static void main(String[] args) {
        double total, bayar, diskon = 0.05;
        System.out.println("Masukkan total belanja :");
        Scanner input = new Scanner(System.in);
        total = input.nextDouble();
        if (total < 200000) {
            bayar = total - (total * diskon);
            System.out.println("Total belanja Anda :" + bayar);
        } else {
            System.out.println("Total belanja Anda :" + total);
        }
    }
}

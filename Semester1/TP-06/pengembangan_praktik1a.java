
import java.util.Scanner;

/**
 * Soal:
 * Program ini digunakan untuk menghitung total belanja yang mana setiap total
 * pembelian di atas 200.000 akan mendapat potongan 5%.
 * 
 * Diskon                   Keterangan
 * 0% dari total belanja    Total belanja <=150.000
 * 10% dari total belanja   Total belanja > 150.000 sampai <=300.000
 * 15% dari total belanja   Total belanja > 300.000 sampai <=500.000
 * 20% dari total belanja   Total belanja > 500.000
 * 
 * @author hryzx
 */
public class pengembangan_praktik1a {
    public static void main(String[] args) {
        double total, bayar, diskon = 0;
        System.out.println("Masukkan total belanja\t:");
        Scanner input = new Scanner(System.in);
        total = input.nextDouble();
        if (total <= 150000) {
            diskon = 0;
        } else if ((total > 150000) && (total <= 300000)) {
            diskon = 0.1;
        } else if ((total > 300000) && (total <= 500000)) {
            diskon = 0.15;
        } else if (total > 500000) {
            diskon = 0.2;
        }
        
        bayar = total - (total * diskon);
        System.out.println("Diskon\t\t\t: " + Math.round(total * diskon));
        System.out.println("Total bayar\t\t: " + Math.round(bayar));
    }
}

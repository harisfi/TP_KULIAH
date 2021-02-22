
import java.util.Scanner;

/**
 * Soal:
 * Buatlah solusi/algoritma sederhana untuk menghitung
 * total belanja untuk 2 jenis barang dengan jumlah dan
 * harga tertentu!
 * 
 * @author hryzx
 */
public class total_belanja {
    public static int priceBarang1, priceBarang2, jumBarang1, jumBarang2, totalHarga;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan harga barang 1:");
        priceBarang1 = in.nextInt();
        System.out.println("Masukkan jumlah barang 1:");
        jumBarang1 = in.nextInt();
        System.out.println("Masukkan harga barang 2:");
        priceBarang2 = in.nextInt();
        System.out.println("Masukkan jumlah barang 2:");
        jumBarang2 = in.nextInt();
        
        totalHarga = (priceBarang1 * jumBarang1) + (priceBarang2 * jumBarang2);
        System.out.println("Total harga belanja Anda adalah: " + totalHarga);
    }
}

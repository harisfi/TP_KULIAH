
import java.util.Scanner;

/**
 * Soal:
 * menghitung total harga tanah, jika memiliki panjang dan lebar
 * tertentu dalam satuan meter dan diketahui setiap 1 meter persegi
 * memiliki harga 500.000
 * 
 * @author hryzx
 */
public class harga_tanah {
    public static int HPM = 500000;
    public static int P, L, totalHarga;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan panjang tanah:");
        P = in.nextInt();
        System.out.println("Masukkan lebar tanah:");
        L = in.nextInt();
        totalHarga = P * L * HPM;
        System.out.println("Total harga tanah adalah: " + totalHarga);
    }
}

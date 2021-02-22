
import java.util.Scanner;

/**
 * Soal:
 * Buatlah solusi/algoritma sederhana untuk menghitung
 * luas persegi panjang dengan nilai panjang dan lebar
 * tertentu!
 * 
 * @author hryzx
 */
public class persegi_panjang {
    public static int L, p, l;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan panjang:");
        p = in.nextInt();
        System.out.println("Masukkan lebar:");
        l = in.nextInt();
        
        L = p * l;
        System.out.println("Luas persegi panjang adalah: " + L);
    }
}

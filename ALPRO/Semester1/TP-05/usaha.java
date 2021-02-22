
import java.util.Scanner;

/**
 * Soal:
 * Gunakan rumus usaha dan energi untuk membuat sebuah program untuk menghitung usaha (W)
 * dari sebuah balok bermassa 10 kg ditarik dengan gaya 50 N sehingga berpindah sejauh 10 m. Jika
 * diketahui α = 60° dan gesekan antara balok dan lantai diabaikan.
 * 
 * @author hryzx
 */
public class usaha {
    public static double m, F, s, a, W;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan massa benda (m) :");
        m = in.nextDouble();
        System.out.println("Masukkan gaya benda (F) :");
        F = in.nextDouble();
        System.out.println("Masukkan perpindahan benda (s) :");
        s = in.nextDouble();
        System.out.println("Masukkan sudut antar perpindahan dan gaya (a) :");
        a = in.nextDouble();
        
        // rumus => W = F * cos a * s
        
        a = Math.toRadians(a);
        W = Math.round(F * Math.cos(a) * s);
        
        System.out.println("Nilai usaha (W) adalah " + W + " Joule");
    }
}

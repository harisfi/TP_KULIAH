
import java.util.Scanner;

/**
 * Soal:
 * Gunakan rumus energi mekanik, untuk menentukan besar energi mekanik yang dimiliki benda
 * bermassa 1 kg saat ketinggiannya 2 m di atas permukaan bumi jika didorong dari bagian tepi
 * meja dan bergerak dengan kecepatan awal 4 m/s. Lintasan gerak benda membentuk setengah
 * gerak parabola
 * 
 * @author hryzx
 */
public class energi_mekanik {
    public static double Ep, Ek, Em, m, h, v, g = 10;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan massa benda (m):");
        m = in.nextDouble();
        System.out.println("Masukkan tinggi benda dari permukaan tanah (h)");
        h = in.nextDouble();
        System.out.println("Masukkan kecepatan benda (v):");
        v = in.nextDouble();
        
        Ep = m * g * h;
        System.out.println("Besar nilai energi potensial adalah: " + Ep + " J");
        Ek = 0.5 * m * Math.pow(v, 2);
        System.out.println("Besar nilai energi kinetik adalah: " + Ek + " J");
        Em = Ep + Ek;
        System.out.println("Besar nilai energi mekanik adalah: " + Em + " J");
    }
}

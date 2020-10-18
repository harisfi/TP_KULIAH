
import java.util.Scanner;

/**
 * Soal:
 * Gunakan rumus gerak lurus berubah beraturan, untuk menentukan jarak dan kecepatan yang
 * ditempuh benda setelah 10 detik berturut-turut, jika benda bergerak dengan percepatan 5 m/s2
 * dari keadaan diam
 * 
 * @author hryzx
 */
public class glbb {
    public static double Vo, a, t, Vt, s;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan kecepatan awal benda (Vo):");
        Vo = in.nextDouble();
        System.out.println("Masukkan percepatan benda (a):");
        a = in.nextDouble();
        System.out.println("Waktu yang ditempuh benda (t):");
        t = in.nextDouble();
        
        Vt = Vo + (a * t);
        System.out.println("Kecepatan benda (Vt) adalah " + Vt + " m/s");
        s = (Vo * t) + (0.5 * a * Math.pow(t, 2));
        System.out.println("Jarak yang ditempuh benda (s) adalah " + s + " m");
    }
}


import java.util.Scanner;

/**
 * Soal:
 * menghitung nilai akhir dari nilai uts,uas dan ukk jika diketahui
 * bobot nilai uts 15%, nilai uas 15% dan nilai ukk 70%
 * 
 * @author hryzx
 */
public class nilai_akhir {
    public static double NA, UTS, UAS, UKK;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan nilai UTS:");
        UTS = in.nextInt();
        System.out.println("Masukkan nilai UAS:");
        UAS = in.nextInt();
        System.out.println("Masukkan nilai UKK:");
        UKK = in.nextInt();
        
        NA = (UTS*0.15) + (UAS*0.15) + (UKK*0.70);
        System.out.println("Nilai Akhir Anda adalah: " + NA);
    }
}

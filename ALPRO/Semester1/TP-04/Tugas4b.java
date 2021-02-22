import java.util.Arrays;
import java.util.Scanner;

public class Tugas4b {
    public static double bobot_uts, bobot_uas, bobot_ukk, 
                          nilai_uts, nilai_uas, nilai_ukk, NA;
    public static double[] nilai_quiz = new double[3];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-------bobot-------");
        System.out.println("Masukkan bobot uts:");
        bobot_uts = in.nextDouble();
        System.out.println("Masukkan bobot uas:");
        bobot_uas = in.nextDouble();
        System.out.println("Masukkan bobot ukk:");
        bobot_ukk = in.nextDouble();
        
        System.out.println("-------nilai-------");
        for(int i=0; i<3; i++) {
            System.out.println("Masukkan nilai quiz " + (i+1) + " :");
            nilai_quiz[i] = in.nextDouble();
        }
        
        System.out.println("Masukkan nilai uts:");
        nilai_uts = in.nextDouble();
        System.out.println("Masukkan nilai uas:");
        nilai_uas = in.nextDouble();
        
        nilai_ukk = Arrays.stream(nilai_quiz).average().orElse(0);
        NA = (nilai_uts*bobot_uts) + (nilai_uas*bobot_uas) + (nilai_ukk*bobot_ukk);
        
        System.out.println("Nilai akhir :" + NA);
    }
}

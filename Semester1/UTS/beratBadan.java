
import java.util.Scanner;

/**
 * @author hryzx
 */
public class beratBadan {
    public static void main(String[] args) {
        int pilih;
        double beratBadan, tinggiBadan, BMI, BBI;
        String kategori = "";
        
        Scanner in = new Scanner(System.in);
        System.out.println("-----Menu-----"+
                           "\n1. Perempuan"+
                           "\n2. Laki-laki"+
                           "\n--------------");
        System.out.println("Masukkan menu pilihan Anda (1/2):");
        pilih = in.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("Masukkan berat badan Anda (kg):");
                beratBadan = in.nextDouble();
                System.out.println("Masukkan tinggi badan Anda (cm):");
                tinggiBadan = in.nextDouble();
                
                tinggiBadan /= 100;
                BMI = beratBadan / (tinggiBadan * tinggiBadan);
                System.out.println("Nilai BMI Anda: " + BMI);
                
                if (BMI < 17) kategori = "Kurus";
                else if ((BMI >= 17) && (BMI < 23)) kategori = "Normal";
                else if ((BMI >= 23) && (BMI < 27)) kategori = "Kegemukan";
                else if (BMI >= 27) kategori = "Obesitas";
                System.out.println("Kategori berat badan Anda adalah: " + kategori);
                
                tinggiBadan *= 100;
                BBI = (tinggiBadan - 100) - ((tinggiBadan - 100) * 0.15);
                System.out.println("Berat badan ideal Anda: " + BBI);
                break;
            case 2:
                System.out.println("Masukkan berat badan Anda (kg):");
                beratBadan = in.nextDouble();
                System.out.println("Masukkan tinggi badan Anda (cm):");
                tinggiBadan = in.nextDouble();
                
                tinggiBadan /= 100;
                BMI = beratBadan / (tinggiBadan * tinggiBadan);
                System.out.println("Nilai BMI Anda: " + BMI);
                
                if (BMI < 17) kategori = "Kurus";
                else if ((BMI >= 17) && (BMI < 23)) kategori = "Normal";
                else if ((BMI >= 23) && (BMI < 27)) kategori = "Kegemukan";
                else if (BMI >= 27) kategori = "Obesitas";
                System.out.println("Kategori berat badan Anda adalah: " + kategori);
                
                tinggiBadan *= 100;
                BBI = (tinggiBadan - 100) - ((tinggiBadan - 100) * 0.1);
                System.out.println("Berat badan ideal Anda: " + BBI);
                break;
            default:
                System.out.println("Menu yang Anda masukkan salah.");
                break;
        }
    }
}

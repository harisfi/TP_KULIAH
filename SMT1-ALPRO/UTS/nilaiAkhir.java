
import java.util.Scanner;

/**
 * @author hryzx
 */
public class nilaiAkhir {
    public static void main(String[] args) {
        String namaMhs, nimMhs;
        String[] matkul = new String[2], huruf = new String[2];
        double[] sks = new double[2], na = new double[2], nKonversi = new double[2];
        double ipk;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan nama mahasiswa:");
        namaMhs = in.nextLine();
        System.out.println("Masukkan NIM mahasiswa:");
        nimMhs = in.nextLine();
        
        for(int i=0;i<2;i++) {
            System.out.println("Masukkan nama mata kuliah ke-"+(i+1)+":");
            matkul[i] = in.nextLine();
            System.out.println("Masukkan sks "+matkul[i]+":");
            sks[i] = in.nextDouble();
            System.out.println("Masukkan nilai uts "+matkul[i]+":");
            double uts = in.nextDouble();
            System.out.println("Masukkan nilai uas "+matkul[i]+":");
            double uas = in.nextDouble();
            System.out.println("Masukkan nilai ukk "+matkul[i]+":");
            double ukk = in.nextDouble();
            na[i] = (0.15*uts) + (0.15*uas) + (0.7*ukk);
            if(na[i] > 80){
                huruf[i] = "A";
                nKonversi[i] = 4;
            } else if((na[i] > 75) && (na[i] <= 80)){
                huruf[i] = "B+";
                nKonversi[i] = 3.5;
            } else if((na[i] > 70) && (na[i] <= 75)){
                huruf[i] = "B";
                nKonversi[i] = 3;
            } else if((na[i] > 65) && (na[i] <= 70)){
                huruf[i] = "C+";
                nKonversi[i] = 2.5;
            } else if((na[i] > 60) && (na[i] <= 65)){
                huruf[i] = "C";
                nKonversi[i] = 2;
            } else if((na[i] > 55) && (na[i] <= 60)){
                huruf[i] = "D+";
                nKonversi[i] = 1.5;
            } else if((na[i] > 50) && (na[i] <= 55)){
                huruf[i] = "D";
                nKonversi[i] = 1;
            } else {
                huruf[i] = "E";
                nKonversi[0] = 0;
            }
            in.nextLine();
        }
        
        ipk = ((nKonversi[0] * sks[0]) + (nKonversi[1] * sks[1])) / (sks[0] + sks[1]);
        
        System.out.println("----------KHS----------"+
                           "\nNama: "+namaMhs+
                           "\nNIM: "+nimMhs+
                           "\n---Nilai Mata Kuliah---"+
                           "\nMata kuliah ke-1: "+matkul[0]+" ("+sks[0]+") nilai: "+na[0]+" ("+huruf[0]+")"+
                           "\nMata kuliah ke-2: "+matkul[1]+" ("+sks[1]+") nilai: "+na[1]+" ("+huruf[1]+")"+
                           "\n-------Nilai IPK-------"+
                           "\nIPK: "+ipk);
    }
}

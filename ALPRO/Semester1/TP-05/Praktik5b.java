
import java.util.Scanner;

/**
 * Program penghitungan pemakaian listrik sederhana
 * @author hryzx
 */
public class Praktik5b {
    public static int kwhStart, kwhEnd, monthlyPrice, totalMonth, totalPrice;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program penghitungan pemakaian listrik sederhana");
        
        System.out.println("Masukkan posisi awal Kwh Meter\t:");
        kwhStart = in.nextInt();
        System.out.println("Masukkan posisi akhir Kwh Meter\t:");
        kwhEnd = in.nextInt();
        System.out.println("Masukkan beban biaya tiap bulan\t:");
        monthlyPrice = in.nextInt();
        System.out.println("Masukkan jumlah bulan\t\t:");
        totalMonth = in.nextInt();
        
        totalPrice = (kwhEnd - kwhStart) * monthlyPrice * totalMonth;
        System.out.println("Tarif listrik selama " + totalMonth + " bulan sebesar Rp " + totalPrice);
    }
}

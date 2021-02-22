
import java.util.Scanner;

/**
 * Soal:
 * menghitung persamaan z = ax + by 2 dimana x = 4b dan y = 2a
 * dimana algoritma menampilkan hasil nilai x, y dan z
 * 
 * @author hryzx
 */
public class persamaan {
    public static int a, b, x, y, z;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan nilai a:");
        a = in.nextInt();
        System.out.println("Masukkan nilai b:");
        b = in.nextInt();
        x = b*4;
        y = a*2;
        z = (a*x) + (b*y*y);
        System.out.println("Nilai x adalah: " + x +
                           "\nNilai y adalah: " + y +
                           "\nNilai z adalah: " + z);
    }
}

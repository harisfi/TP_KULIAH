
import java.util.Scanner;

/**
 *
 * @author hryzx
 */
public class praktik2 {
    public static void main(String[] args) {
        int hasil = 0, nilaiMax;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan batas nilai maksimum:");
        nilaiMax = in.nextInt();
        
        for (int i = 1; i <= nilaiMax; i++) {
            if (i % 2 != 0) {   // ganjil
                System.out.print("+" + i);
                hasil += i;
            } else {            // genap
                System.out.print("-" + i);
                hasil -= i;
            }
        }
        System.out.println("=" + hasil);
    }
}

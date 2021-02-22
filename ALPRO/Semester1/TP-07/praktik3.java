import java.util.Scanner;

/**
 *
 * @author hryzx
 */
public class praktik3 {
    public static void main(String[] args) {
        int jmlBilangan, i = 1, bil, ganjil = 0, genap = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Menu :");
        System.out.println("Masukkan jumlah bilangan :");
        jmlBilangan = in.nextInt();
        
        while (jmlBilangan > 0) {
            System.out.println("Masukkan bilangan ke-" + i + "\t:");
            bil = in.nextInt();
            if (bil % 2 == 0) genap++;
            else ganjil++;
            jmlBilangan--; i++;
        }
        
        System.out.println("Jumlah bilangan genap: " + genap +
                           "\nJumlah bilangan ganjil: " + ganjil);
    }
}

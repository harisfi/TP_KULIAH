
import java.util.Scanner;

/**
 *
 * @author hryzx
 */
public class tugas7a {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan n:");
        n = in.nextInt();
        
        for (int i=1; i<=n; i++) {
            for (int j=1; j<i+1; j++) {
                if (i%2 != 0)
                    System.out.print(i*j);
                else
                    System.out.print("*");
                if (j!=i)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

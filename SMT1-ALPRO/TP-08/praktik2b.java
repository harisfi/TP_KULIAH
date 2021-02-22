
import java.util.Scanner;

/**
 *
 * @author hryzx
 */
public class praktik2b {
    public static void main(String[] args) {
        String hasilA = "", hasilB = "";
        int baris, kolom;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        baris = in.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        kolom = in.nextInt();
        
        int[][] himpA = new int[baris][kolom],
                himpB = new int[baris][kolom];
        
        System.out.println("Himpunan A");
        for(int i = 0; i < baris; i++) {
            for(int j = 0; j < kolom; j++) {
                System.out.print("Masukkan data A[" + i + "][" + j + "] :");
                himpA[i][j] = in.nextInt();
            }
        }
        System.out.println("Himpunan B");
        for(int i = 0; i < baris; i++) {
            for(int j = 0; j < kolom; j++) {
                System.out.print("Masukkan data B[" + i + "][" + j + "] :");
                himpB[i][j] = in.nextInt();
                
                hasilA += (himpA[i][j] + himpB[i][j]) + " ";
                hasilB += (himpA[i][j] - himpB[i][j]) + " ";
            }
            hasilA += "\n";
            hasilB += "\n";
        }
        
        System.out.print("Matriks A+B\n" + hasilA);
        System.out.print("Matriks A-B\n" + hasilB);
    }
}

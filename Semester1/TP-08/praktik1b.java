
import java.util.Scanner;

/**
 *
 * @author hryzx
 */
public class praktik1b {
    public static void main(String[] args) {
        int jumData = 0, cari;
        boolean found = false;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        jumData = in.nextInt();
        
        int[] arr = new int[jumData];
        for(int i = 0; i < jumData; i++) {
            System.out.print("Masukkan data ke-" + (i+1) + ": ");
            arr[i] = in.nextInt();
        }
        System.out.print("Masukkan angka yang ingin dicari: ");
        cari = in.nextInt();
        for(int i = 0; i < jumData; i++) {
            if(arr[i] == cari) {
                found = true;
                break;
            }
        }
        if(found) System.out.println("Data ditemukan");
        else System.out.println("Data tidak ditemukan");
    }
}

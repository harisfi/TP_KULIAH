
import java.util.Scanner;

/**
 * Soal:
 * Program ini digunakan untuk menampilkan bilangan sesuai angka yang ditulis
 * diantara 1-4 selain itu maka akan keluar notifikasi bahwa angka yang dimasukkan
 * salah.
 * 
 * @author hryzx
 */
public class praktik1b {
    public static void main(String[] args) {
        int pilih;
        System.out.println("Masukkan angka 1-4!");
        Scanner input = new Scanner(System.in);
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("Anda memasukkan angka satu");
                break;
            case 2:
                System.out.println("Anda memasukkan angka dua");
                break;
            case 3:
                System.out.println("Anda memasukkan angka tiga");
                break;
            case 4:
                System.out.println("Anda memasukkan angka empat");
                break;
            default:
                System.out.println("Angka yang Anda masukkan salah!");
                break;
        }
    }
}

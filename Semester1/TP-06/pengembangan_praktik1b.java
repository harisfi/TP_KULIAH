
import java.util.Scanner;

/**
 * Soal:
 * Program ini digunakan untuk menampilkan bilangan sesuai angka yang ditulis
 * diantara 1-4 selain itu maka akan keluar notifikasi bahwa angka yang dimasukkan
 * salah.
 * 
 * Kembangkan program pada soal No. 1 dengan program java untuk menentukan hasil
 * operasi matematika sesuai yang dipilih dengan memasukkan dua bilangan bulat.
 * 
 * @author hryzx
 */
public class pengembangan_praktik1b {
    public static void main(String[] args) {
        int angka1, angka2, pilih, hasil;
        System.out.println("Menu :\n" +
                           "1. Penjumlahan\n" +
                           "2. Pengurangan\n" +
                           "3. Perkalian\n" +
                           "4. Pembagian\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka ke-1\t\t\t: ");
        angka1 = input.nextInt();
        System.out.println("Masukkan angka ke-2\t\t\t: ");
        angka2 = input.nextInt();
        System.out.println("Masukkan menu pilihan Anda (1-4)\t: ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil penjumlahan " + angka1 + " + " + angka2 + " = " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil pengurangan " + angka1 + " + " + angka2 + " = " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil perkalian " + angka1 + " + " + angka2 + " = " + hasil);
                break;
            case 4:
                hasil = angka1 / angka2;
                System.out.println("Hasil pembagian " + angka1 + " + " + angka2 + " = " + hasil);
                break;
            default:
                System.out.println("Pilihan yang Anda masukkan salah!");
                break;
        }
    }
}

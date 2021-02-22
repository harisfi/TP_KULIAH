
import java.util.Scanner;

/**
 * Soal:
 * Program untuk menentukan gaji bersih pegawai, yang mana maksimal pegawai
 * bekerja 200 jam selama 1 bulan, jika lebih maka dianggap sebagai uang lembur.
 * User diminta untuk memasukkan jenis pegawai yaitu 1 untuk Tetap dan 2 untuk
 * kontrak dan menampilkan total gaji. Total gaji kotor dihitung dari
 * penjumlahan gaji perjam, gaji lembur dan tunjangan. Gaji bersih
 * diperoleh setelah terdapat pengurangan pajak sebesar 5% dari total gaji kotor.
 * 
 * @author hryzx
 */
public class gajiPegawai {
    public static void main(String[] args) {
        int jenisPegawai, jamKerja, jamLembur;
        double gaji, gajiLembur, tunjangan,
                gajiKotor, potongan, gajiBersih;
        String[] pegawai = {"Tetap", "Kontrak"};
        
        Scanner in = new Scanner(System.in);
        System.out.println("Jenis Pegawai :" +
                            "\n1. Tetap" +
                            "\n2. Kontrak");
        System.out.println("Masukkan jenis pegawai (1/2) :");
        jenisPegawai = in.nextInt();
        if (jenisPegawai >= 1 && jenisPegawai <= 2) {
            System.out.println("Masukkan jumlah jam kerja :");
            jamKerja = in.nextInt();
            
            if (jamKerja > 200) {
                jamLembur = jamKerja - 200;
                jamKerja = 200;
            } else {
                jamLembur = 0;
            }
            
            switch (jenisPegawai) {
                case 1:
                    gaji = jamKerja * 20000;
                    gajiLembur = jamLembur * 20000 * 1.5;
                    tunjangan = 750000;
                    break;
                case 2:
                    gaji = jamKerja * 10000;
                    gajiLembur = jamLembur * 10000 * 1.2;
                    tunjangan = 500000;
                    break;
                default:
                    gaji = 0;
                    gajiLembur = 0;
                    tunjangan = 0;
                    break;
            }
            gajiKotor = gaji + gajiLembur + tunjangan;
            potongan = gajiKotor * 0.05;
            gajiBersih = gajiKotor - potongan;
            
            System.out.println("----------------------------------------" +
                                "\nRincian Gaji Pegawai " + pegawai[jenisPegawai - 1] +
                                "\nGaji\t\t: " + gaji +
                                "\nGaji Lembur\t: " + gajiLembur +
                                "\nTunjangan\t: " + tunjangan +
                                "\n----------------------------------------+" +
                                "\nGaji Kotor\t: " + gajiKotor +
                                "\nPotongan\t: -" + potongan +
                                "\n----------------------------------------" +
                                "\nGaji Bersih\t: " + gajiBersih);
        } else {
            System.out.println("Angka yang Anda masukkan salah!");
        }
    }
}

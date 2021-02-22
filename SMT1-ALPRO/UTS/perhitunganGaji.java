
import java.util.Scanner;

/**
 * @author hryzx
 */
public class perhitunganGaji {
    public static void main(String[] args) {
        int jenisPegawai, jenisJabatan, jmlHariKerja;
        double gajiPokok, tunjangan, honor, pajak, gajiKotor, gajiBersih;
        String namaPegawai, nikPegawai, status, jabatan;
        
        Scanner in = new Scanner(System.in);
        System.out.println("-----Jenis Pegawai-----" +
                           "\n1. PNS" +
                           "\n2. Tetap non PNS" +
                           "\n3. Kontrak" +
                           "\n-----------------------");
        System.out.println("Masukkan jenis pegawai:");
        jenisPegawai = in.nextInt();
        if (jenisPegawai >= 1 && jenisPegawai <= 3) {
            in.nextLine();
            System.out.println("Masukkan nama pegawai:");
            namaPegawai = in.nextLine();
            System.out.println("Masukkan nik pegawai:");
            nikPegawai = in.nextLine();
            System.out.println("-----Jenis Jabatan-----" +
                               "\n1. Kepala Bagian" +
                               "\n2. Wakil Kepala Bagian" +
                               "\n3. Staff" +
                               "\n-----------------------");
            System.out.println("Masukkan jenis jabatan:");
            jenisJabatan = in.nextInt();
            if (jenisJabatan >= 1 && jenisJabatan <= 3) {
                System.out.println("Masukkan jumlah hari kerja:");
                jmlHariKerja = in.nextInt();
                switch (jenisPegawai) {
                    case 1: //pns
                        switch (jenisJabatan) {
                            case 1: //kabag pns
                                status = "PNS";
                                jabatan = "Kepala Bagian";
                                gajiPokok = 4500000;
                                tunjangan = 800000;
                                honor = 30000;
                                break;
                            case 2: //wakabag pns
                                status = "PNS";
                                jabatan = "Wakil Kepala Bagian";
                                gajiPokok = 4000000;
                                tunjangan = 800000;
                                honor = 25000;
                                break;
                            case 3: //staff pns
                                status = "PNS";
                                jabatan = "Staff";
                                gajiPokok = 3500000;
                                tunjangan = 800000;
                                honor = 20000;
                                break;
                            default://null
                                status = "PNS";
                                jabatan = "-";
                                gajiPokok = 0;
                                tunjangan = 0;
                                honor = 0;
                                break;
                        }
                        break;
                    case 2: //tetap non pns
                        switch (jenisJabatan) {
                            case 1: //kabag tetap non pns
                                status = "Tetap Non PNS";
                                jabatan = "Kepala Bagian";
                                gajiPokok = 3500000;
                                tunjangan = 600000;
                                honor = 25000;
                                break;
                            case 2: //wakabag tetap non pns
                                status = "Tetap Non PNS";
                                jabatan = "Wakil Kepala Bagian";
                                gajiPokok = 3000000;
                                tunjangan = 600000;
                                honor = 20000;
                                break;
                            case 3: //staff tetap non pns
                                status = "Tetap Non PNS";
                                jabatan = "Staff";
                                gajiPokok = 2500000;
                                tunjangan = 600000;
                                honor = 15000;
                                break;
                            default://null
                                status = "Tetap Non PNS";
                                jabatan = "-";
                                gajiPokok = 0;
                                tunjangan = 0;
                                honor = 0;
                                break;
                        }
                        break;
                    case 3: //kontrak
                        switch (jenisJabatan) {
                            case 1: //kabag kontrak
                                status = "Kontrak";
                                jabatan = "Kepala Bagian";
                                gajiPokok = 2500000;
                                tunjangan = 400000;
                                honor = 20000;
                                break;
                            case 2: //wakabag kontrak
                                status = "Kontrak";
                                jabatan = "Wakil Kepala Bagian";
                                gajiPokok = 2000000;
                                tunjangan = 400000;
                                honor = 15000;
                                break;
                            case 3: //staff kontrak
                                status = "Kontrak";
                                jabatan = "Staff";
                                gajiPokok = 1500000;
                                tunjangan = 400000;
                                honor = 10000;
                                break;
                            default://null
                                status = "Kontrak";
                                jabatan = "-";
                                gajiPokok = 0;
                                tunjangan = 0;
                                honor = 0;
                                break;
                        }
                        break;
                    default://null
                        status = "-";
                        jabatan = "-";
                        gajiPokok = 0;
                        tunjangan = 0;
                        honor = 0;
                        break;
                }
                gajiPokok = (gajiPokok / 25) * jmlHariKerja;
                honor *= jmlHariKerja;
                gajiKotor = gajiPokok + tunjangan + honor;
                pajak = gajiKotor * 0.05;
                gajiBersih = gajiKotor - pajak;
                
                System.out.println("-----Rincian Gaji-----" +
                                   "\nNama\t\t: " + namaPegawai +
                                   "\nNIK\t\t: " + nikPegawai +
                                   "\nStatus\t\t: " + status +
                                   "\nJabatan\t\t: " + jabatan +
                                   "\n----------------------" +
                                   "\nGaji Pokok\t: " + gajiPokok +
                                   "\nTunjangan\t: " + tunjangan +
                                   "\nHonor\t\t: " + honor +
                                   "\nPajak\t\t: -" + pajak +
                                   "\n----------------------" +
                                   "\nGaji Bersih\t: " + gajiBersih);
                
            } else {
                System.out.println("Angka yang Anda masukkan salah!");
            }
        } else {
            System.out.println("Angka yang Anda masukkan salah!");
        }
        
    }
}

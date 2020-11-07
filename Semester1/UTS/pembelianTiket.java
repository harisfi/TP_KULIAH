
import java.util.Scanner;

/**
 * @author hryzx
 */
public class pembelianTiket {
    public static void main(String[] args) {
        int jenisTiket, jenisHari,
                tiketJPark1, tiketJPark2, tiketEGPark,
                tiketPaket1, tiketPaket2;
        double totalBeli, totalDiskon, totalBayar,
                jPark1 = 100000, 
                jPark2 = 120000, 
                egPark = 70000,
                paket1 = 110000,
                paket2 = 130000;
        
        Scanner in = new Scanner(System.in);
        System.out.println("-----Jenis Tiket-----"+
                           "\n1. Tiket Reguler"+
                           "\n2. Tiket Terusan"+
                           "\n---------------------");
        System.out.println("Masukkan jenis tiket (1/2):");
        jenisTiket = in.nextInt();
        if (jenisTiket == 1 || jenisTiket == 2) {
            System.out.println("-----Jenis Hari-----"+
                               "\n1. Weekday"+
                               "\n2. Weekend"+
                               "\n--------------------");
            System.out.println("Masukkan jenis hari (1/2):");
            jenisHari = in.nextInt();
            if (jenisTiket == 1 && (jenisHari == 1 || jenisHari == 2)) {
                if (jenisHari == 1) {
                    jPark1 -= jPark1 * 3/10;
                    jPark2 -= jPark2 * 3/10;
                    egPark -= egPark * 3/10;
                }
                System.out.println("-----Harga Tiket Reguler-----"+
                                   "\n1. Jatim Park 1\t\t"+jPark1+
                                   "\n2. Jatim Park 2\t\t"+jPark2+
                                   "\n3. Eco Green Park\t"+egPark+
                                   "\n-----------------------------");
                System.out.println("Masukkan jumlah pembelian tiket Jatim Park 1:");
                tiketJPark1 = in.nextInt();
                System.out.println("Masukkan jumlah pembelian tiket Jatim Park 2:");
                tiketJPark2 = in.nextInt();
                System.out.println("Masukkan jumlah pembelian tiket Eco Green Park:");
                tiketEGPark = in.nextInt();
                
                totalBeli = (tiketJPark1 * jPark1) + (tiketJPark2 * jPark2) + (tiketEGPark * egPark);
                if (totalBeli >= 500000 && totalBeli < 1000000) {
                    totalDiskon = totalBeli * 5/100;
                } else if (totalBeli >= 1000000) {
                    totalDiskon = totalBeli * 1/10;
                } else {
                    totalDiskon = 0;
                }
                totalBayar = totalBeli - totalDiskon;
                
                System.out.println(tiketJPark1 + " Jatim Park 1\t\t@" + jPark1 + "\n" +
                                   tiketJPark2 + " Jatim Park 2\t\t@" + jPark2 + "\n" +
                                   tiketEGPark + " Eco Green Park\t@" + egPark + "\n" +
                                   "-----------------------------" +
                                   "\nTotal Pembelian:\t" + totalBeli +
                                   "\nTotal Diskon:\t\t-" + totalDiskon +
                                   "\n-----------------------------" +
                                   "\nTotal Pembayaran:\t" + totalBayar);
            } else if (jenisTiket == 2 && (jenisHari == 1 || jenisHari == 2)) {
                if (jenisHari == 1) {
                    paket1 -= paket1 * 3/10;
                    paket2 -= paket2 * 3/10;
                }
                System.out.println("----------Harga Tiket Terusan----------"+
                                   "\n1. Paket 1\t\t\t"+paket1+
                                   "\n   Jatim Park 1 & Predator Fun Park"+
                                   "\n2. Paket 2\t\t\t"+paket2+
                                   "\n   Jatim Park 1 & Eco Green Park"+
                                   "\n---------------------------------------");
                System.out.println("Masukkan jumlah pembelian tiket Paket 1:");
                tiketPaket1 = in.nextInt();
                System.out.println("Masukkan jumlah pembelian tiket Paket 2:");
                tiketPaket2 = in.nextInt();
                
                totalBeli = (tiketPaket1 * paket1) + (tiketPaket2 * paket2);
                if (totalBeli >= 500000 && totalBeli < 1000000) {
                    totalDiskon = totalBeli * 5/100;
                } else if (totalBeli >= 1000000) {
                    totalDiskon = totalBeli * 1/10;
                } else {
                    totalDiskon = 0;
                }
                totalBayar = totalBeli - totalDiskon;
                
                System.out.println(tiketPaket1 + " Paket 1\t@" + paket1 + "\n" +
                                   tiketPaket1 + " Paket 2\t@" + paket2 + "\n" +
                                   "-----------------------------" +
                                   "\nTotal Pembelian:\t" + totalBeli +
                                   "\nTotal Diskon:\t-" + totalDiskon +
                                   "\n-----------------------------" +
                                   "\nTotal Pembayaran:\t" + totalBayar);
                
            } else {
                System.out.println("Angka yang Anda masukkan salah!");
            }
        } else {
            System.out.println("Angka yang Anda masukkan salah!");
        }
    }
}

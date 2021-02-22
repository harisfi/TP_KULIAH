
import java.util.Scanner;

/**
 * @author hryzx
 */
public class kasirRestoran {
    public static void main(String[] args) {
        int pilPesanan, pilMakanan, pilMinuman, 
                jmlPesanMakan, jmlPesanMinum,
                ttlBeli, ttlDiskon, ttlPajak, ttlBayar;
        
        Scanner in = new Scanner(System.in);
        System.out.println("-----------Menu-----------"+
                           "\n1. Makanan"+
                           "\n2. Minuman"+
                           "\n3. Makanan dan Minuman"+
                           "\n--------------------------");
        System.out.println("Masukkan jenis pesanan (1-3):");
        pilPesanan = in.nextInt();
        switch (pilPesanan) {
            case 1:     //makanan
                System.out.println("-------Menu Makanan-------"+
                                   "\n1. Soto\t15.000"+
                                   "\n2. Bakso\t20.000"+
                                   "\n3. Rawon\t25.000"+
                                   "\n--------------------------");
                System.out.println("Masukkan pesanan makanan (1-3):");
                pilMakanan = in.nextInt();
                switch (pilMakanan) {
                    case 1:     //soto
                        System.out.println("Masukkan jumlah pesanan Soto:");
                        jmlPesanMakan = in.nextInt();
                        System.out.println(jmlPesanMakan + " Soto @15000");
                        System.out.println("--------------------------");
                        ttlBeli = jmlPesanMakan * 15000;
                        System.out.println("Total pembelian: "+ttlBeli);
                        if (ttlBeli > 100000) ttlDiskon = ttlBeli*5/100;
                        else ttlDiskon = 0;
                        System.out.println("Total diskon: -"+ttlDiskon);
                        if (ttlDiskon != 0) ttlBeli -= ttlDiskon;
                        ttlPajak = ttlBeli * 10/100;
                        System.out.println("Total pajak: +"+ttlPajak);
                        System.out.println("--------------------------");
                        ttlBayar = ttlBeli - ttlPajak;
                        System.out.println("Total pembayaran: "+ttlBayar);
                        break;
                    case 2:     //bakso
                        System.out.println("Masukkan jumlah pesanan Bakso:");
                        jmlPesanMakan = in.nextInt();
                        System.out.println(jmlPesanMakan + " Bakso @20000");
                        System.out.println("--------------------------");
                        ttlBeli = jmlPesanMakan * 20000;
                        System.out.println("Total pembelian: "+ttlBeli);
                        if (ttlBeli > 100000) ttlDiskon = ttlBeli*5/100;
                        else ttlDiskon = 0;
                        System.out.println("Total diskon: -"+ttlDiskon);
                        if (ttlDiskon != 0) ttlBeli -= ttlDiskon;
                        ttlPajak = ttlBeli * 10/100;
                        System.out.println("Total pajak: +"+ttlPajak);
                        System.out.println("--------------------------");
                        ttlBayar = ttlBeli - ttlPajak;
                        System.out.println("Total pembayaran: "+ttlBayar);
                        break;
                    case 3:     //rawon
                        System.out.println("Masukkan jumlah pesanan Rawon:");
                        jmlPesanMakan = in.nextInt();
                        System.out.println(jmlPesanMakan + " Rawon @25000");
                        System.out.println("--------------------------");
                        ttlBeli = jmlPesanMakan * 25000;
                        System.out.println("Total pembelian: "+ttlBeli);
                        if (ttlBeli > 100000) ttlDiskon = ttlBeli*5/100;
                        else ttlDiskon = 0;
                        System.out.println("Total diskon: -"+ttlDiskon);
                        if (ttlDiskon != 0) ttlBeli -= ttlDiskon;
                        ttlPajak = ttlBeli * 10/100;
                        System.out.println("Total pajak: +"+ttlPajak);
                        System.out.println("--------------------------");
                        ttlBayar = ttlBeli - ttlPajak;
                        System.out.println("Total pembayaran: "+ttlBayar);
                        break;
                    default:
                        System.out.println("Angka yang Anda masukkan salah!");
                        break;
                }
                break;
            case 2:     //minuman
                System.out.println("-------Menu Minuman-------"+
                                   "\n1. Es Teh\t5.000"+
                                   "\n2. Es Jeruk\t8.000"+
                                   "\n--------------------------");
                System.out.println("Masukkan pesanan minuman (1-2):");
                pilMinuman = in.nextInt();
                switch (pilMinuman) {
                    case 1:     //es teh
                        System.out.println("Masukkan jumlah pesanan Es Teh:");
                        jmlPesanMinum = in.nextInt();
                        System.out.println(jmlPesanMinum + " Es Teh @5000");
                        System.out.println("--------------------------");
                        ttlBeli = jmlPesanMinum * 5000;
                        System.out.println("Total pembelian: "+ttlBeli);
                        if (ttlBeli > 100000) ttlDiskon = ttlBeli*5/100;
                        else ttlDiskon = 0;
                        System.out.println("Total diskon: -"+ttlDiskon);
                        if (ttlDiskon != 0) ttlBeli -= ttlDiskon;
                        ttlPajak = ttlBeli * 10/100;
                        System.out.println("Total pajak: +"+ttlPajak);
                        System.out.println("--------------------------");
                        ttlBayar = ttlBeli - ttlPajak;
                        System.out.println("Total pembayaran: "+ttlBayar);
                        break;
                    case 2:     //es jeruk
                        System.out.println("Masukkan jumlah pesanan Es Jeruk:");
                        jmlPesanMinum = in.nextInt();
                        System.out.println(jmlPesanMinum + " Es Jeruk @8000");
                        System.out.println("--------------------------");
                        ttlBeli = jmlPesanMinum * 8000;
                        System.out.println("Total pembelian: "+ttlBeli);
                        if (ttlBeli > 100000) ttlDiskon = ttlBeli*5/100;
                        else ttlDiskon = 0;
                        System.out.println("Total diskon: -"+ttlDiskon);
                        if (ttlDiskon != 0) ttlBeli -= ttlDiskon;
                        ttlPajak = ttlBeli * 10/100;
                        System.out.println("Total pajak: +"+ttlPajak);
                        System.out.println("--------------------------");
                        ttlBayar = ttlBeli - ttlPajak;
                        System.out.println("Total pembayaran: "+ttlBayar);
                        break;
                    default:
                        System.out.println("Angka yang Anda masukkan salah!");
                        break;
                }
                break;
            case 3:     //makanan+minuman
                System.out.println("-------Menu Makanan-------"+
                                   "\n1. Soto\t15.000"+
                                   "\n2. Bakso\t20.000"+
                                   "\n3. Rawon\t25.000"+
                                   "\n--------------------------");
                System.out.println("--------Menu Minuman--------"+
                                   "\n1. Es Teh\t5.000"+
                                   "\n2. Es Jeruk\t8.000"+
                                   "\n--------------------------");
                System.out.println("Masukkan pesanan makanan (1-3):");
                pilMakanan = in.nextInt();
                switch (pilMakanan) {
                    case 1:     //soto
                        System.out.println("Masukkan jumlah pesanan Soto:");
                        jmlPesanMakan = in.nextInt();
                        System.out.println("Masukkan pesanan minuman (1-2):");
                        pilMinuman = in.nextInt();
                        switch (pilMinuman) {
                            case 1:     //es teh
                                System.out.println("Masukkan jumlah pesanan Es Teh:");
                                jmlPesanMinum = in.nextInt();
                                
                                System.out.println(jmlPesanMakan + " Soto @15000");
                                System.out.println(jmlPesanMinum + " Es Teh @5000");
                                System.out.println("--------------------------");
                                ttlBeli = (jmlPesanMakan * 15000) + (jmlPesanMinum * 5000);
                                System.out.println("Total pembelian: "+ttlBeli);
                                if (ttlBeli > 100000) ttlDiskon = ttlBeli*5/100;
                                else ttlDiskon = 0;
                                System.out.println("Total diskon: -"+ttlDiskon);
                                if (ttlDiskon != 0) ttlBeli -= ttlDiskon;
                                ttlPajak = ttlBeli * 10/100;
                                System.out.println("Total pajak: +"+ttlPajak);
                                System.out.println("--------------------------");
                                ttlBayar = ttlBeli - ttlPajak;
                                System.out.println("Total pembayaran: "+ttlBayar);
                                break;
                            case 2:     //es jeruk
                                System.out.println("Masukkan jumlah pesanan Es Jeruk:");
                                jmlPesanMinum = in.nextInt();
                                
                                System.out.println(jmlPesanMakan + " Soto @15000");
                                System.out.println(jmlPesanMinum + " Es Jeruk @8000");
                                System.out.println("--------------------------");
                                ttlBeli = (jmlPesanMakan * 15000) + (jmlPesanMinum * 8000);
                                System.out.println("Total pembelian: "+ttlBeli);
                                if (ttlBeli > 100000) ttlDiskon = ttlBeli*5/100;
                                else ttlDiskon = 0;
                                System.out.println("Total diskon: -"+ttlDiskon);
                                if (ttlDiskon != 0) ttlBeli -= ttlDiskon;
                                ttlPajak = ttlBeli * 10/100;
                                System.out.println("Total pajak: +"+ttlPajak);
                                System.out.println("--------------------------");
                                ttlBayar = ttlBeli - ttlPajak;
                                System.out.println("Total pembayaran: "+ttlBayar);
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:     //bakso
                        System.out.println("Masukkan jumlah pesanan Bakso:");
                        jmlPesanMakan = in.nextInt();
                        System.out.println("Masukkan pesanan minuman (1-2):");
                        pilMinuman = in.nextInt();
                        switch (pilMinuman) {
                            case 1:     //es teh
                                System.out.println("Masukkan jumlah pesanan Es Teh:");
                                jmlPesanMinum = in.nextInt();
                                
                                System.out.println(jmlPesanMakan + " Bakso @20000");
                                System.out.println(jmlPesanMinum + " Es Teh @5000");
                                System.out.println("--------------------------");
                                ttlBeli = (jmlPesanMakan * 20000) + (jmlPesanMinum * 5000);
                                System.out.println("Total pembelian: "+ttlBeli);
                                if (ttlBeli > 100000) ttlDiskon = ttlBeli*5/100;
                                else ttlDiskon = 0;
                                System.out.println("Total diskon: -"+ttlDiskon);
                                if (ttlDiskon != 0) ttlBeli -= ttlDiskon;
                                ttlPajak = ttlBeli * 10/100;
                                System.out.println("Total pajak: +"+ttlPajak);
                                System.out.println("--------------------------");
                                ttlBayar = ttlBeli - ttlPajak;
                                System.out.println("Total pembayaran: "+ttlBayar);
                                break;
                            case 2:     //es jeruk
                                System.out.println("Masukkan jumlah pesanan Es Jeruk:");
                                jmlPesanMinum = in.nextInt();
                                
                                System.out.println(jmlPesanMakan + " Bakso @20000");
                                System.out.println(jmlPesanMinum + " Es Jeruk @8000");
                                System.out.println("--------------------------");
                                ttlBeli = (jmlPesanMakan * 20000) + (jmlPesanMinum * 8000);
                                System.out.println("Total pembelian: "+ttlBeli);
                                if (ttlBeli > 100000) ttlDiskon = ttlBeli*5/100;
                                else ttlDiskon = 0;
                                System.out.println("Total diskon: -"+ttlDiskon);
                                if (ttlDiskon != 0) ttlBeli -= ttlDiskon;
                                ttlPajak = ttlBeli * 10/100;
                                System.out.println("Total pajak: +"+ttlPajak);
                                System.out.println("--------------------------");
                                ttlBayar = ttlBeli - ttlPajak;
                                System.out.println("Total pembayaran: "+ttlBayar);
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3:     //rawon
                        System.out.println("Masukkan jumlah pesanan Rawon:");
                        jmlPesanMakan = in.nextInt();
                        System.out.println("Masukkan pesanan minuman (1-2):");
                        pilMinuman = in.nextInt();
                        switch (pilMinuman) {
                            case 1:     //es teh
                                System.out.println("Masukkan jumlah pesanan Es Teh:");
                                jmlPesanMinum = in.nextInt();
                                
                                System.out.println(jmlPesanMakan + " Rawon @25000");
                                System.out.println(jmlPesanMinum + " Es Teh @5000");
                                System.out.println("--------------------------");
                                ttlBeli = (jmlPesanMakan * 25000) + (jmlPesanMinum * 5000);
                                System.out.println("Total pembelian: "+ttlBeli);
                                if (ttlBeli > 100000) ttlDiskon = ttlBeli*5/100;
                                else ttlDiskon = 0;
                                System.out.println("Total diskon: -"+ttlDiskon);
                                if (ttlDiskon != 0) ttlBeli -= ttlDiskon;
                                ttlPajak = ttlBeli * 10/100;
                                System.out.println("Total pajak: +"+ttlPajak);
                                System.out.println("--------------------------");
                                ttlBayar = ttlBeli - ttlPajak;
                                System.out.println("Total pembayaran: "+ttlBayar);
                                break;
                            case 2:     //es jeruk
                                System.out.println("Masukkan jumlah pesanan Es Jeruk:");
                                jmlPesanMinum = in.nextInt();
                                
                                System.out.println(jmlPesanMakan + " Rawon @25000");
                                System.out.println(jmlPesanMinum + " Es Jeruk @8000");
                                System.out.println("--------------------------");
                                ttlBeli = (jmlPesanMakan * 25000) + (jmlPesanMinum * 8000);
                                System.out.println("Total pembelian: "+ttlBeli);
                                if (ttlBeli > 100000) ttlDiskon = ttlBeli*5/100;
                                else ttlDiskon = 0;
                                System.out.println("Total diskon: -"+ttlDiskon);
                                if (ttlDiskon != 0) ttlBeli -= ttlDiskon;
                                ttlPajak = ttlBeli * 10/100;
                                System.out.println("Total pajak: +"+ttlPajak);
                                System.out.println("--------------------------");
                                ttlBayar = ttlBeli - ttlPajak;
                                System.out.println("Total pembayaran: "+ttlBayar);
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        System.out.println("Angka yang Anda masukkan salah!");
                        break;
                }
                break;
            default:
                System.out.println("Angka yang Anda masukkan salah!");
                break;
        }
    }
}

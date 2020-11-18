
import java.util.Scanner;

/**
 *
 * @author hryzx
 */
public class tugas7b {
    public static void main(String[] args) {
        int menu;
        boolean keluar = false;
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.println("Menu :" +
                                "\n0 Keluar" +
                                "\n1 Menghitung Luas Persegi Panjang" +
                                "\n2 Menghitung Luas Lingkaran" +
                                "\n3 Menghitung Luas Segitiga Siku-siku");
            System.out.println("Masukkan pilihan Anda:");
            menu = in.nextInt();
            switch(menu) {
                case 0:
                    keluar = true;
                    System.out.println("Terima kasih :)");
                    break;
                case 1:     // persegi panjang
                    double p, l;
                    System.out.println("Masukkan panjang:");
                    p = in.nextDouble();
                    System.out.println("Masukkan lebar:");
                    l = in.nextDouble();
                    System.out.println("Luas Persegi Panjang: " + (p*l));
                    break;
                case 2:     // lingkaran
                    double r;
                    System.out.println("Masukkan jari-jari:");
                    r = in.nextDouble();
                    System.out.println("Luas Lingkaran: " + (Math.PI * Math.pow(r, 2)));
                    break;
                case 3:     // segitiga siku-siku
                    double a, t;
                    System.out.println("Masukkan alas:");
                    a = in.nextDouble();
                    System.out.println("Masukkan tinggi:");
                    t = in.nextDouble();
                    System.out.println("Luas Segitiga Siku-siku: " + (0.5 * a * t));
                    break;
                default:
                    System.out.println("Pilihan yang Anda masukkan salah!");
            }
        } while(!keluar);
    }
}

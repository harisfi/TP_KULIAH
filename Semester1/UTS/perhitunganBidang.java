
import static java.lang.Math.PI;
import java.util.Scanner;


/**
 * @author hryzx
 */
public class perhitunganBidang {
    public static void main(String[] args) {
        int menuDimensi, menuBangun;
        double K, L, V;
        
        Scanner in = new Scanner(System.in);
        System.out.println("-----Menu-----"+
                           "\n1. 2 Dimensi"+
                           "\n2. 3 Dimensi"+
                           "\n--------------");
        System.out.println("Masukkan menu pilihan Anda (1/2):");
        menuDimensi = in.nextInt();
        switch (menuDimensi) {
            case 1:
                System.out.println("-----Menu 2 Dimensi-----"+
                                   "\n1. Lingkaran"+
                                   "\n2. Persegi"+
                                   "\n3. Persegi Panjang"+
                                   "\n----------------------");
                System.out.println("Masukkan menu pilihan Anda (1-3):");
                menuBangun = in.nextInt();
                switch (menuBangun) {
                    case 1:
                        /*
                        lingkaran
                        K=PI*r*2
                        L=PI*r^2
                        */
                        
                        System.out.println("Masukkan jari-jari:");
                        double r = in.nextDouble();
                        K = PI*r*2;
                        L = PI*r*r;
                        System.out.println("Lingkaran dengan r="+r+
                                           " memiliki K="+K+
                                           " dan L="+L);
                        break;
                    case 2:
                        /*
                        persegi
                        K=4*s
                        L=s*s
                        */
                        
                        System.out.println("Masukkan sisi:");
                        double s = in.nextDouble();
                        K = 4*s;
                        L = s*s;
                        System.out.println("Persegi dengan s="+s+
                                           " memiliki K="+K+
                                           " dan L="+L);
                        break;
                    case 3:
                        /*
                        persegi panjang
                        K=2*(p+l)
                        L=p*l
                        */
                        
                        System.out.println("Masukkan panjang:");
                        double p = in.nextDouble();
                        System.out.println("Masukkan lebar:");
                        double l = in.nextDouble();
                        K = 2*(p+l);
                        L = p*l;
                        System.out.println("Persegi panjang dengan p="+p+
                                           " dan l="+l+
                                           " memiliki K="+K+
                                           " dan L="+L);
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("-----Menu 3 Dimensi-----"+
                                   "\n1. Tabung"+
                                   "\n2. Kubus"+
                                   "\n3. Balok"+
                                   "\n----------------------");
                System.out.println("Masukkan menu pilihan Anda (1-3):");
                menuBangun = in.nextInt();
                switch (menuBangun) {
                    case 1:
                        /*
                        tabung
                        L=2*PI*r*(r+t)
                        V=PI*r*r*t
                        */
                        
                        System.out.println("Masukkan jari-jari:");
                        double r = in.nextDouble();
                        System.out.println("Masukkan tinggi:");
                        double t = in.nextDouble();
                        L=2*PI*r*(r+t);
                        V=PI*r*r*t;
                        System.out.println("Tabung dengan r="+r+
                                           " dan t="+t+
                                           " memiliki L="+L+
                                           " dan V="+V);
                        break;
                    case 2:
                        /*
                        kubus
                        L=6*s*s
                        V=s*s*s
                        */
                        
                        System.out.println("Masukkan sisi:");
                        double s = in.nextDouble();
                        L=6*s*s;
                        V=s*s*s;
                        System.out.println("Kubus dengan s="+s+
                                           " memiliki L="+L+
                                           " dan V="+V);
                        break;
                    case 3:
                        /*
                        balok
                        L=2*((p*l)+(p*ti)+(l*ti))
                        V=p*l*ti
                        */
                        
                        System.out.println("Masukkan panjang:");
                        double p = in.nextDouble();
                        System.out.println("Masukkan lebar:");
                        double l = in.nextDouble();
                        System.out.println("Masukkan tinggi:");
                        double ti = in.nextDouble();
                        L=2*((p*l)+(p*ti)+(l*ti));
                        V=p*l*ti;
                        System.out.println("Persegi panjang dengan p="+p+
                                           ", l="+l+
                                           ", dan t="+ti+
                                           " memiliki L="+L+
                                           " dan V="+V);
                        break;
                    default:
                        break;
                }
                break;
            default:
                System.out.println("Menu yang Anda masukkan salah.");
                break;
        }
    }
}

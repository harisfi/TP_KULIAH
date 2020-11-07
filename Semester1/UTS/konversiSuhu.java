
import java.util.Scanner;

/**
 * @author hryzx
 */
public class konversiSuhu {
    public static void main(String[] args) {
        int suhuAwal, suhuAkhir;
        double valSuhuAwal, valSuhuAkhir;
        
        Scanner in = new Scanner(System.in);
        System.out.println("------Menu Suhu Awal------"+
                           "\n1. Reamur"+
                           "\n2. Celcius"+
                           "\n3. Kelvin"+
                           "\n4. Farenheit\n"+
                           "\n-----Menu Suhu Akhir----"+
                           "\n1. Reamur"+
                           "\n2. Celcius"+
                           "\n3. Kelvin"+
                           "\n4. Farenheit"+
                           "\n------------------------");
        System.out.println("Masukkan suhu awal pilihan Anda (1-4):");
        suhuAwal = in.nextInt();
        if ((suhuAwal>=1) && (suhuAwal<=4)) {
            System.out.println("Masukkan suhu akhir pilihan Anda (1-4):");
            suhuAkhir = in.nextInt();
            if ((suhuAkhir>=1) && (suhuAkhir<=4)) {
                System.out.println("Masukkan nilai suhu awal:");
                valSuhuAwal = in.nextDouble();
                switch (suhuAwal) {
                    case 1:         // reamur
                        switch (suhuAkhir) {
                            case 1:         // reamur->reamur
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Reamur adalah " + valSuhuAwal + " Reamur.");
                                break;
                            case 2:         // reamur->celcius
                                valSuhuAkhir = (5 * valSuhuAwal) / 4;
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Reamur adalah " + valSuhuAkhir + " Celcius.");
                                break;
                            case 3:         // reamur->kelvin
                                valSuhuAkhir = ((5 * valSuhuAwal) / 4) + 273;
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Reamur adalah " + valSuhuAkhir + " Kelvin.");
                                break;
                            case 4:         // reamur->farenheit
                                valSuhuAkhir = ((9 * valSuhuAwal) / 4) + 32;
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Reamur adalah " + valSuhuAkhir + " Farenheit.");
                                break;
                            default:
                                System.out.println("Menu yang Anda masukkan salah.");
                                break;
                        }
                        break;
                    case 2:         // celcius
                        switch (suhuAkhir) {
                            case 1:         // celcius->reamur
                                valSuhuAkhir = (4 * valSuhuAwal) / 5;
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Celcius adalah " + valSuhuAkhir + " Reamur.");
                                break;
                            case 2:         // celcius->celcius
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Celcius adalah " + valSuhuAwal + " Celcius.");
                                break;
                            case 3:         // celcius->kelvin
                                valSuhuAkhir = valSuhuAwal + 273;
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Celcius adalah " + valSuhuAkhir + " Kelvin.");
                                break;
                            case 4:         // celcius->farenheit
                                valSuhuAkhir = ((9 * valSuhuAwal) / 5) + 32;
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Celcius adalah " + valSuhuAkhir + " Farenheit.");
                                break;
                            default:
                                System.out.println("Menu yang Anda masukkan salah.");
                                break;
                        }
                        break;
                    case 3:         // kelvin
                        switch (suhuAkhir) {
                            case 1:         // kelvin->reamur
                                valSuhuAkhir = (4 * (valSuhuAwal - 273)) / 5;
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Kelvin adalah " + valSuhuAkhir + " Reamur.");
                                break;
                            case 2:         // kelvin->celcius
                                valSuhuAkhir = valSuhuAwal - 273;
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Kelvin adalah " + valSuhuAkhir + " Celcius.");
                                break;
                            case 3:         // kelvin->kelvin
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Kelvin adalah " + valSuhuAwal + " Kelvin.");
                                break;
                            case 4:         // kelvin->farenheit
                                valSuhuAkhir = ((9 * (valSuhuAwal - 273)) / 5) + 32;
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Kelvin adalah " + valSuhuAkhir + " Farenheit.");
                                break;
                            default:
                                System.out.println("Menu yang Anda masukkan salah.");
                                break;
                        }
                        break;
                    case 4:         // farenheit
                        switch (suhuAkhir) {
                            case 1:         // farenheit->reamur
                                valSuhuAkhir = (4 * (valSuhuAwal - 32)) / 9;
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Farenheit adalah " + valSuhuAkhir + " Reamur.");
                                break;
                            case 2:         // farenheit->celcius
                                valSuhuAkhir = (5 * (valSuhuAwal - 32)) / 9;
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Farenheit adalah " + valSuhuAkhir + " Celcius.");
                                break;
                            case 3:         // farenheit->kelvin
                                valSuhuAkhir = ((5 * (valSuhuAwal - 32)) / 9) + 273;
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Farenheit adalah " + valSuhuAkhir + " Reamur.");
                                break;
                            case 4:         // farenheit->farenheit
                                System.out.println("Konversi suhu dari " + valSuhuAwal + 
                                                   " Farenheit adalah " + valSuhuAwal + " Farenheit.");
                                break;
                            default:
                                System.out.println("Menu yang Anda masukkan salah.");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Menu yang Anda masukkan salah.");
                        break;
                }
            } else System.out.println("Menu yang Anda masukkan salah.");
        } else System.out.println("Menu yang Anda masukkan salah.");
    }
}

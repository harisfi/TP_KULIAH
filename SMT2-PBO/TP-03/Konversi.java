/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author hryzx
 */
public class Konversi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Suhu suhu = new Suhu();
        Minyak minyak = new Minyak();
        
        boolean lanjut = true;
        int pilih;
        double hasil;
        
        do {
            System.out.println("Menu Konversi:\n"
                    + "1. Celcius ke Farenheit\n"
                    + "2. Celcius ke Reamur\n"
                    + "3. Konversi Minyak Tanah\n"
                    + "4. Keluar Program\n");
            System.out.print("Masukkan pilihan Anda: ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1 -> {
                    System.out.print("Masukkan suhu celcius: ");
                    suhu.suhuCel = in.nextDouble();
                    hasil = suhu.CelciusToFarenheit();
                    System.out.println("Suhu hasil konversi adalah " + hasil + "°F\n");
                }
                case 2 -> {
                    System.out.print("Masukkan suhu celcius: ");
                    suhu.suhuCel = in.nextDouble();
                    hasil = suhu.CelciusToReamur();
                    System.out.println("Suhu hasil konversi adalah " + hasil + "°Ré\n");
                }
                case 3 -> minyak.cetakKonversi();
                case 4 -> lanjut = false;
                default -> System.out.println("Anda memasukkan pilihan yang salah.\n");
            }
        } while(lanjut);
    }
}

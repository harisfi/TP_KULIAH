/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author hryzx
 */
public class Aktivitas {
    public static void main(String[] args) {
        Nasabah haris = new Nasabah();
        haris.namaNasabah = "Muhammad Haris";
        
        haris.jumMenabung = 50000;
        haris.menabung();
        System.out.println("Saldo ditambahkan Rp. " + haris.jumMenabung);
        
        haris.jumAmbil = 20000;
        haris.ambilTabungan();
        System.out.println("Saldo diambil Rp. " + haris.jumAmbil);
        
        double bunga = haris.hitungBunga(2.5);
        System.out.println("Bunga Anda: " + bunga);
        
        haris.tampilData();
    }
}

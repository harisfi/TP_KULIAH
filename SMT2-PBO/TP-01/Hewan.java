/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author hryzx
 */
public class Hewan {
    String nama;
    String makanan;
    int berat;
    int umur;
    
    void makan(){
        System.out.println(nama + " yang berumur " + umur + " tahun sekarang sedang makan " + makanan);
    }
    
    void jalan() {
        System.out.println(nama + " dengan berat " + berat + " kg sedang berjalan-jalan");
    }
    
    void tidur() {
        System.out.println(nama + " sedang tidur");
    }
}

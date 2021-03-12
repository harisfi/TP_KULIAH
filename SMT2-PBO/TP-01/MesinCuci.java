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
public class MesinCuci {
    int jumlahTabung;
    int beratIsi;
    
    void dinyalakan() {
        System.out.println("Mesin cuci dengan jumlah tabung " + jumlahTabung + " dinyalakan");
    }
    
    void dimatikan() {
        System.out.println("Mesin cuci dimatikan");
    }
    
    void membilas() {
        System.out.println("Mesin cuci membilas pakaian");
    }
    
    void merendam() {
        System.out.println("Mesin cuci merendam pakaian dengan berat isi " + beratIsi + " kg");
    }
    
    void mengeringkan() {
        System.out.println("Mesin cuci mengeringkan pakaian");
    }
}

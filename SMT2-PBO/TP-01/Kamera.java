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
public class Kamera {
    String merk;
    int pixel;
    int harga;
    
    void dinyalakan() {
        System.out.println("Kamera " + merk + " dengan harga " + harga + " dinyalakan");
    }
    
    void dimatikan() {
        System.out.println("Kamera " + merk + " dimatikan");
    }
    
    void mengambilGambar() {
        System.out.println("Kamera " + merk + " merngambil gambar " + pixel + "MP");
    }
    
    void mengambilVideo() {
        System.out.println("Kamera " + merk + " merngambil video " + pixel + "MP");
    }
}

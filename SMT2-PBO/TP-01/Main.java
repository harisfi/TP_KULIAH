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
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan();
        kucing.nama = "Garfield";
        kucing.makanan = "Whiskas";
        kucing.berat = 2;
        kucing.umur = 3;
        kucing.makan();
        kucing.jalan();
        kucing.tidur();
        
        MesinCuci sharp = new MesinCuci();
        sharp.jumlahTabung = 2;
        sharp.beratIsi = 5;
        sharp.dinyalakan();
        sharp.merendam();
        sharp.membilas();
        sharp.mengeringkan();
        sharp.dimatikan();
        
        Kamera mirrorless = new Kamera();
        mirrorless.merk = "Canon";
        mirrorless.pixel = 50;
        mirrorless.harga = 15;
        mirrorless.dinyalakan();
        mirrorless.mengambilGambar();
        mirrorless.mengambilVideo();
        mirrorless.dimatikan();
    }
}

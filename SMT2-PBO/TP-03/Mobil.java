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
enum Tipe {
    TRUK,
    PICK_UP
};

public class Mobil {
    private String namaMobil;
    private int beratSekarang;
    private Tipe jenisMobil;

    public String getNamaMobil() {return namaMobil;}

    public void setNamaMobil(String namaMobil) {this.namaMobil = namaMobil;}

    public int getBeratSekarang() {return beratSekarang;}

    public void setBeratSekarang(int beratSekarang) {this.beratSekarang = beratSekarang;}

    public Tipe getJenisMobil() {return jenisMobil;}

    public void setJenisMobil(Tipe jenisMobil) {this.jenisMobil = jenisMobil;}
    
    public void tambahBarang(int berat) {
        if (jenisMobil == Tipe.TRUK) {
            if (beratSekarang + berat > 10000) {
                System.out.println("Berat melebihi batas maksimal");
            } else {
                beratSekarang += berat;
                System.out.println("Tambah barang lagi");
            }
        } else {
            if (beratSekarang + berat > 5000) {
                System.out.println("Berat melebihi batas maksimal");
            } else {
                beratSekarang += berat;
                System.out.println("Tambah barang lagi");
            }
        }
    }
    
    public void kurangiBarang(int berat) {
        beratSekarang -= berat;
    }
}

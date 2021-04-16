/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6._2;

/**
 *
 * @author hryzx
 */
public class Segitiga extends Bangun2D{
    private int alas, tinggi;

    Segitiga(String namanya) {
        super.Bentuk(namanya);
    }
    
    @Override
    float hitungLuas() {
        return (float) (0.5 * alas * tinggi);
    }
    
    public static void main(String[] args) {
        Segitiga s = new Segitiga("Segitiga");
        s.alas = 10;
        s.tinggi = 5;
        System.out.println(s.getNama() + " dengan alas " + s.alas +
                " dan tinggi " + s.tinggi + " memiliki luas " + s.hitungLuas());
    }
}

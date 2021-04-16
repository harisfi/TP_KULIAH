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
public class Lingkaran extends Bangun2D{
    private int jari;

    Lingkaran(String namanya) {
        super.Bentuk(namanya);
    }

    @Override
    float hitungLuas() {
        return (float) (Math.PI * jari * jari);
    }
    
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran("Lingkaran");
        l.jari = 10;
        System.out.println(l.getNama() + " dengan jari-jari " +
                l.jari + " memiliki luas " + l.hitungLuas());
    }
}

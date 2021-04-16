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
public class Segiempat extends Bangun2D{
    private int sisi;
    
    Segiempat(String namanya) {
        super.Bentuk(namanya);
    }
    
    @Override
    float hitungLuas() {
        return sisi * sisi;
    }
    
    public static void main(String[] args) {
        Segiempat s4 = new Segiempat("Persegi");
        s4.sisi = 7;
        System.out.println(s4.getNama() + " dengan sisi " + s4.sisi +
                " memiliki luas " + s4.hitungLuas());
    }
}

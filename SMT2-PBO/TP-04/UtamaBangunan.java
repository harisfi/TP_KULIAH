/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author hryzx
 */
public class UtamaBangunan {
    public static void main(String[] args) {
        PersegiPanjang parent = new PersegiPanjang();
        parent.panjang = 5;
        parent.lebar = 7;
        parent.keliling();
        parent.luas();
        
        Balok child = new Balok();
        child.panjang = 5;
        child.lebar = 2;
        child.tinggi = 3;
        child.volum();
    }
}

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
public class PersegiPanjang {
    public int panjang, lebar;
    
    public void keliling() {
        System.out.println("Keliling persegi panjang adalah " + (2 * (panjang + lebar)));
    }
    
    public void luas() {
        System.out.println("Luas persegi panjang adalah " + (panjang * lebar));
    }
}

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
public class Balok extends PersegiPanjang{
    public int tinggi;
    
    public void volum() {
        System.out.println("Volume balok adalah " + (panjang * lebar * tinggi));
    }
}

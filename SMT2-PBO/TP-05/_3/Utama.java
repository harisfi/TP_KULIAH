/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5._3;

/**
 *
 * @author hryzx
 */
public class Utama {
    public static void main(String[] args) {
        BangunDatar[] datar = new BangunDatar[2];
        
        datar[0] = new Lingkaran(10);
        datar[1] = new Persegi(5);
        
        for (BangunDatar datar1 : datar) {
            System.out.println("Luas dari " + datar1.getClass().getSimpleName() + " adalah " + datar1.luas());
        }
    }
}

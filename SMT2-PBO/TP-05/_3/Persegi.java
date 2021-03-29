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
public class Persegi extends BangunDatar{
    double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    public double luas() {
        return sisi * sisi;
    }
}

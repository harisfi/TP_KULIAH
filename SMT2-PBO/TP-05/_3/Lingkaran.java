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
public class Lingkaran extends BangunDatar{
    double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }
    
    public double luas() {
        return Math.PI * radius * radius;
    }
}

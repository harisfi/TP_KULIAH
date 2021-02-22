/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static java.lang.Math.pow;

/**
 *
 * @author hryzx
 */
public class Lingkaran {
    // ini adalah program menghitung luas lingkaran
    public static double PHI = 3.14;
    public static double r, L;
    public static void main(String[] args) {
        r = 10;
        L = PHI * pow(r, 2);
        System.out.println("Luas dengan r "+r+" adalah "+L);
    }
}

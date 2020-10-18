/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hryzx
 */
public class Praktik2 {
    // ini adalah program menghitung luas balok
    public static double L,V,p,l,t;
    public static void main(String[] args) {
        p = 10;
        l = 6;
        t = 8;

        //menghitung luas
        L = (2*p*l)+(2*p*t)+(2*t*t);
        //menghitung volume
        V = p*l*t;
        System.out.println("Balok dengan p:"+p+", l:"+l+", t:"+t+" memiliki\n"+
                "Luas : "+L+
                "\nVolume : "+V);
    }
}

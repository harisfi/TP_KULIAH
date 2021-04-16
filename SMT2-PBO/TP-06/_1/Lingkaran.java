/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6._1;

/**
 *
 * @author hryzx
 */
public class Lingkaran implements Bangun2D{
    private double jari;

    @Override
    public double hitungLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double hitungKeliling() {
        return Math.PI * (jari * 2);
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran();
        l.setJari(100);
        System.out.println("Lingkaran dengan jari-jari " +
                l.getJari() + " memiliki keliling " + l.hitungKeliling());
        System.out.println("Lingkaran dengan jari-jari " +
                l.getJari() + " memiliki luas " + l.hitungLuas());
    }
}

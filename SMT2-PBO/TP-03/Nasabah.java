/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author hryzx
 */
public class Nasabah {
    private int jumTabungan;
    String namaNasabah;
    int jumMenabung, jumAmbil;
    
    public int menabung() {
        if (jumMenabung < 0) {
            System.out.println("Anda tidak bisa menabung dengan jumlah negatif");
        } else {
            jumTabungan += jumMenabung;
        }
        return jumTabungan;
    }
    
    public void ambilTabungan() {
        jumAmbil = Math.abs(jumAmbil);
        jumTabungan -= jumAmbil;
    }
    
    public double hitungBunga(double bungaRate) {
        return jumTabungan * bungaRate / 100;
    }
    
    public void tampilData() {
        System.out.println("Nama nasabah: " + namaNasabah + "\nSisa saldo: Rp. " + jumTabungan);
    }
}

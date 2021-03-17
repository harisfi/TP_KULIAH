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
public class MobilAngkutan {
    public static void main(String[] args) {
        Mobil mobil_1 = new Mobil();
        mobil_1.setNamaMobil("Fuso");
        mobil_1.setJenisMobil(Tipe.TRUK);
        mobil_1.setBeratSekarang(0);
        
        mobil_1.tambahBarang(9000);
        mobil_1.tambahBarang(2000);
        mobil_1.kurangiBarang(5000);
        
        getInfo(mobil_1);
        
        Mobil mobil_2 = new Mobil();
        mobil_2.setNamaMobil("Grand Max");
        mobil_2.setJenisMobil(Tipe.PICK_UP);
        mobil_2.setBeratSekarang(0);
        
        mobil_2.tambahBarang(3000);
        mobil_2.tambahBarang(4000);
        mobil_2.kurangiBarang(500);
        
        getInfo(mobil_2);
    }
    
    public static void getInfo(Mobil mobil) {
        System.out.println(mobil.getNamaMobil() +
                " adalah " + mobil.getJenisMobil() + 
                " dengan berat muatan " + mobil.getBeratSekarang() + " kg");
    }
}

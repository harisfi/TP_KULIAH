/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6._2;

/**
 *
 * @author hryzx
 */
public abstract class Bangun2D {
    private String nama;
    
    void Bentuk(String namanya) {
        nama = namanya;
    }
    
    String getNama() {
        return nama;
    }
    
    abstract float hitungLuas();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author hryzx
 */

enum Lingkup {
    KAMPUS,
    FAKULTAS,
    
}

public class OrganisasiKampus {
    private String nama;
    private Lingkup lingkup;
    private int tahunBerdiri;
    private int jumlahAngota;
    
    public String getNama() {
        return nama;
    }

    public Lingkup getLingkup() {
        return lingkup;
    }

    public int getTahunBerdiri() {
        return tahunBerdiri;
    }

    public int getJumlahAngota() {
        return jumlahAngota;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLingkup(Lingkup lingkup) {
        this.lingkup = lingkup;
    }

    public void setTahunBerdiri(int tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }
    
    public String adakanAcara(String namaAcara) {
        return nama + " mengadakan acara " + namaAcara;
    }
    
    public void rekrutAnggota(int jumlah) {
        jumlahAngota += jumlah;
    }
    
    public String getDescription() {
        return nama + " adalah salah satu organisasi " + lingkup + " yang berdiri pada " +
                tahunBerdiri + "\ndan saat ini memiliki " + jumlahAngota + " anggota.";
    }
}

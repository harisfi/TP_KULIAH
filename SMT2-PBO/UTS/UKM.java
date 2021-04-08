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
public class UKM extends OrganisasiKampus{
    private String tipe;

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    
    @Override
    public String getDescription() {
        return super.getNama() + " adalah salah satu organisasi " + getTipe() + " yang melingkupi " +
                super.getLingkup() + "\nyang berdiri pada " + super.getTahunBerdiri() + " dan saat ini " +
                "memiliki " + super.getJumlahAngota() + " anggota.";
    }
}

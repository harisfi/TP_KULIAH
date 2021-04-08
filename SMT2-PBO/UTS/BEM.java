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
public class BEM extends OrganisasiKampus{
    public String adakanAcara(String namaAcara, String lokasi, int biaya) {
        return super.getNama() + " mengadakan acara " + namaAcara + " di " + lokasi + " dengan biaya Rp" + biaya;
    }
}

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
public class UtamaOrganisasi {
    public static void main(String[] args) {
        String[] bems = {"EM UB", "BEM Vokasi", "Bem Filkom"};
        Lingkup[] lingkupBem = {Lingkup.KAMPUS, Lingkup.FAKULTAS, Lingkup.FAKULTAS};
        
        String[] ukms = {"UKM Catur", "UKM Jurnal", "UKM Riset"};
        String[] tipeUkm = {"olahraga", "jurnalistik", "keilmuan"};
        Lingkup[] lingkupUkm = {Lingkup.KAMPUS, Lingkup.KAMPUS, Lingkup.FAKULTAS};
        
        OrganisasiKampus dpm = new OrganisasiKampus();
        dpm.setNama("DPM Vokasi");
        dpm.setLingkup(Lingkup.FAKULTAS);
        dpm.setTahunBerdiri(2000);
        dpm.rekrutAnggota(70);
        System.out.println(dpm.getDescription());
        System.out.println("-----------------------");
        
        BEM[] bemArr = new BEM[bems.length];
        for (int i = 0; i < bemArr.length; i++) {
            bemArr[i] = new BEM();
            bemArr[i].setNama(bems[i]);
            bemArr[i].setLingkup(lingkupBem[i]);
            bemArr[i].setTahunBerdiri(2000 + i);
            bemArr[i].rekrutAnggota(80 - i);
        }
        
        for (BEM b : bemArr) {
            System.out.println(b.adakanAcara("Pemira", "Samantha Krida", 3000000));
            System.out.println(b.getDescription());
            System.out.println("-----------------------");
        }
        
        UKM[] ukmArr = new UKM[ukms.length];
        for (int i = 0; i < ukmArr.length; i++) {
            ukmArr[i] = new UKM();
            ukmArr[i].setNama(ukms[i]);
            ukmArr[i].setTipe(tipeUkm[i]);
            ukmArr[i].setLingkup(lingkupUkm[i]);
            ukmArr[i].setTahunBerdiri(2003 + i);
            ukmArr[i].rekrutAnggota(100 + (i*10));
        }
        
        for (UKM u : ukmArr) {
            System.out.println(u.adakanAcara("Lomba"));
            System.out.println(u.getDescription());
            System.out.println("-----------------------");
        }
    } 
}

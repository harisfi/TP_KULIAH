/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hryzx
 */
public class DataMusik {
    private final List<String[]> listMusik = new ArrayList<>();

    public DataMusik() {
        String[][] arrMusik = {{"Nidji", "Laskar Pelangi"},
            {"Drake", "In My Feelings"}};
        
        for (String[] musik : arrMusik) {
            tambahMusik(musik[0], musik[1]);
        }
        
        System.out.println("Print dari konstruktor:");
        printMusik();
    }
    
    void tambahMusik(String namaBand, String judul) {
        String tambahan[] = {namaBand, judul};
        listMusik.add(tambahan);
    }
    
    void printMusik() {
        listMusik.forEach(musik -> {
            System.out.println(musik[0] + " - " + musik[1]);
        });
    }
    
    String cariMusik(String query) {
        String hasil = "Tidak ditemukan";
        
        query = query.toLowerCase();
        
        for (String[] musik : listMusik) {
            if (musik[0].toLowerCase().contains(query) || musik[1].toLowerCase().contains(query)) {
                hasil = "Musik ditemukan => " + musik[0] + " - " + musik[1];
            }
        }
        
        return hasil;
    }
    
    void clearData() {
        listMusik.clear();
        System.out.println("Data musik telah dihapus");
    }
}

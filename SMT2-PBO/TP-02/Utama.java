/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author hryzx
 */
public class Utama {
    
    public static void main(String[] args) {
        DataMusik dataMusik = new DataMusik();
        String[] arrMusik = {"Denny Caknan", "Los Dol"};
        
        dataMusik.tambahMusik(arrMusik[0], arrMusik[1]);
        
        System.out.println("\nPrint dari main:");
        dataMusik.printMusik();
        
        System.out.println("\n" + dataMusik.cariMusik("caknan"));
        
        dataMusik.clearData();
    }
    
}

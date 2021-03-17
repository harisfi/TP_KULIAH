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
public class ISL {
    static String pelatih  = "Suharno";
    
    public static void main(String[] args) {
        Club arema = new Club();
        arema.clubName = "Arema Indonesia";
        String nameClub = arema.getClub();
        arema.pelatih = pelatih;
        
        System.out.println(nameClub);
        
        Player mega = new Player();
        mega.playerName = "Kurnia Mega";
        String namePlayer = mega.getPlayer();
        System.out.println(namePlayer);
    }    
}

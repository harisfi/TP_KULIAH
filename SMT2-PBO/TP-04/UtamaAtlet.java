/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author hryzx
 */
public class UtamaAtlet {
    public static void main(String[] args) {
        Athlete campuran = new Athlete("Paijo", 158, 68);
        campuran.getDescription();
        batas();
        BasketballPlayer pemainBasket = new BasketballPlayer("Bryant", 198, 96, 25);
        pemainBasket.getDescription();
        batas();
        BaseballPlayer pemainBaseball = new BaseballPlayer("Mike", 182, 78, 57);
        pemainBaseball.getDescription();
    }
    
    private static void batas() {
        System.out.println("===============================");
    }
}

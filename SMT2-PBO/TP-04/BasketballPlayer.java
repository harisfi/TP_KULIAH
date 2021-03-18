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
public class BasketballPlayer extends Athlete{
    private final int shootLv;
    
    public BasketballPlayer(String n, int h, int w, int sl) {
        super(n, h, w);
        this.shootLv = sl;
    }
    
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Aku memiliki shoot level " + shootLv);
    }
}

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
public class BaseballPlayer extends Athlete{
    private final int hitLv;
    
    public BaseballPlayer(String n, int h, int w, int hl) {
        super(n, h, w);
        this.hitLv = hl;
    }
    
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Aku memiliki hit level " + hitLv);
    }
}

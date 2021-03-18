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
public class Athlete {
    private final String name;
    private final int height, weight;
    
    public Athlete(String n, int h, int w) {
        this.name = n;
        this.height = h;
        this.weight = w;
    }
    
    private void getName() {
        System.out.println("Halo, namaku " + name);
    }
    
    public void getDescription() {
        getName();
        System.out.println("Tinggi badanku " + height);
        System.out.println("Berat badanku " + weight);
    }
}

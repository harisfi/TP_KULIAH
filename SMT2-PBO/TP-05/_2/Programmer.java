/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5._2;

/**
 *
 * @author hryzx
 */
public class Programmer extends Employee{
    private static final int prgSal = 50000;
    private static final int prgBonus = 10000;
    
    public int salary() {
        return prgSal;
    }
    
    public int bonus() {
        return prgBonus;
    }
}

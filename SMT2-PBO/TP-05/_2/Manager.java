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
public class Manager extends Employee{
    private static final int mgrSal = 40000;
    private static final int tunjangan = 40000;
    
    public int salary() {
        return mgrSal;
    }
    
    public int tunjangan() {
        return tunjangan;
    }
}

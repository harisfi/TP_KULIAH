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
public class Suhu {
    double suhuCel;
    
    public double CelciusToFarenheit() {
        return (suhuCel * (9/5)) + 32;
    }
    
    public double CelciusToReamur() {
        return suhuCel * 4/5;
    }
}

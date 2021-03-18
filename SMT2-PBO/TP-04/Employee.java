/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

import java.util.Date;

/**
 *
 * @author hryzx
 */
public class Employee {
    public String name;
    public double salary;
    public Date birthDate;
    
    public String getDetails() {
        return "Hallo, namaku " + name + ", gajiku " + salary + ", dan aku lahir pada " + birthDate;
    }
}

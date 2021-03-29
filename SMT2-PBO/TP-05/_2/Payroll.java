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
public class Payroll {
    public int calcPayroll(Employee emp) {
        int money = emp.salary();
        
        if (emp instanceof Manager)
            money += ((Manager) emp).tunjangan();
        if (emp instanceof Programmer)
            money += ((Programmer) emp).bonus();
        return money;
    }
    
    public static void main(String[] args) {
        Payroll pr = new Payroll();
        Programmer prg = new Programmer();
        Manager mgr = new Manager();
        System.out.println("Payroll untuk Programmer: " + pr.calcPayroll(prg));
        System.out.println("Payroll untuk Manager: " + pr.calcPayroll(mgr));
    }
}

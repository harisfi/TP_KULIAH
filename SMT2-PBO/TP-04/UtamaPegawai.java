/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author hryzx
 */
public class UtamaPegawai {
    public static void main(String[] args) throws ParseException {        
        Employee pegawai = new Employee();
        pegawai.name = "Udin";
        pegawai.salary = 4000000;
        pegawai.birthDate = new GregorianCalendar(2000, Calendar.FEBRUARY, 10).getTime();
        System.out.println(pegawai.getDetails());
        
        Engineer insinyur = new Engineer();
        insinyur.name = "Iqbal";
        insinyur.salary = 8000000;
        insinyur.birthDate = new GregorianCalendar(2001, Calendar.SEPTEMBER, 23).getTime();
        System.out.println(insinyur.getDetails());
        
        Manager manajer = new Manager();
        manajer.name = "Alex";
        manajer.salary = 9000000;
        manajer.birthDate = new GregorianCalendar(2001, Calendar.MAY, 17).getTime();
        System.out.println(manajer.getDetails());
        
        Secretary sekretaris = new Secretary();
        sekretaris.name = "Wulan";
        sekretaris.salary = 5500000;
        sekretaris.birthDate = new GregorianCalendar(2000, Calendar.NOVEMBER, 5).getTime();
        System.out.println(sekretaris.getDetails());
    }
}

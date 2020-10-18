
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hryzx
 */
public class Tugas4c {
    public static double a, b, c, x, y, z;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkkan a:");
        a = in.nextDouble();
        System.out.println("Masukkkan b:");
        b = in.nextDouble();
        System.out.println("Masukkkan c:");
        c = in.nextDouble();
        
        x = 4*b;
        y = 2*a;
        z = (a*x) + (b*y*y) + c;
        
        System.out.println("Nilai x:" + x);
        System.out.println("Nilai y:" + y);
        System.out.println("Nilai z:" + z);
    }
}

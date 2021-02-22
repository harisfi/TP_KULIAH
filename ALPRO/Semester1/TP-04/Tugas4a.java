
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
public class Tugas4a {
    public static int p, l, harga = 300000, total;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan panjang :");
        p = in.nextInt();
        System.out.println("Masukkan lebar :");
        l = in.nextInt();
        total = (p+l)*2*harga;
        System.out.println("Total Harga untuk pagar dengan p:"+p+" dan l:"+l+" adalah "+total);
    }
}

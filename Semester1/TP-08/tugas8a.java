import java.util.ArrayList;
import java.util.Scanner;

/**
 * sorting 2001 angka dalam 0.38s -> https://ideone.com/fohn39
 * @author hryzx
 */
public class tugas8a {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(),
                           arrTmp = new ArrayList<>();
        int jumlah, x;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan jumlah elemen dalam array: ");
        jumlah = in.nextInt();
        System.out.print("Masukkan data elemen ke-1: ");
        arr.add(in.nextInt());
        
        for (int i = 1; i < jumlah; i++) {
            System.out.print("Masukkan data elemen ke-" + (i+1) + ": ");
            x = in.nextInt();
            if (x >= arr.get(arr.size()-1)) arr.add(x);
            else {
                arrTmp.clear();
                if (x <= arr.get(0)) {
                    arrTmp.add(x);
                    arrTmp.addAll(arr);
                } else {
                    for (int j = 0; j < arr.size()-1; j++) {
                        arrTmp.add(arr.get(j));
                        if ((arr.get(j) < x && arr.get(j+1) > x) || (arr.get(j) == x)) arrTmp.add(x);
                    }
                    arrTmp.add(arr.get(arr.size()-1));
                }
                arr.clear();
                arr.addAll(arrTmp);
            }
        }
        
        System.out.println("Data yang terurut:");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}
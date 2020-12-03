import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hryzx
 */
public class tugas8c {
    public static void main(String[] args) {
        ArrayList<ArrayList> anggota = new ArrayList<>();
        ArrayList<Integer> angCTmp = new ArrayList<>(),
                           angDTmp = new ArrayList<>(),
                           angETmp = new ArrayList<>(),
                           angFTmp = new ArrayList<>();
        String[] str = {"(gabungan)", "(irisan)", "(selisih)", "(perbedaan simetris)"};
        int jumlah, x;
        
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan jumlah anggota " + (char)(65+i) + ": ");
            jumlah = in.nextInt();
            ArrayList<Integer> angAnBTmp = new ArrayList();
            System.out.println("Masukkan anggota " + (char)(65+i));
            for (int j = 0; j < jumlah; j++) {
                System.out.print("Masukkan anggota " + (char)(65+i) + " ke-" + (j+1) + ": ");
                x = in.nextInt();
                angAnBTmp.add(x);
                if (!angCTmp.contains(x)) angCTmp.add(x);
                if (i==1){
                    if (anggota.get(0).contains(x) && !angDTmp.contains(x)) angDTmp.add(x);
                    if (angETmp.contains(x)) angETmp.remove(angETmp.indexOf(x));
                    if (angFTmp.contains(x) && anggota.get(0).contains(x)) angFTmp.remove(angFTmp.indexOf(x));
                    else if (!anggota.get(0).contains(x)) angFTmp.add(x);
                }
            }
            anggota.add(angAnBTmp);
            if (i==0) {
                angETmp.addAll(angAnBTmp);
                angFTmp.addAll(angAnBTmp);
            }
        }
        anggota.add(angCTmp);
        anggota.add(angDTmp);
        anggota.add(angETmp);
        anggota.add(angFTmp);
        
        for (int i = 0; i < anggota.size(); i++) {
            System.out.print("Anggota " + (char)(65+i));
            if (i > 1)  System.out.print(str[i-2]);
            System.out.print(": {");
            for (int j = 0; j < anggota.get(i).size(); j++) {
                System.out.print(anggota.get(i).get(j));
                if (j!=anggota.get(i).size()-1) System.out.print(", ");
            }
            System.out.println("}");
        }
    }
}
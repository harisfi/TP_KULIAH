/**
 *
 * @author hryzx
 */
public class praktik2 {
    public static void main(String[] args) {
        int hasil = 0;
        
        for (int i = 1; i <= 6; i++) {
            if (i % 2 != 0) {   // ganjil
                System.out.print("+" + i);
                hasil += i;
            } else {            // genap
                System.out.print("-" + i);
                hasil -= i;
            }
        }
        System.out.println("=" + hasil);
    }
}

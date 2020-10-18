/**
 * OPERATOR DAN EKSPRESI
 * @author hryzx
 */
public class Praktik5a {
    public static void main(String[] args) {
        int a, b, c;
        int d;
//        boolean d;
        
        a = 20;
        b = 30;
        c = 3;
        d = 5;
        System.out.println("Nilai variabel awal adalah :\n" +
                           "a = " + a + ", b = " + b + ", c = " + c);
        // aritmatika
        d = a * b + c;      //603
//        d = a * (b + c);    //660
//        d = a + b / b - a;  //1
//        d = a % c;          //2
        //penaikan dan penurunan
//        d = b++ + 10;       //40
//        d = ++b + 10;       //41
//        d = b-- + 10;       //40
//        d = --b + 10;       //39
        //bitwise
//        d = b & c;          //2
//        d = b | c;          //31
//        d = b >> 1;         //15
//        d = b << 2;         //120
        //penaikan dan penurunan majemuk
//        d += 2;             //7
//        d *= 2;             //10
//        d &= 2;             //0
        //penugasan
//        d = 20;             //20
//        d = 9;              //9
        //kondisi
//        d = a<b ? a:b;      //20
//        d = a>b ? a:b;      //30
        //relasi
//        d = 12 > 3;         //true
//        d = 12 < 3;         //false
        //logika
//        d = (a < 15) && (a > 25);   //false
//        d = (b < 15) || (b > 25);   //true
//        d = (a < 15) ^ (a > 25);    //false
        
        System.out.println("d = " + d);
    }
}

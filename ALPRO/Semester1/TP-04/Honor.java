import java.util.Scanner;

public class Honor {
    public static final int tunjangan = 500000;
    public static double honor, hari, gaji_kotor, gaji_bersih, potongan, pajak = 0.05;
    
    public static void main(String[] args) {
        System.out.println("Masukkan honor/hari pegawai : ");
        Scanner user = new Scanner(System.in);
        honor = user.nextInt();
        System.out.println("Masukkan jumlah hari bekkerja : ");
        hari = user.nextInt();
        gaji_kotor = (honor*hari)+tunjangan;
        potongan = gaji_kotor * pajak;
        gaji_bersih = gaji_kotor - potongan;
        System.out.println("honor pegawai :");
        System.out.println("gaji kotor : " + gaji_kotor);
        System.out.println("pajak      : " + potongan);
        System.out.println("gaji bersih: " + gaji_bersih);
    }
}

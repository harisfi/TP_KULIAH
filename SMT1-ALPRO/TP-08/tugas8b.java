import java.util.Scanner;

/**
 *
 * @author hryzx
 */
public class tugas8b {
    public static void main(String[] args) {
        int baris, kolom, pilihan;
        String[] hasil = new String[3];
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        baris = in.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        kolom = in.nextInt();
        
        int[][][] himp = new int[2][baris][kolom];
        for (int i = 0; i < 2; i++) {
            hasil[i] = "Matriks " + (char)(65 + i) + ":\n";
            System.out.println("Himpunan " + (char)(65 + i));
            for (int j = 0; j < baris; j++) {
                for (int k = 0; k < kolom; k++) {
                    System.out.print("Masukkan data " + (char)(65 + i) + "[" + j + "][" + k + "]: ");
                    himp[i][j][k] = in.nextInt();
                    hasil[i] += himp[i][j][k] + " ";
                }
                hasil[i] += "\n";
            }
        }
        System.out.println("1. Penjumlahan A+B\n" +
                            "2. Pengurangan A-B\n" +
                            "3. Perkalian AxB");
        System.out.print("Masukkan pilihan Anda: ");
        pilihan = in.nextInt();
        
        switch(pilihan) {
            case 1:
                hasil[2] = "Matriks A+B:\n";
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        hasil[2] += (himp[0][i][j] + himp[1][i][j]) + " ";
                    }
                    hasil[2] += "\n";
                }
                break;
            case 2:
                hasil[2] = "Matriks A-B:\n";
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        hasil[2] += (himp[0][i][j] - himp[1][i][j]) + " ";
                    }
                    hasil[2] += "\n";
                }
                break;
            case 3:
                if (baris == kolom) {
                    hasil[2] = "Matriks A+B:\n";
                    for (int i = 0; i < kolom; i++) {
                        for (int j = 0; j < baris; j++) {
                            int r = 0;
                            for (int k = 0; k < kolom; k++) {
                                r += himp[0][i][k] * himp[1][k][j];
                            }
                            hasil[2] += r + " ";
                        }
                        hasil[2] += "\n";
                    }
                } else {
                    hasil[0] = "Matriks hanya dapat dikalikan jika baris sama dengan kolom\n";
                hasil[1] = "\n";
                }
                break;
            default:
                hasil[0] = "Angka yang anda masukkan tidak ada dalam pilihan";
                hasil[1] = "\n";
        }
        System.out.print(hasil[0] + hasil[1] + hasil[2]);
    }
}
import java.util.Arrays;

public class Tugas3b {
    public static void main(String[] args) {
        double NA, UTS, UAS, UKK;
        double[] quiz = {95, 88, 90};
        UTS = 75;
        UAS = 80;
        UKK = Arrays.stream(quiz).average().orElse(Double.NaN);
        NA = (UTS*0.15)+(UAS*0.15)+(UKK*0.70);
        System.out.println("Nilai Akhir Anda : " + (Math.round(NA * 100.0)/100.0));
    }
}

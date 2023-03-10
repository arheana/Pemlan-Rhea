import java.util.Scanner;
import static java.lang.Math.PI;

public class nama {
    static int hitungLuas(int r) {
        return (int) (PI*r);
    }

    static int hitungKeliling(int d) {
        return (int) (PI*d);
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jari-jari = ");
            int r = input.nextInt();
            System.out.print("Masukkan diameter = ");
            int d = input.nextInt();
            System.out.println("Luas = " + hitungLuas(r));
            System.out.println("Keliling = " + hitungKeliling(d));
        }
    }
}

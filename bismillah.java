import java.util.Scanner;

public class bismillah {
    static int hitungLuas(int s){
        return s*s;
    }

    static int hitungKeliling(int s) {
        return s*4;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("masukkan panjang sisi = ");
            int s = input.nextInt();
            System.out.println("luasnya adalah " + hitungLuas(s));
            System.out.println("keliling adalah " + hitungKeliling(s));
        }
    }
    
}

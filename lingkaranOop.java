8396-BEAFimport java.util.Scanner;

class BangunDatar{
    public int panjang;
    public int lebar;
    public double luas;
    public double keliling;
}

class Lingkaran extends BangunDatar{
    public int luas;
    public int keliling;

    public double hitungLuas(int jari){
        this.luas = (int) (Math.PI * jari);
        return jari;
    }

    public double hitungKeliling(int jari){
        this.keliling = (int) (Math.PI * (2*jari));
        return jari;
    }
}

class Persegi extends BangunDatar{
	public int luas;
    public int keliling;
    
    public double hitungLuas(int panjang, int lebar){
    this.luas = (int) (panjang*lebar);
    return panjang*lebar;
    }
    
    public double hitungKeliling(int panjang, int lebar){
    this.keliling = (int) 2*panjang + 2*lebar;
    return 2*panjang + 2*lebar;
    }
}

class lingkaranOop {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilihlah salah satu program yang ingin dijalankan:");
        System.out.println("1. Menghitung luas dan keliling lingkaran");
        System.out.println("2. Menghitung luas dan keliling persegi");
        System.out.print("Masukkan pilihanmu = ");
        int pilihanmu = input.nextInt();
        System.out.println("====================");

        switch (pilihanmu){
            case 1 :
            System.out.println("MENGHITUNG LUAS DAN KELILING LINGKARAN");
            Lingkaran bulet1 = new Lingkaran();
            System.out.print("Masukkan panjang jari-jari lingkaran = ");
            bulet1.panjang = input.nextInt();
            bulet1.hitungLuas(bulet1.panjang);
            System.out.println("Lingkaran dengan jari-jari = " + bulet1.panjang + " memiliki luas = " + bulet1.luas);
            break;

            case 2 :
            System.out.println("MENGHITUNG LUAS DAN KELILING PERSEGI");
            Persegi kotak1 = new Persegi(); 
            System.out.print("Masukkan panjang persegi = ");
            kotak1.panjang = input.nextInt();
            System.out.print("Masukkan lebar persegi = ");
            kotak1.lebar = input.nextInt();
            kotak1.hitungLuas(kotak1.panjang,kotak1.lebar);
            kotak1.hitungKeliling(kotak1.panjang,kotak1.lebar);
            System.out.println("Persegi dengan panjang = " + kotak1.panjang + " dan lebar = " + kotak1.lebar + " memiliki luas = " + kotak1.luas + " dan keliling = " + kotak1.keliling);
            break;
        } 
    }
}

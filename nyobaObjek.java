

class Car {
    public String nopol = "";
    public int power = 100;
    public int seat = 4;


    public Car(String nomor_polisi, int seat_capacity) {
        this.nopol = nomor_polisi;
        this.seat = seat_capacity;
        System.out.println("Berhasil membuat angkot dengan nopol = " + this.nopol + " dengan kapasitas " + this.seat + " orang");
    }

    public void maju(){
        System.out.println(this.nopol + " bergerak maju");
    }

    /**
     * 
     */
    public void mundur(){
        System.out.println(this.nopol + " bergerak mundur");
    }
}

class ElectricCar extends Car{
    /**
     * @param nomor_polisi
     * @param seat_capacity
     */
    public ElectricCar(String nomor_polisi, int seat_capacity) {
        super(nomor_polisi, seat_capacity);
        //TODO Auto-generated constructor stub
    }

    public int dayaListrik = 200;
    public int sisaEnergiListrik = 0;

    public void isiKwh(int beliKwh){
        this.sisaEnergiListrik = beliKwh;
        System.out.println("Nomor Polisi = " + this.nopol + " sukses isi KWH sebesar " + this.sisaEnergiListrik);
    }
}

 public class nyobaObjek {
        /**
         * @param args
         */
    public static void main(String[] args) {
        Car angkot1 = new Car("N 123 GG", 12);
        angkot1.maju();
        angkot1.mundur();

        Car angkot2 = new Car ("N 234 SM", 2);
        angkot2.maju();
        angkot2.mundur();

        Car angkot3 = new Car("N 456 JK", 4);
        angkot3.maju();
        angkot3.mundur();

        System.out.println("=====================================");

        ElectricCar tesla1 = new ElectricCar(null, 0);
        tesla1.nopol = "F 1511 RH";
        tesla1.maju();
        System.out.println("Tesla dengan nopol " + tesla1.nopol + " ingin mengisi energi listrik mulai dari " + tesla1.sisaEnergiListrik);
        tesla1.isiKwh(100);
    }
}


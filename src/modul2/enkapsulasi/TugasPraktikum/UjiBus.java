package modul2.enkapsulasi.TugasPraktikum;
import modul2.enkapsulasi.TugasPraktikum.Bus;
public class UjiBus {
    public static void main(String[] args) {
        Bus busMini=new Bus(10);
        busMini.getPassword(90);
        busMini.cetak();

        busMini.pluspenumpang(3);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();

        busMini.getAverage(77);


    }
}

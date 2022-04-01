package modul2.enkapsulasi.latihan2;

public class UjiBus {
   /* public static void main(String[] args) {
        // TODO code application logic here
        Bus busMini = new Bus();
        busMini.penumpang = 5;
        busMini.maxpenumpang = 5;
        busMini.cetak();

        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();

        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();


        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();

        }*/
   public static void main(String[] args) {
       // TODO code application logic here
       Bus busMini=new Bus(10);
       busMini.cetak();

       busMini.pluspenumpang(3);
       busMini.cetak();

       busMini.pluspenumpang(1);
       busMini.cetak();

       busMini.pluspenumpang(1);
       busMini.cetak();


   }
}




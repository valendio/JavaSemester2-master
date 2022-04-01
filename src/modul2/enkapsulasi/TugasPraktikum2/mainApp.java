package modul2.enkapsulasi.TugasPraktikum2;

public class mainApp {
    public static void main(String[] args) {
        main Main = new main();

        double r = Main.setR(14d);
        System.out.println("Jari-jari : " +Main.getR());
        System.out.println("Diameter : "+Main.getD());
        System.out.println("Luas Permukaan: " +Main.getL());
        System.out.println("Volume Bola : " +Main.getV());
    }
}
/*==> var R
* ==>ShowD
* ==>ShowL
* ==>ShowV*/
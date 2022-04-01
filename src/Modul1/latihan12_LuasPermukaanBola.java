package Modul1;
import java.util.Scanner;
public class latihan12_LuasPermukaanBola {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Masukkan Nilai Jari-jari : ");
        int jari = myobj.nextInt();
        System.out.println(latihan12_LuasPermukaanBola.hitung(jari));}
    static double hitung(int r){return 4 * Math.PI * Math.pow(r, 2);}} // return L=4*phi*r^2
//math.pow merupakan cara penulisan bentuk pangkat di java
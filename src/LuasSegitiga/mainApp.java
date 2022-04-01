package LuasSegitiga;
import java.util.*;
public class mainApp {
    public static void main(String[] args) {
        var mainAdd = new main();
        Scanner myobj = new Scanner(System.in);
        System.out.print("Masukkan nilai Tinggi : ");
        var tinggi = myobj.nextDouble();
        System.out.print("Masukkan nilai Alas : ");
        var alas = myobj.nextDouble();
        System.out.println(mainAdd.hitung(tinggi,alas));
    }
}


package Modul1;

import java.util.*;

public class latihan10 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan : ");
        int batas = myobj.nextInt();
        var hasil = 0;
        for (var i=1; i<=batas; i++) {
            hasil += i;
            System.out.println("Total jumlahnya adalah : " +hasil);
        }

    }
}

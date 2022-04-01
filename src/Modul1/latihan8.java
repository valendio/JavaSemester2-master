package Modul1;

import java.util.Scanner;

public class latihan8 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Masukkan nilai TPA : ");
        int tpa = myobj.nextInt();
        System.out.print("Masukkan Nilai B.Inggris : ");
        int nilai = myobj.nextInt();
        if ((tpa>85 ) && (nilai >80)) {
            System.out.println("Siswa dapat beasiswa");
        }else {
            System.out.println("Siswa tidak dapat beasiswa");
        }


    }
}

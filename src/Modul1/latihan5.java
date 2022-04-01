package Modul1;

import java.util.*;

public class latihan5 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan nilai akhir PBO = ");
        nilai = myobj.nextInt();
        if (nilai < 70) {
            System.out.println("Siswa tidak lulus");
        }if (nilai > 70) {
            System.out.println("Siswa lulus");
        }
    }
}

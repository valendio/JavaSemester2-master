package Modul1;

import java.util.Scanner;

public class latihan7 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Silhakan Pilih angka 1-3 : ");
        int angka =  myobj.nextInt();
        switch (angka) {
            case 1 :
                System.out.println("Satu");
                break;
            case 2 :
                System.out.println("Dua");
                break;
            case 3 :
                System.out.println("Tiga");
        }
    }
}

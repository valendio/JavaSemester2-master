package Modul1;

import java.util.Scanner;

public class latihan11 {
    public static void main(String[] args) {

            Scanner myobj = new Scanner(System.in);
            int a = 0, total = 0, bil = 7;
            while (bil !=0){
                a++;
                System.out.print("Masukkan bilangan ke-" + a + " : ");
                bil = myobj.nextInt();
                total += bil;
            }
            System.out.println("Total jumlah " + (a-1) + " bilangan : ");
            System.out.println(total);
        }
    }


package latihanoopo2;

import java.util.Scanner;

public class main extends hitung {
    public static void main(String[] args) {

        main app = new main();

        Scanner myobj = new Scanner(System.in);

        String user, pass;
        System.out.print("enter username : ");
        user = myobj.nextLine();
        System.out.print("enter password : ");
        pass = myobj.nextLine();

        if (user.equalsIgnoreCase("oryza") && (pass.equalsIgnoreCase("123"))) {
            System.out.println("Welcome Oryza");
            System.out.println("1 = Buku Tulis, Harga 2500");
            System.out.println("2 = Alat Tulis, Harga 5000");
            System.out.println("3 = Buku Gambar, Harga 3500");

            int tambah, jumlah;

            System.out.println("Masukkan barang yang ingin anda Beli : ");
            tambah = myobj.nextInt();

            System.out.println("Jumlah barang yang ingin anda Beli : ");
            jumlah = myobj.nextInt();

            switch (tambah) {
                case 1:
                    System.out.println(app.buku(jumlah));
                    break;
                case 2:
                    System.out.println(app.alat(jumlah));
                    break;
                case 3:
                    System.out.println(app.gambar(jumlah));
                    break;
            }

        }else {
            System.out.println("Maaf password anda salah");
        }

    }
}

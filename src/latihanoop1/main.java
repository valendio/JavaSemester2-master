package latihanoop1;
import java.util.*;

public class main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Massukkan gaji : ");
            double kotor = input.nextDouble();
            gaji gajiPegawai = new gaji();

            gajiPegawai.setGaji(kotor);
            gajiPegawai.hitungPajak();
            gajiPegawai.hitungGaji();

            System.out.println("Nama : " + gajiPegawai.namaPegawai());
            System.out.println("Gaji Kotor : " + gajiPegawai.getGajikotor());
            System.out.println("Pajak : " + gajiPegawai.getPajak());
            System.out.println("Potongan : " + gajiPegawai.getPotongan());
            System.out.println("Gaji bersih : " + gajiPegawai.getGajibersih());
        }

    }


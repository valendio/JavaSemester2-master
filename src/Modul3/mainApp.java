package Modul3;
import java.util.*;

public class mainApp {
    private int no = 3333;
    private String name = "diah";
    private String kelamin = "wanita";
    private String jabatan = "admin";
    public int gaji = 1200000;

    public mainApp(){
    }

    void myname () {
        System.out.println("Nama : " +this.name);
    }
    void gender() {
        System.out.println("Jenis Kelamin : " +this.kelamin);
    }
    void nomor () {
        System.out.println("Nomor pegawai : " +this.no);
    }
    void bagian () {
        System.out.println("Bagian : " +this.jabatan);
    }
    void gaji () {
        System.out.println("Gaji utama yang didapatkan adalah : "+ gaji);
        }
    }




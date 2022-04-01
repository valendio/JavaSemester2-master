package latihanoop1;

public class gaji {
    public double gajikotor;
    private double pajak, gajibersih;
    private double potongan = 75000;
    private String nama = "Surya";

    public void setGaji (double gaji) {
        gajikotor=gaji;
    }
    public void hitungPajak () {
        pajak = 0.2*gajikotor;
    }
    public void hitungGaji () {
        gajibersih = gajikotor-pajak-potongan;
    }

    public String namaPegawai () {
        return nama;
    }
    public double getGajikotor () {
        return gajikotor;
    }
    public double getGajibersih () {
        return gajibersih;
    }
    public double getPajak () {
        return pajak;
    }
    public double getPotongan () {
        return potongan;
    }
}

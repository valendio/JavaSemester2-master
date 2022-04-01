package modul2.enkapsulasi.latihan3;

public class TestSiswa {
    public static void main(String[] args) {
      var encapsiswa = new EncapSiswa();
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("agus" +"\n");
        siswa.setAge(20);
        siswa.setAddress("Malang" +"\n");

        System.out.println("nama: " + siswa.getName()
                + " alamat " + siswa.getAddress() + " berumur " + siswa.getAge()
                + " tahun");
    }
}





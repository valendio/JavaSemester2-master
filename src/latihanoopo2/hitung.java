package latihanoopo2;

class hitung extends  barang{
    barang jumlah = new barang() {
        @Override
        void buku() {
            super.buku();
        }
        @Override
        void gambar() {
            super.gambar();
        }

    };

    int buku(int add) {
        int harga = 2500;
        return harga*add;
    }
    @Override
    int alat(int add) {
        int harga = 5000;
        return harga*add;
    }
    int gambar(int add) {
        int harga = 3500;
        return harga*add;
    }

}

public class Tiket {
    String maskapai, asal, tujuan;
    int harga;

    Tiket(String m, int h, String a, String t) {
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }

    void tampil() {
        System.out.println("Maskapai = " + maskapai);
        System.out.println("Harga = " + harga);
        System.out.println("Asal = " + asal);
        System.out.println("Tujuan = " + tujuan);
    }
}

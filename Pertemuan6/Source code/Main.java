public class TiketMain {
    public static void main(String[] args) {
        TiketService ts = new TiketService();
        Tiket t1 = new Tiket("Garuda" , 10000 , "Jakarta" , "Bali");
        Tiket t2 = new Tiket("Lion Air" , 15000 , "malang" , "Bali");
        Tiket t3 = new Tiket("Citilink" , 5000 , "Aceh" , "Bali");
        Tiket t4 = new Tiket("Air asia" , 15000 , "Surabaya" , "Jakarta");
        Tiket t5 = new Tiket("jet pribadi" , 1000000 , "Medan" , "St.petersburg");

        ts.tambah(t1);
        ts.tambah(t2);
        ts.tambah(t3);
        ts.tambah(t4);
        ts.tambah(t5);

        System.out.println("\nTiket sebelum disorting : \n");
        ts.tampilAll();

        System.out.println("\nTiket setelah disorting dengan bubblesort\n");
        ts.bubbleSort();
        ts.tampilAll();

        System.out.println("\nTiket setelah disorting dengan selection sort\n");
        ts.selectionSort();
        ts.tampilAll();

    }
}

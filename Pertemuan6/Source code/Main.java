public class Main {
    public static void main(String[] args) {
        TiketService ts = new TiketService();
        Tiket t1 = new Tiket("Garuda" , 7000 , "Jakarta" , "Bali");
        Tiket t2 = new Tiket("Shukoi" , 4000 , "Kediri" , "Bali");
        Tiket t3 = new Tiket("Pesawat tempur" , 5000 , "Blitar" , "Bali");
        Tiket t4 = new Tiket("Andromeda" , 15000 , "Surabaya" , "Bali");
        Tiket t5 = new Tiket("Hydra" , 10000 , "Malang" , "Bali");

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

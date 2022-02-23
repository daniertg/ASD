import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        int menu;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("===========================================");
            System.out.println("SELAMAT DATANG DI MENU PEMILIHAN RUMUS KECEPATAN, JARAK, DAN WAKTU");
            System.out.println("===========================================");
            System.out.println("Silahkan Pilih Menu :");
            System.out.println("1. Rumus Kecepatan");
            System.out.println("2. Rumus Jarak");
            System.out.println("3. Rumus Waktu");
            System.out.println("4. Keluar Dari Program");
            System.out.println("Pilihan Menu Anda(1 / 2 / 3 / 4)");
            menu = sc.nextInt();
            switch(menu){
                case 1 : {
                    System.out.println("Menu 1. Menampilkan Perhitungan Rumus Kecepatan");
                    kecepatan();
                }break;
                case 2 : {
                    System.out.println("Menu 2. Menampilkan Perhitungan Rumus Jarak");
                    jarak();
                }break;
                case 3 : {
                    System.out.println("Menu 3. Menampilkan Perhitungan Rumus Waktu");
                    waktu();
                }break;
                case 4 : {
                    System.out.println("Exit");
                }
            }
        }while(menu > 0 && menu <= 3);
    }
    
        private static void kecepatan() {
        double v, s, t, hasil;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jarak (dalam satuan Km)");
        s = sc.nextDouble();
        System.out.println("Masukkan waktu (dalam satuan Jam)");
        t = sc.nextDouble();
        hasil = s/t;
        System.out.println("Kecepatan Yang Ditempuh adalah: " + hasil + ("Km/Jam") );
        System.out.println("");

    }
        private static void jarak() {
        double v, s, t, hasil;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Kecepatan (dalam satuan Km/jam) ");
        v = sc.nextDouble();
        System.out.println("Masukkan waktu (dalam satuan jam)");
        t = sc.nextDouble();
        hasil = v*t;
        System.out.println("Jarak Yang Ditempuh adalah: " + hasil );
        System.out.println("");
    }

    private static void waktu() {
        double v, s, t, hasil;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jarak(dalam satuan Km) ");
        s = sc.nextDouble();
        System.out.println("Masukkan kecepatan (dalam satuan Km/jam)");
        v = sc.nextDouble();
        hasil = s/v;
        System.out.println("Waktu Yang Ditempuh adalah: " + hasil + "/jam");
        System.out.println("");
    }
}

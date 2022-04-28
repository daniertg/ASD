import java.util.Scanner;

public class queueMain {
        public static void menu() {
        System.out.println("Pilih Menu:");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian Mahasiswa");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("6. Cari Posisi Mahasiswa Berdasarkan NIM");
        System.out.println("7. Cari data Mahasiswa Berdasarkan Posisi");
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        queue antri = new queue(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    mahasiswa nb = new mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    mahasiswa data = antri.Dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.nama) && data.absen != 0
                            && data.ipk != 0) {
                        System.out.println("Data yang dikeluarkan: " + data.nim + " " + data.nama 
                                + " " + data.absen + " " + data.ipk);
                        break;
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang ingin dicari : ");
                    String dataDicari = sc.nextLine();
                    antri.peekPosition(dataDicari);
                    break;
                case 7:
                    System.out.print("Masukkan posisi Mahasiswa yang ingin dicari : ");
                    int posDicari = sc.nextInt();
                    antri.printMahasiswa(posDicari);
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}

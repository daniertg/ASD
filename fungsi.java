import java.util.Scanner;
public class Fungsi {
    public static void main(String[] args) {
         int menu;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("===========================================");
            System.out.println("SELAMAT DATANG DI ROYALE GARDEN");
            System.out.println("===========================================");
            System.out.println("Silahkan Pilih Menu :");
            System.out.println("1. menampilkan Stock Bunga");
            System.out.println("2. Menampilkan seluruh stock bunga di seluruh cabang");
            System.out.println("3. Keluar Dari Menu Royale Garden");
            System.out.println("Pilihan Menu Anda(1 / 2 / 3)");
            menu = sc.nextInt();
            switch(menu){
                case 1 : {
                    System.out.println("Menu 1. Menampilkan Stock Bunga");
                    menampilkanStockBunga();
                }break;
                case 2 : {
                    System.out.println("Menu 2. Menampilkan seluruh stock bunga di seluruh cabang");
                    menampilkanSeluruhStock();
                }break;
                case 3 : {
                    System.out.println("Menu 3. Keluar Dari Program");
                }break;
            }
        }while(menu > 0 && menu <= 3);

        }

    private static void menampilkanStockBunga() {
        int[][] bunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
        System.out.println("                  Algonema       Keladi       Alocasia        Mawar");
        System.out.println("RoyaleGarden1" + "\t\t" + bunga[0][0] + "\t\t" + bunga[0][1] + "\t\t" + bunga[0][2] + "\t\t" + bunga[0][3] );
        System.out.println("RoyaleGarden2" + "\t\t" + bunga[1][0] + "\t\t" + bunga[1][1] + "\t\t" + bunga[1][2] + "\t\t" +bunga[1][3]);
        System.out.println("RoyaleGarden3" + "\t\t" + bunga[2][0] + "\t\t" + bunga[2][1] + "\t\t" + bunga[2][2] + "\t\t" + bunga[2][3]);
        System.out.println("RoyaleGarden4" + "\t\t" + bunga[3][0] + "\t\t" + bunga[3][1] + "\t\t" + bunga[3][2] + "\t\t" + bunga[3][3]);
        System.out.println("");
    }
    
        private static void menampilkanSeluruhStock() {
                int[][] bunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
        int algonema = 0, keladi = 0, alocasia = 0, mawar = 0, pendapatan, totalBunga;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    algonema += bunga[i][j];
                } else if (j == 1) {
                    keladi += bunga[i][j];
                } else if (j == 2) {
                    alocasia += bunga[i][j];
                } else {
                    mawar += bunga[i][j];
                }
            }
        }

        totalBunga = (algonema + keladi + alocasia + mawar);

        System.out.println("Jumlah Bunga di Seluruh Cabang: " + totalBunga);
        System.out.println("Jumlah Bunga Algonema   : " + algonema);
        System.out.println("Jumlah Bunga Keladi     : " + keladi);
        System.out.println("Jumlah Bunga Alocasia   : " + alocasia);
        System.out.println("Jumlah Bunga Mawar      : " + mawar);
    }
}

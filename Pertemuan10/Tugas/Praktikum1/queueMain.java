import java.util.Scanner;
public class queueMain {
    public static void menu(){
        System.out.println("Masukkan Operasi yang Diinginkan :");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("-----------------");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Kapasitas Queue : ");
        int n = sc.nextInt();
        Queue1 Q = new Queue1(n);
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1 :{
                    System.out.println("Masukkan data Baru : ");
                    int datamasuk = sc.nextInt();
                    Q.Enqueue(datamasuk);
                }break;
                case 2 :{
                    int dataKeluar = Q.Dequeue();
                    if(dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                    } break;
                }
                case 3 :{
                    Q.print();
                } break;
                case 4 :{
                    Q.peek();
                } break;
                case 5 :{
                    Q.clear();
                } break;
                case 6 :{
                    System.out.print("Masukkan Data Yang Ingin Dicari : ");
                    int dataCari = sc.nextInt();
                    Q.peekPosition(dataCari);
                    break;
                }
                case 7 :{
                    System.out.print("Masukkan Posisi Data Yang Ingin Dicari : ");
                    int posisiCari = sc.nextInt();
                    Q.peekAt(posisiCari);
                    break;
                }
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}

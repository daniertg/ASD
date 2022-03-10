# 3.2.3 Pertanyaan
## Jawab :
### 1)Ya, agar program memiliki fungsi atau kegunaan
### 2) untuk menginisialisasi index ke 1 dari ppArray
### 3) menginisialisasi array index persegi Panjang
### 4)menginisialisasi lebar dan Panjang ppArray index ke-1
### 5) agar terlihat lebih praktis

# 3.3.3 Pertanyaan
## Jawab :
### 1) bisa
### 2) ```java balok[] [] b = new balok [1] [1]; </br> b[0] [0] = new balok();```</br> karena array objek dan array dua dimensi saling berkaitan
### 3) karena tidak ada inisialisasi objek
### 4) ```java System.out.print("Masukkan panjang array : "); int arrLength = sc.nextInt(); PersegiPanjang[] ppArray = new PersegiPanjang[arrLength]; ```
### 5) bisa,hanya kurang efektif

# 3.4.3 Pertanyaan
### 1) dapat, 
    public class Balok{ 
        int panjang; 
        public Balok(){

        }
        public Balok(int a) 
            Panjang = a;
        }
    }
### 2) 
    public class Segitiga{
        public int alas;
        public int tinggi;
        
        public Segitiga(int a, int t){
            alas = a;
            tinggi = t;
        }
    }
### 3)
    public class Segitiga{
        public int alas;
        public int tinggi;
        
        public Segitiga(int a, int t){
            alas = a;
            tinggi = t;
        }

        int hitungLuas(){
            int luas = (alas*tinggi)/2;
            return luas;
        }

        double hitungKeliling(){
            double keliling = Math.sqrt(((alas*0.5)*(alas*0.5))+(tinggi*tinggi))*2+alas;
        }
    }
### 4)
        java
        public class SegitigaMain{
            public static void main(String[] args){
                Segitiga[] sgArray = new Segitiga[4];
                for (int i = 0 ; i < sgArray.length ; i++){
                    sgArray[i] = new Segitiga();
                }
                sgArray[0].alas = 10;
                sgArray[0].tinggi = 4;
                sgArray[1].alas = 20;
                sgArray[1].tinggi = 10;
                sgArray[2].alas = 15;
                sgArray[2].tinggi = 6;
                sgArray[3].alas = 25;
                sgArray[3].tinggi = 10;
            }
        }
### 5)
        public class SegitigaMain{
            public static void main(String[] args){
                Segitiga[] sgArray = new Segitiga[4];
                for (int i = 0 ; i < sgArray.length ; i++){
                    sgArray[i] = new Segitiga();
                }
                sgArray[0].alas = 10;
                sgArray[0].tinggi = 4;
                sgArray[1].alas = 20;
                sgArray[1].tinggi = 10;
                sgArray[2].alas = 15;
                sgArray[2].tinggi = 6;
                sgArray[3].alas = 25;
                sgArray[3].tinggi = 10;

                for (int i = 0 ; i < sgArray.length ; i++){
                    System.out.println("Luas Segitiga ke - " + (i+1) + " adalah : " + 
                    sgArray[i].hitungLuas());
                    System.out.println("Keliling Segitiga ke - " + (i+1) + " adalah : " + 
                    sgArray[i].hitungKeliling());

                }
            }
        }
        
  
# Latihan 1
![Screenshot (33)](https://user-images.githubusercontent.com/87335182/157695606-048631a3-b8c3-4182-a751-4b49c494f692.png)
![Screenshot (34)](https://user-images.githubusercontent.com/87335182/157695748-dc4a0970-4765-4d7e-8222-e2b7c12f7931.png)
![Screenshot (35)](https://user-images.githubusercontent.com/87335182/157695771-e201859b-a77e-410d-94e6-2f82d32e27bf.png)
![Screenshot (36)](https://user-images.githubusercontent.com/87335182/157695876-9d3286e4-6483-42d0-9027-f53c6b5ec6c6.png)
![Screenshot (37)](https://user-images.githubusercontent.com/87335182/157695893-09e1e480-177d-434d-8eab-e94ac1585a16.png)
![Screenshot (38)](https://user-images.githubusercontent.com/87335182/157695908-bf5e1701-e5a8-42ca-8a77-bd32b10aa898.png)

# Latihan 2
![Screenshot (39)](https://user-images.githubusercontent.com/87335182/157696758-cfdd6489-451e-4ada-b630-674973c3031c.png)
![Screenshot (40)](https://user-images.githubusercontent.com/87335182/157696765-ea96511f-fa28-427d-a6de-000672c02562.png)
![Screenshot (41)](https://user-images.githubusercontent.com/87335182/157696770-25087e0d-c4ed-46c4-bf7c-9820bf022429.png)

# Latihan 3
![Screenshot (42)](https://user-images.githubusercontent.com/87335182/157697329-26e5e723-09f2-440c-aa79-9991f54e118e.png)
![Screenshot (43)](https://user-images.githubusercontent.com/87335182/157697343-ab73f77f-b1e3-4e81-a007-748dd7bfb8ab.png)
![Screenshot (44)](https://user-images.githubusercontent.com/87335182/157697353-1b133f68-8e22-4c9d-adad-4d6c50ff77ad.png)

    
    
    
    
   

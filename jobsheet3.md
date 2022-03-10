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

                for (int i = 0 ; i < sgArray.length ; i++){
                    System.out.println("Luas Segitiga ke - " + (i+1) + " adalah : " + 
                    sgArray[i].hitungLuas());
                    System.out.println("Keliling Segitiga ke - " + (i+1) + " adalah : " + 
                    sgArray[i].hitungKeliling());

                }
            }
        }
    
    
    
    
    
   

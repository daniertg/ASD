# 5.2.3 Pertanyaan
### 1.terdapat pada method void bubbleSort()
### 2.Terdapat pada method void selectionSort
### 3.Proses swap adalah proses untuk menukarkan nilai
![Screenshot (117)](https://user-images.githubusercontent.com/87335182/161056526-423857a2-5806-4b13-8595-07a1652714db.png)
### 4. Proses ini digunakan untuk melakukan proses swap dimana apabila array pertama nilainya lebih sedikit daripada array didepannya. Maka swap akan dilakukan
### 5 
    for(int i = 0; i < listMhs.length-1 ; i++){
     for(int j =1 ; j<listMhs.length-i ; j++){
a. perulangan I (Outer Loop) digunakan untuk melakuakn loop pada array sedangkan perulangan J (Inner Loop) digunakan untuk melakukan array I agar bisa dibandingkan

b. Syarat pada perulangan i yaitu i < listMhs.length-1 dimana saat dimana array i akan melakukan loop pada indeks-1

c. Syarat pada perulangan j yaitu j < listMhs.length-i dimana array j akan melakukan looping di depan indeks i

d. terdapat 49 loop dan 1225 Tahapan
# Pertanyaan 5.3.3
     int idxMin = i;
     for(int j =i+1 ; j < listMhs.length ; j++){
         if(listMhs[j].ipk < listMhs[idxMin].ipk){
             idxMin = j;
         }
     }
     
     Potongan kode ini adalah sebagai syarat untuk melakukan swap dimana apabila array pertama lebih sedikit daripada array dengan index idxMin = 1, maka indeks yang lebih besar maka akan menjadi indeks j
     
 # 5.4.3 Pertanyaan
 
 # Latihan
 ![Screenshot (112)](https://user-images.githubusercontent.com/87335182/161139153-8b91b5f4-d050-48dd-86eb-0be9d1af1a82.png)

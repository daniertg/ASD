# Laporan praktikum Algoritma dan Struktur data
Febrian dani ritonga (1G-12)
Jobsheet II
## jawaban pertanyaan :
### 2.23 Pertanyaan 
### 1. Sebutkan 2 karakteristik class/objek!</br>
a.kelas atau objek adalah sebuah gamabaran umum sebuah objek.Sehingga kelas/objek akan kita jadikan realisasi sebuah objek yg nyata.</br>
b.Setiap class memiliki attribute dan method</br>
### 2. Kata kunci apakah yang digunakan untuk mendeklarasikan class?</br>
kata kunci new adalah yang akan kita gunakan untuk instasiasi dari sebuah class/objek</br>
### 3. Perhatikan ```class Barang``` yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh classtersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan?</br>
Atribut : </br>
 1.Nama Barang  : String -> baris 13</br>
 2.jenis Barang : String -> baris 13</br>
 3.stok         : int    -> baris 14</br>
 4.Harga Satuan : int    -> baris 14</br>
 ### 4.Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi method dilakukan?</br>
 1.tampilBarang()    -> baris 16</br>
 2.tambahStok()      -> baris 23</br>
 3.kurangiStok()     -> baris 27</br>
 4.hitungHargaTotal  -> baris 31</br>
 ### 5.Perhatikan method ```kurangiStok()``` yang ada di class Barang, modifikasi isi method tersebut sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0)
code : 
kurangiStok(int n) {</br>
if (this.stok > 0){</br>
this.stok = this.stok-n;</br>
}else {</br>
System.out.println("Status kurangi stok : Gagal")</br>
}</br>
}</br>

### 6. Menurut anda, mengapa method ```tambahStok()``` dibuat dengan memiliki parameter int 
karena, bila mengurangi stok maka membutuhkan suatu parameter berupa int yg digunakan sebagai tipe data mengurangi stok
### 7. Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int?
karena , method tersebut akan memuat angka bulat 
### 8. Menurut Anda, mengapa method tambahStok() memiliki tipe data void?
karena, method tersebut akan menampilkan jumlah stok sebelumnya 

# 2.3.3 Pertanyaan
### 1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? Dan apa nama objek yang dihasilkan?

### 2. Bagaimana cara mengakses atribut dan method dari suatu objek?
 
 
 
 


# 6.2.3 Pertanyaan
### 1.Jelaskan perbedaan method ```TampilData``` dan ```Tampilposisi``` pada class PencarianMhs
```TampilData``` menampilkan data secara keseluruhan sedangkan ```Tampilposisi``` menunjukkan index keberapa
### 2.Jelaskan fungsi break pada kode program dibawah ini!
menghentikan perulangan data apabila kondisi sudah terpenuhi
### 3. Jika Data Nim yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat berjalan? Apakah hasil yang dikeluarkan benar? Mengapa demikian!
Ya, hasil yang dikeluarkan sama, Karena pada algoritma Sequential Search dilakukan Proses pencarian dilakukan dengan membandingkan elemen array satu per satu secara beruntun sehingga kumpulan data tidak harus dalam keadaan terurut program tetap bisa dijalankan
# 6.3.3 Pertanyaan
### 1.Tunjukkan pada kode program yang mana proses divide dijalankan!
        mid = (left+right)/2;
### 2.Tunjukkan pada kode program yang mana proses conquer dijalankan!

        } else if(listMhs[mid].nim > cari){
            return findBinarySearch(cari, left, mid -1);
        } else{
            return findBinarySearch(cari, mid+1, right);
### 3.Jika data Nim yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian!
Ya, program masih dapat berjalan, tetapi data yang dicari tidak dapat ditemukan karena data awal harus dalam kondisi terurut. Sehingga harus dilakukan proses sorting terlebih dahulu untuk data awal.
### 4. Jika Nim yang dimasukkan dari NIM terbesar ke terkecil (missal : 20215, 20214, 20212, 20211,20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai
### 5. Modifikasilah program diatas yang mana jumlah mahasiswa yang di inputkan sesuai denganmasukan dari keyboard.


## Jawaban Pertanyaan 8.2.3
 1.Front dan Rear diberikan nilai -1 dikarenakan menandakan posisi dari data pada stack yang masih kosong dan masih beluma ada data didalam stack dan dilambangkan dengan angka imajiner -1, sedangkan size 0 digunakan untuk menggambarkan panjang dari stack yang masih kosong
 
2.          if(rear == max - 1){
                         rear = 0;
                         
3.              if(front == max - 1){
                         front = 0;      
                         
4. Cara print menggunakan loop dimulai dari int i = front karena front adalah data yang pertama masuk dan sesuai antrian yaitu First In First Out, data pertama ini akan disusul dengan data yang masuk setelahnya

5.  i = (i+1) % max;

6.          System.out.println("Masukkan data Baru : ");
                         int datamasuk = sc.nextInt();
                         Q.Enqueue(datamasuk);
                         
7. class

             public int Enqueue(int dt) { 
            if (IsFull()) { 
                    System.out.println("Queue sudah penuh"); 
                    return 0; 
                    } else { 
                            if (IsEmpty()){ 
                                    front = rear = 0; 
                                    } else { 
                                            if (rear == max - 1) { 
                                                    rear = 0; 
                                                    } else { 
                                                            rear++; } 
                                                            } 
                                                            data[rear] = dt; 
                                                            size++; 
                                                            return 1; } 
                                                            }
                                                            
classMain

                    case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    pilih = Q.Enqueue(dataMasuk);
                    break;
                    case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                            System.out.println("Data yang dikeluarkan: " + dataKeluar);
                            break;
                    } else {
                            pilih = dataKeluar;
                            break;
                    }

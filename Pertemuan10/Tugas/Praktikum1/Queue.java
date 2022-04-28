public class Queue1 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue1(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean IsFull(){
        if(size == max){
            return true;
        }
        else{
            return false;
        }
    }

    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan : " + data[front]);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }

    public void peekPosition(int dataCari){
        int i =  front;
        int posisi = 1;
        System.out.print("Data " + dataCari + " Berada di Posisi : " );
        while(i != rear){
            if(data[i] == dataCari){
                System.out.print(posisi + " ");
            }
            i = (i + 1) % max;
            posisi++;
        }
        if(data[i] == dataCari){
            System.out.print(posisi + " ");
        }
        System.out.println();
    }

    public void peekAt(int position){
        int idCari = front;
        System.out.print("Data pada posisi " + position + " adalah : ");
        for(int i = 0 ; i < position - 1 ; i++){
            idCari = (idCari + 1) % max;
        }
        System.out.println(data[idCari] + " ");
    }

    public void print(){
        if(IsEmpty()){
            System.out.println("Queue Masih Kosong");
        } else {
            int i = front;
            while (i != rear){
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah Elemen = " + size);
        }
    }

    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue Berhasil Dikosongkan");
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }

    public void Enqueue(int dt){
        if(IsFull()){
            System.out.println("Queue Sudah Penuh");
        } else{
            if(IsEmpty()){
                front = rear = 0;
            } else{
                if(rear == max - 1){
                    rear = 0;
                } else{
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int Dequeue(){
        int dt = 0;
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }
        else{
            dt = data[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }
            else{
                 if(front == max - 1){
                     front = 0;
                 }
                 else{
                     front++;
                 }
            }
        }
        return dt;
    }
}

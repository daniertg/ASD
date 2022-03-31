public class TiketService {
    Tiket[] tikets = new Tiket[5];
    int idx;

    void tambah(Tiket t) {
        if (idx < tikets.length) {
            tikets[idx] = t;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilAll() {
        for (Tiket t : tikets) {
            t.tampil();
            System.out.println("----------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            for (int j = 1; j < tikets.length - i; j++) {
                if (tikets[j].harga > tikets[j - 1].harga) {
                    Tiket tmp = tikets[j];
                    tikets[j] = tikets[j - 1];
                    tikets[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < tikets.length; j++) {
                if (tikets[j].harga < tikets[idxMin].harga) {
                    idxMin = j;
                }
            }
            Tiket tmp = tikets[idxMin];
            tikets[idxMin] = tikets[i];
            tikets[i] = tmp;
        }
    }

}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CollectionMain {
    public static void main(String[] args) {

        List l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("basreng");
        System.out.printf("Elemen 0 : %d Total Elemen : %d Elemen Terakhir : %s\n", l.get(0), l.size(), l.get(l.size()-1));
        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0 : %d Total Elemen : %d Elemen Terakhir : %s\n", l.get(0), l.size(), l.get(l.size()-1));

        List<String> names = new LinkedList<>();
        names.add("ana");
        names.add("ani");
        names.add("inu");
        names.add("ini");
        names.add("anu");

        System.out.printf("Elemen 0 : %s Total Elemen : %s Elemen Terakhir : %s\n", names.get(0), names.size(), names.get(names.size()-1));
        names.set(0, "bool");
        System.out.printf("Elemen 0 : %s Total Elemen : %s Elemen Terakhir : %s\n", names.get(0), names.size(), names.get(names.size()-1));
        System.out.println("Names : " + names.toString());

        //Praktikum 2 :

        Stack<String> fruits = new Stack<>();
        fruits.push("Gedhang");
        fruits.add("Jeruk");
        fruits.add("Semongko");
        fruits.add("Rambutan");
        fruits.push("Salak");

        for(String fruit:fruits){
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        while(!fruits.empty()){
            System.out.printf("%s ", fruits.pop());
        }
        fruits.push("Melon");
        fruits.push("Duren");
        System.out.println("");
        for(Iterator<String> it = fruits.iterator(); it.hasNext();){
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for(int i=0; i<fruits.size(); i++){
            System.out.printf("%s ", fruits.get(i));
        }

        //Main Praktikum 3 :

        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Bool", "628123");
        Mahasiswa m1 = new Mahasiswa("201235", "Uwuh", "628124");
        Mahasiswa m2 = new Mahasiswa("201236", "Anying", "628125");

        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Kobo", "628129"));
        System.out.println();
        lm.tampil();
    }
}

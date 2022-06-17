import java.util.Scanner;
public class graph {
    int vertex;
    DoubleLinkedLists list[];
    boolean pilih;
    node right;

    graph(int vertex, boolean pilih){
        this.vertex = vertex;
        this.pilih = pilih;
        list = new DoubleLinkedLists[vertex];
        for(int i = 0 ; i < vertex ; i++){
            list[i] = new DoubleLinkedLists();
        }
    }

    boolean graphtype(boolean pilih){
        return pilih;
    }

    void addEdge(int a, int b, String source, String destination){
        if(graphtype(pilih)){
            list[a].addFirst(destination);
        }else{
            list[a].addFirst(destination);
            list[b].addFirst(source);
        }    
    }

    void degree(int source) throws Exception{
        //untuk directed graph
        if(graphtype(pilih)){
            int k, totalIn = 0, totalOut = 0;
            for(int i = 0 ; i < vertex ; i++){//perulangan utnuk melihat semua vertex dalam graph 
                for(int j = 0 ; j < list[i].size() ; j++){//perulangan untuk setiap degree dalam vertex
                    list[i].get(j);
                }
                for(k = 0; k < list[source].size() ; k++){
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("InDegree dari Vertex " + source + " : " + totalIn);
            System.out.println("OutDegree dari Vetex " + source + " : " + totalOut);
            System.out.println("Degree Vertex " + source + " : " + (totalIn+totalOut));
        //untuk undirected graph
        } else {
            System.out.println("Degree Vertex " + source + " " + list[source].size());
        }
    }

    void removeEdge(int source, int destination) throws Exception{
        for(int i = 0; i < list[source].size() ; i++){
            if(i == destination){
                list[source].remove(i);
            }
        }
    }

    void removeAllEdge(){
        for(int i = 0 ; i < vertex ; i++){
            list[i].clear();
        }
        System.out.println("Graph Berhasil dikosongkan !");
    }

    void PrintGraph() throws Exception{
        for(int i = 0; i < vertex ; i++){
            if(list[i].size() > 0){
                System.out.print("Vertex " + i + " terhubung dengan : ");
                for(int j = 0 ; j < list[i].size() ; j++){
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean info;
        System.out.println("Pilih Jenis Graph : (1/2)");
        System.out.println("1. Directed");
        System.out.println("2. Undirected");
        System.out.print("Pilih = ");
        int pilih = sc.nextInt();
        if(pilih == 1){
            System.out.println("Anda menggunakan Directed Graph");
            info = true;
        } else{
            System.out.println("Anda menggunakan Undirected Graph");
            info = false;
        }
        System.out.println("Masukkan <source> <destination> <kota Source> <kota Destination>");
        graph graph = new graph(6, info);
        graph.addEdge(0, 1, "Blitar", "Malang");
        graph.addEdge(0, 2, "Blitar", "Surabaya");
        graph.addEdge(1, 3, "Kediri", "Surabaya");
        graph.addEdge(1, 4, "Kediri", "Tulungagung");
        graph.addEdge(2, 1, "Malang", "Kediri");
        graph.addEdge(3, 1, "Batu", "Malang");
        graph.addEdge(4, 1, "Tulungagung", "Malang");

        /*graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3,0);
        graph.PrintGraph();
        graph.degree(2);*/

        
        graph.PrintGraph();
        graph.removeEdge(1, 2);
    }

}

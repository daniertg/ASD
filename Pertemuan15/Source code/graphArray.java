import java.util.Scanner;
public class graphArray {
    int vertices;
    int[][] array2D;

    graphArray(int v){
        vertices = v;
        array2D = new int[vertices + 1][vertices + 1];
    }

    void makeEdge(int to, int from, int edge){
        try{
            array2D[to][from] = edge;
        } catch (ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex Tidak Ada ! ");
        }
    }

    int getEdge(int to, int from){
        try{
            return array2D[to][from];
        } catch (ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex Tidak Ada ! ");
        }
        return -1;
    }

    public static void main(String[] args) {
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        graphArray graph;
        try{
            System.out.println("Masukkan Jumlah Vertices : ");
            v = sc.nextInt();
            System.out.println("Masukkan Jumlah Edges : ");
            e = sc.nextInt();

            graph = new graphArray(v);

            System.out.println("Masukkan Edges : <to> <from>");
            while(count <= e){
                to = sc.nextInt();
                from = sc.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb : ");
            System.out.println(" ");
            for(int i = 0; i <= v ; i++){
                System.out.print(i + " ");
            }
            System.out.println();

            for(int i = 1 ; i <= v ; i++){
                System.out.print(i + " ");
                for (int j = 0; j <= v ; j++){
                    System.out.print(graph.getEdge(i, j) + " ");
                }
                System.out.println();
            }
        } catch(Exception E){
            System.out.println("Error, Silahkan Cek Kembali\n" + E.getMessage());
        }
        sc.close();
    }

}

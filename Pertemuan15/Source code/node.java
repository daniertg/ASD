public class node {
    String data;
    node prev, next;

    node(node prev, String data, node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

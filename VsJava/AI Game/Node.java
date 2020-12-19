public class Node {
    Node next;
    Node child;
    int data;

    Node(int data){
        this.data = data;
        this.child = null;
        this.next = null;
    }
}

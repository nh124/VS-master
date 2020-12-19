public class Node<T> {
    /*
     * Node next; // int data;
     * 
     * // public Node(int data) { // this.data = data; // node = null; // }
     * 
     * // public void setNext() { // this.node = node; // }
     * 
     * // public Node getNode() { // return this.next; }
     */

    Node<T> next;
    T data;

    public Node(T data) {
        this.data = data;
        next = null;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNode() {
        return this.next;
    }

    public T getData() {
        return this.data;
    }
}

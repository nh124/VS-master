public class Node<T> {
    Node<T> next;
    T data;
    Node<T> pre;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public void setNode(Node<T> next) {
        this.next = next;
    }

    // public Node<T> getData() {
    // return data;
    // }

    public Node<T> getNext() {
        return next;
    }
}

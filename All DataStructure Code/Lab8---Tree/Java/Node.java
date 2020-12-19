public class Node<T> {
    Node<T> left;
    Node<T> right;
    Object data;
    Node<T> next;

    public Node(Object data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.next = null;
    }
}

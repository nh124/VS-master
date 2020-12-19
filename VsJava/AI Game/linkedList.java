public class linkedList {
    Node head;
    Node tail;

    public void add(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail = node;
            this.tail = node.next;
        }
    }

    public void print() {
        Node curr = this.head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

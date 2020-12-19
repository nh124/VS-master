public class linkedList<T> {
    Node<T> head;
    Node<T> tail;

    void addData(T data) {
        Node<T> node = new Node<T>(data);

        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            tail.next = node;
            this.tail = node;

        }
    }

    void removeData() {
        if (this.head == null) {
            return;
        } else {
            Node<T> current = this.head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    void removeData(int position) {
        Node<T> temp = head;
        if (this.head == null) {
            return;
        }
        if (position == 0) {
            temp = temp.next;
        }
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
            if (temp == null || temp.next == null) {
                return;
            }
        }
        Node<T> next = temp.next.next;
        temp.next = next;

    }

    void insertionBeg(T data) {
        Node<T> node = new Node<T>(data);
        node.next = head;
        head = node;
    }

    void insertionEnd(T data) {
        Node<T> node = new Node<T>(data);
        if (this.head == null) {
            head = node;
        } else {
            node.next = null;
            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }

    }

    void print() {
        Node<T> current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        System.out.println();
    }
}

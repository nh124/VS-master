public class linkedList<T> {
    Node<T> head; // O(1)
    Node<T> tail; // O(1)

    public void add(T data) {
        Node<T> node = new Node<T>(data); // O(1)
        if (this.head == null) {
            this.head = node; // O(1)
            this.tail = node; // O(1)
        } else {
            tail.next = node; // O(1)
            this.tail = tail.next; // O(1)
        }
    }
    /*
     * O(5) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public void removeFirst() {
        if (head == null) { // O(1)
            return; // O(1)
        }
        Node<T> newNode = this.head; // O(1)
        this.head = head.next; // O(1)
        newNode = null; // O(1)
    }
    /*
     * O(5) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public void removeLast() {
        if (this.head == null) { // O(1)
            return; // O(1)
        }
        Node<T> curr = this.head; // O(1)
        while (curr.next.next != null) { // O(n)
            curr = curr.next; // O(n)
        }
        curr.next = null; // O(1)
    }
    /*
     * O(2n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public void Last() {
        Node<T> curr = this.head; // O(1)
        while (curr != null) { // O(n)
            curr = curr.next; // O(n)
            if (curr.next == null) { // O(n)
                System.out.println(curr.data + " "); // O(1)
                break;
            }
        }
    }
    /*
     * O(3n + 2)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public int size() {
        Node<T> curr = this.head; // O(1)
        int size = 0; // O(1)
        while (curr != null) { // O(n)
            curr = curr.next; // O(n)
            size++; // O(n)
        }
        return size + 1; // O(1)
    }
    /*
     * O(3n + 3)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public void print() {
        Node<T> curr = this.head; // O(1)
        while (curr != null) { // O(n)
            System.out.print(curr.data + " "); // O(n)
            curr = curr.next; // O(n)
        }
        System.out.println(); // O(1)

    }
}

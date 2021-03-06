public class DoubleLinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void put(T data) {
        Node<T> newNode = new Node(data);
        newNode.data = data;// O(1)
        newNode.next = null;// O(1)
        newNode.pre = null;// O(1)

        if (head == null) {
            head = newNode;// O(1)
            return;// O(1)
        } else {
            head.pre = newNode;// O(1)
            newNode.next = head;// O(1)
            head = newNode;// O(1)
        }
        /*
         * base runtime: O(11) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
         * loose upperbound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
         * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
         * Big O then we can say that the average or Big theta is the base runtime:
         * O(1).
         */
    }

    public int size() {

        int size = 0; // O(1)
        Node<T> node = this.head; // O(1)
        while (node.next != null) { // O(n)
            node = node.next;// O(n)
            size++; // O(n)
        }
        return size + 1; // O(1)
    }
    /*
     * O(3n + 3) -> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose
     * upperbound: O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x)))
     * -> loose lower bound: O(log(n)) Big theta:Since this method have a Big omega
     * and Big O then we can say that the average or Big theta is the base runtime:
     * O(n).
     */

    // delete
    public void deleteFirst() {
        if (this.head == null) { // O(1)
            return;// O(1)
        }
        Node<T> node = this.head;// O(1)
        head = head.next;// O(1)
        node.next = null;// O(1)
        head.pre = null;// O(1)
    }
    /*
     * O(6) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public void deleteLast() {
        if (this.head == null) { // O(1)
            return; // O(1)
        }
        Node<T> node = this.tail; // O(1)
        tail = tail.pre; // O(1)
        node.pre = null; // O(1)
        tail.next = null; // O(1)
    } /*
       * O(6)-> O(1) Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound:
       * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
       * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
       * can say that the average or Big theta is the base runtime: O(1).
       */

    public void deleteGivenPosition(int position) {

        Node newNode = head; // O(1)

        if (this.head == null) { // O(1)
            return; // O(1)
        }
        if (position == 0) { // O(1)
            newNode = newNode.next; // O(1)
        }

        for (int i = 0; i < position - 2 && newNode != null; i++) { // O(3n-1)
            newNode = newNode.next; // O(n-2)
            if (newNode == null || newNode.next == null) { // O(n-2)
                return; // O(1)
            }
        }
        Node node2 = newNode.next.next; // O(1)
        newNode.next = node2; // O(1)
    }
    /*
     * O(4n + 2)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    // add
    public void push(T data) {
        Node node = new Node(data); // O(1)
        node.data = data; // O(1)
        node.next = this.head; // O(1)
        node.pre = node; // O(1)
        if (head != null) { // O(1)
            head.pre = node; // O(1)
        }
        head = node; // O(1)
    } /*
       * O(7) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound:
       * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
       * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
       * can say that the average or Big theta is the base runtime: O(1).
       */

    public void add(T data) { // O(1)
        Node node = new Node(data); // O(1)
        Node curr = this.head; // O(1)
        node.data = data; // O(1)

        node.next = null; // O(1)

        if (head == null) { // O(1)
            node.pre = null; // O(1)
            head = node; // O(1)
            return; // O(1)
        }
        while (curr.next != null) { // O(n) n: the size of the list
            curr = curr.next; // O(n)
        }
        curr.next = node; // O(1)
        node.pre = curr; // O(1)
    } /*
       * O(2n+ 11) -> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose
       * upperbound: O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x)))
       * -> loose lower bound: O(log(n)) Big theta:Since this method have a Big omega
       * and Big O then we can say that the average or Big theta is the base runtime:
       * O(n).
       */

    public void insertAt(int position, T data) {
        Node node = new Node(data); // O(1)
        Node curr = head; // O(1)

        for (int i = 0; i < position - 2; i++) { // O(3n-1)
            curr = curr.next; // O(n)
        }
        node.next = curr.next; // O(1)
        curr.next.pre = node; // O(1)
        curr.next = node; // O(1)
        node.pre = curr; // O(1)
    }
    /*
     * O(4n + 5)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public boolean isEmpty() {

        if (this.head == null) { // O(1)
            return true; // O(1)
        }
        return false;// O(1)
    }
    /*
     * O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public void clear() {
        int data = 0; // O(1)
        Node<T> node = new Node(data); // O(1)
        Node curr = this.tail; // O(1)

        if (this.head == null) { // O(1)
            System.out.println("The list is already empty! "); // O(1)
        }
        while (curr != null) { // O(1)
            node = curr.pre; // O(1)
            curr = null; // O(1)
            node = curr; // O(1)
        }
        this.head = null; // O(1)
    } /*
       * O(4n + 6)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound:
       * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
       * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
       * then we can say that the average or Big theta is the base runtime: O(n).
       */

    public boolean contains(T element) {

        Node<T> node = head; // O(1)

        if (node == null) { // O(1)
            return false; // O(1)
        }

        while (node != null) { // O(n) n : size of list
            if (node.data.equals(element)) { // O(n)
                return true; // O(1)
            }
            node = node.next; // O(n)
        }
        return false; // O(1)
    }
    /*
     * O(3n + 5) -> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose
     * upperbound: O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x)))
     * -> loose lower bound: O(log(n)) Big theta:Since this method have a Big omega
     * and Big O then we can say that the average or Big theta is the base runtime:
     * O(n).
     *
     */

    public T get(int position) {
        Node<T> node = this.head; // O(1)

        if (head.equals(null)) { // O(1)
            System.out.println("The list is empty"); // O(1)
        }
        if (position - 1 == 0) { // O(1)
            return node.data; // O(1)
        }
        for (int i = 0; i < position - 1; i++) { // O(3n)
            node = node.next; // O(n)
        }
        return node.data; // O(1)

        /*
         * O(4n + 6) -> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose
         * upperbound: O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x)))
         * -> loose lower bound: O(log(n)) Big theta:Since this method have a Big omega
         * and Big O then we can say that the average or Big theta is the base runtime:
         * O(n).
         */
    }

    public int indexOf(T data) {
        Node<T> node = this.head; // O(1)
        int iterator = 0; // O(1)
        if (head == null) { // O(1)
            System.out.println("The list is empty"); // O(1)
        }

        while (node.next != null) { // O(n)
            if (node.data.equals(data)) { // O(n)
                return iterator + 1; // O(1)
            }
            node = node.next; // O(n)
            iterator++; // O(n)
        }
        return -1; // O(1)
    } /*
       * O(4n + 6)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound:
       * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
       * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
       * then we can say that the average or Big theta is the base runtime: O(n).
       */

    public int lastOf(T data) {
        Node<T> node = this.head; // O(1)
        int iterator = 0; // O(1)
        int lastPosition = -1; // O(1)
        if (head == null) { // O(1)
            return -1; // O(1)
        } else if (node != null) { // O(1)
            while (node != null) { // O(n) -> n: the size of the list
                if (node.data.equals(data)) { // O(n)
                    lastPosition = iterator + 1; // O(n)
                }
                node = node.next; // O(n)
                iterator++; // O(n)
            }
            return lastPosition; // O(1)
        } else { // O(1)
            return -1; // O(1)
        } /*
           * O(5n + 9)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound:
           * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
           * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
           * then we can say that the average or Big theta is the base runtime: O(n).
           */
    }

    public void slice(int firstPosition, int lastPosition) { // working
        Node headNodeIt = head; // O(1)
        Node tailNodeIt = tail; // O(1)
        Node curr = this.head; // O(1)
        // --------------------------------------------------------------------------------------------------//
        /*
         * int i = 1; // while (curr != null && i <= lastPosition) { // if (i ==
         * firstPosition) { // headNodeIt = curr; // }
         * 
         * // if (i == lastPosition) { // tailNodeIt = curr; // tailNodeIt.next = null;
         * // } // curr = curr.next; // i++; // }
         */
        // --------------------------------------------------------------------------------------------------//
        while (curr != null) { // O(n) n: size of the list
            if (curr.data.equals(firstPosition)) { // O(n)
                headNodeIt = curr; // O(n)
                // break;
            }
            curr = curr.next; // O(n)
        }

        while (curr != null) { // O(n)
            if (curr.data.equals(lastPosition)) { // O(n)
                tailNodeIt = curr; // O(n)
                // break;
            }
            curr = curr.next; // O(n)
        }
        tail.next = null; // O(n)
    }
    /*
     * O(9n + 3)-> O(n)(drop constants) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperbound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */

    public void print() {
        Node curr = this.head; // O(1)
        if (curr == null) { // O(1)
            System.out.println("[]"); // O(1)
        }
        while (curr != null) { // O(n) n: the size of the list
            System.out.print(curr.data + " "); // O(n)
            curr = curr.next; // O(n)
        }
        System.out.println(); // O(1)
    } /*
       * O(3n + 4) -> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose
       * upperbound: O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x)))
       * -> loose lower bound: O(log(n)) Big theta:Since this method have a Big omega
       * and Big O then we can say that the average or Big theta is the base runtime:
       * O(n).
       */

}

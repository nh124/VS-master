public class linkedList {
    Node head;
    Node tail;

    linkedList() {
        this.head = null; // O(1)
        this.tail = null; // O(1)
    }

    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */
    public Node firstNumber() {
        Node head = new Node(4); // O(1)
        head.next = new Node(2); // O(1)
        // head->next->next = new Node(8);
        // head->next->next->next = new Node(6);
        return head; // O(1)
    }
    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

    public Node secondNumber() {
        Node head = new Node(2); // O(1)
        head.next = new Node(8); // O(1)
        // head->next->next = new Node(1);
        // head->next->next->next = new Node(7);
        return head; // O(1)
    }

    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */
    // public:
    // Node *reverse(Node *node)
    // {
    // Node *pre;
    // Node *curr = node;
    // Node *next = NULL;
    // while (curr != NULL)
    // {
    // next = curr->next;
    // curr->next = pre;
    // pre = curr;
    // curr = next;
    // }
    // node = pre;
    // return node;
    // }
    public Node reverse(Node node) {
        Node newHead = null; // O(1)
        while (node != null) // O(n)
        {
            Node temp = node; // O(n)
            node = node.next; // O(n)

            newHead = insertAtHead(newHead, temp); // O(n)
        }
        return newHead; // O(1)
    }
    /*
     * base runtime: O(4n + 2) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */

    public Node insertAtHead(Node head, Node node) {
        node.next = head; // O(1)
        return node; // O(1)
    }
    /*
     * base runtime: O(2) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

    public Node addition(Node numb1, Node numb2) {
        numb1 = reverse(numb1); // O(1)
        numb2 = reverse(numb2); // O(1)

        Node solution = null; // O(1)
        int sum, carry = 0; // O(1)

        while (numb1 != null || numb2 != null) // O(n)
        {
            sum = carry; // O(n)
            if (numb1 != null) // O(n)
            {
                sum += (int) numb1.data; // O(n)
                numb1 = numb1.next; // O(n)
            }

            if (numb2 != null) // O(n)
            {
                sum += (int) numb2.data; // O(n)
                numb2 = numb2.next; // O(n)
            }
            carry = sum / 10; // O(n)
            sum = sum % 10; // O(n)
            solution = insertAtHead(solution, new Node(sum)); // O(n)
        }
        if (carry != 0) // O(1)
        {
            solution = insertAtHead(solution, new Node(carry)); // O(1)
        }
        return solution; // O(1)
    }

    /*
     * base runtime: O(11n + 7) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperbound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
    /*--------------------Subtract------------------------------------------------*/
    public Node getNewNode(int numb) {
        Node node = new Node(numb); // O(1)
        node.next = null; // O(1)
        node.data = numb; // O(1)
        return node; // O(1)
    }

    /*
     * base runtime: O(4) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */
    public Node subtract(Node node1, Node node2) {
        Node head1 = node1; // O(1)
        Node head2 = node2; // O(1)

        int count1 = 0, count2 = 0; // O(1)

        while (node1 != null) // O(n)
        {
            node1 = node1.next; // O(n)
            count1++; // O(n)
        }

        while (node2 != null) {
            node2 = node2.next; // O(n)
            count2++; // O(n)
        }

        node1 = head1; // O(1)
        node2 = head2; // O(1)

        if ((count1 < count2) || (count1 == count2 && node2 == getBiggerList(node1, node2))) // O(1)
        {
            Node t = node1; // O(1)
            node1 = node2; // O(1)
            node2 = t; // O(1)
        }

        node1 = reverse(node1); // O(1)
        node2 = reverse(node2); // O(1)

        Node newListHead = null; // O(1)
        Node prev = null; // O(1)
        int diff; // O(1)
        boolean borrow = false; // O(1)

        while (node1 != null || node2 != null) // O(n)
        {
            if (borrow) // O(n)
            {
                node1.data = (int) node1.data - 1; // O(n)
                borrow = false; // O(n)
            }

            if (node1 != null && node2 != null && (int) node1.data < (int) node2.data) // O(n)
            {
                node1.data = (int) node1.data + 10; // O(n)
                borrow = true; // O(n)
            }

            diff = (int) (node1 != null ? node1.data : 0) - (int) (node2 != null ? node2.data : 0); // O(n)

            Node node = getNewNode(diff); // O(n)
            if (newListHead == null) // O(n)
            {
                newListHead = node; // O(n)
            } else {
                prev.next = node; // O(n)
            }

            prev = node; // O(n)

            if (node1 != null) // O(n)
            {
                node1 = node1.next; // O(n)
            }

            if (node2 != null) // O(n)
            {
                node2 = node2.next; // O(n)
            }
        }

        newListHead = this.reverse(newListHead); // O(1)

        return newListHead; // O(1)
    }

    /*
     * base runtime: O(23n + 14) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperbound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
    public Node getBiggerList(Node node1, Node node2) {
        Node head1 = node1; // O(1)
        Node head2 = node2; // O(1)
        while (node1 != null) // O(n)
        {
            if ((int) node1.data > (int) node2.data) // O(n)
            {
                return head1; // O(1)
            } else if ((int) node1.data < (int) node2.data) {
                return head2; // O(1)
            }

            node1 = node1.next; // O(1)
            node2 = node2.next; // O(1)
        }

        return head1; // O(1)
    }

    /*
     * base runtime: O(2n + 7) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperbound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
    /*---------------Subtract------------------------------------------------------------------*/
    public long multiply(Node numb1, Node numb2) {
        int numb1Int = 0;// O(1)
        int numb2Int = 0; // O(1)

        while (numb1 != null || numb2 != null) // O(n)
        {
            if (numb1 != null) // O(n)
            {
                numb1Int = numb1Int * 10 + (int) numb1.data; // O(n)
                numb1 = numb1.next; // O(n)
            }
            if (numb2 != null) // O(n)
            {
                numb2Int = numb2Int * 10 + (int) numb2.data; // O(n)
                numb2 = numb2.next; // O(n)
            }
        }
        return numb1Int * numb2Int; // O(1)
        // std::cout << numb1Int * numb2Int << "\n";
    }
    /*
     * base runtime: O(7n + 3) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperbound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */

    public int power(Node numb1, int power) {
        int numbInt = 0; // O(1)
        while (numb1 != null) // O(n)
        {
            numbInt = numbInt * 10 + (int) numb1.data; // O(n)
            numb1 = numb1.next; // O(n)
        }
        int result = 1; // O(n)
        while (power != 0) // O(n)
        {
            result *= numbInt; // O(n)
            power--; // O(n)
        }
        return result; // O(1)
    }
    /*
     * base runtime: O(2n + 10) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperbound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */

    public void print(Node curr) {
        while (curr != null) // O(1)
        {
            System.out.println(curr.data + " "); // O(n)
            curr = curr.next; // O(n)
        }
        System.out.println(); // O(1)
    }
    /*
     * base runtime: O(3n + 2) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperbound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
}

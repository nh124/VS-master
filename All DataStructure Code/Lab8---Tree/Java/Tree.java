public class Tree<T> {
    Object data;
    Node<T> leftChild;
    Node<T> rightChild;
    Node<T> parent;
    Node<T> childN;
    Node<T> root;

    Tree(Object data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
        this.childN = null;
        this.parent = null;
        this.root = null;
    }

    public Object getValue() {
        return this.data; // O(1)
    }
    /*
     * O(1) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public boolean isLeaf(Node node, T data) {
        if (node == null) { // O(1)
            return false; // O(1)
        }
        if (node.left == null && node.right == null) { // O(1)
            return true; // O(1)
        }
        return (isLeaf(node.left, data) || isLeaf(node.right, data)); // O(n)
    }
    /*
     * O(n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public Node parent(Node node, Object data) {
        if (node == null) { // O(1)
            return null; // O(1)
        }
        Node getParent = null; // O(1)
        while (node != null) { // O(n)
            if (data == node.left.data) { // O(n)
                getParent = node; // O(n)
                node = node.left; // O(n)
            } else {
                getParent = node; // O(n)
                node = node.right; // O(n)
            }
        }
        return getParent; // O(1)
    }
    /*
     * O(6n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public Object rightSibling(Node node) {
        if (node == null) { // O(1)
            return null; // O(1)
        }
        if (node.left == null && node.right == null) { // O(1)
            return null; // O(1)
        } else {
            if (node.right != null) { // O(1)
                return node; // O(1)
            }
        }
        if (node.right != null) { // O(1)
            return rightSibling(node.right); // O(n)
        }
        return rightSibling(node.left); // O(n)
    }
    /*
     * O(2n + 7)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public void setValue(Object data) {
        this.data = data; // O(1)
    }
    /*
     * O(1) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public void setParent(Node node, Object data) {
        if (node == null) { // O(1)
            return; // O(1)
        }
        while (node != null) { // O(n)
            if (data == node.left.data) { // O(n)
                this.parent.data = data; // O(n)
                node = node.left; // O(n)
            } else {
                this.parent.data = data; // O(n)
                node = node.right; // O(n)
            }
        }
    }
    /*
     * O(6n + 2)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    Node insertFirst(Node node, T data) {
        if (node == null) { // O(1)
            return null; // O(1)
        }
        if (node.right != null) { // O(1)
            return insertFirst(node.right, data); // O(n)
        } else {
            return (node.right = new Node(data)); // O(n)
        }
    }
    /*
     * O(3n + 3)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public Node insertNext(Node node, Object data) {
        if (node == null) { // O(1)
            return null; // O(1)
        }
        while (node.next != null) { // O(n)
            node = node.next; // O(n)
        }
        return (node.next = new Node(data)); // O(n)
    }
    /*
     * O(3n + 2)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public void removeFirst() {
        Node<T> node = new Node(data); // O(1)
        if (node.data == null) { // O(1)
            return; // O(1)
        } else {
            node.right = this.leftChild; // O(1)
            if (node.left == null) { // O(1)
                return; // O(1)
            } else {
                this.leftChild = null; // O(1)
            }
        }
    }
    /*
     * O(7) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public void removeNext() {
        Node<T> node = new Node(data); // O(1)
        if (node.data == null) { // O(1)
            return; // O(1)
        } else {
            node.right = this.leftChild; // O(1)
            if (node.right == null) { // O(1)
                return; // O(1)
            } else {
                this.rightChild = null; // O(1)
            }
        }
    }
    /*
     * O(5) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public void clear(Node<T> node) {
        if (node == null) { // O(1)
            return; // O(1)
        }
        node.left = null; // O(1)
        node.right = null; // O(1)
        node = null; // O(1)
    }
    /*
     * O(5) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public Object root() {
        return root.data; // O(1)
    }
    /*
     * O(1) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    // The following methods must be in my general tree
}

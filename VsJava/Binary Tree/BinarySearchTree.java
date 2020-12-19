import javax.xml.crypto.Data;

public class BinarySearchTree<T extends Comparable<T>> {
    Node root;
    int nodeCounter;

    /*--------------GetElement-----------------------------------------*/
    public Object getElement(Node<T> node, Object data) { // O(1)
        nodeCounter++; // O(1)
        if (node == null) { // O(1)
            return -1; // O(1)
        }
        if (data == node.data) { // O(1)
            return data; // O(1)
        }
        return (int) data < (int) node.data ? getElement(node.left, data) : getElement(node.right, data); // O(n)
    }
    /*
     * O(n + 6)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public Object getData(Object data) {
        return getElement(root, data); // O(1)
    }

    /*
     * O(1) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */
    /*--------------Add/setElement-----------------------------------------*/
    public Node setElement(Node<T> node, Object data) {
        if (node == null) { // O(1)
            node = new Node(data); // O(1)
            nodeCounter++; // O(1)
            node.data = data; // O(1)
            node.left = null; // O(1)
            node.right = null; // O(1)
        }
        if ((int) data < (int) node.data) { // O(1)

            node.left = setElement(node.left, data); // O(n)

        } else if ((int) data > (int) node.data) { // O(1)

            node.right = setElement(node.right, data); // O(n)
        }
        return node;
    }
    /*
     * O(2n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
    /*--------------GetElement-----------------------------------------*/

    public void left(Node node, int data) {
        nodeCounter++; // O(1)
        int startData = 0; // O(1)
        if (node == null) { // O(1)
            return;// O(1)
        }
        if (startData < data) { // O(1)
            System.out.println(" " + node.data); // O(1)
            startData = data; // O(1)
        }
        left(node.left, data + 1); // O(n)
        left(node.right, data + 1); // O(n)
    }
    /*
     * O(2n + 7)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public boolean isLeft(Node node, int data) {
        nodeCounter++; // O(1)
        int startData = 0; // O(1)
        if (node == null) { // O(1)
            return false; // O(1)
        }
        if (startData < data) { // O(1)
            if ((int) node.data == data) { // O(1)
                return true; // O(1)
            }
            startData = (int) data; // O(1)
        }
        isLeft(node.left, data + 1); // O(n)
        isLeft(node.right, data + 1); // O(n)

        return false;
    }

    /*
     * O(2n + 8)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
    public void preOrder(Node node) { // O(1)
        nodeCounter++; // O(1)
        if (node == null) { // O(1)
            return; // O(1)
        }
        System.out.print(node.data + " "); // O(1)
        preOrder(node.left); // O(n)
        preOrder(node.right); // O(n)
    }
    /*
     * O(2n + 5)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public void inOrder(Node node) {
        nodeCounter++; // O(1)
        if (node == null) { // O(1)
            return; // O(1)
        }
        inOrder(node.left); // O(n)
        System.out.print(node.data + " "); // O(1)
        inOrder(node.right); // O(n)
    }
    /*
     * O(2n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public void postOrder(Node node) {
        nodeCounter++; // O(1)
        if (node == null) { // O(1)
            return; // O(1)
        }
        postOrder(node.left); // O(n)
        postOrder(node.right); // O(n)
        System.out.print(node.data + " "); // O(1)
    }
    /*
     * O(2n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public int nodes() {
        return nodeCounter; // O(1)
    }
    /*
     * O(1) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */
}

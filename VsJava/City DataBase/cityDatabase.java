import javax.xml.crypto.Data;

public class cityDatabase implements Comparable {
    Node root;

    /*----------------Adding city to database--------------------------------------------*/
    public Node setElement(Node node, String name, int x, int y) {
        if (node == null) { // O(1)

            node = new Node(name, x, y); // O(1)
            node.name = name; // O(1)
            node.left = null; // O(1)
            node.right = null; // O(1)
            node.x = x; // O(1)
            node.y = y; // O(1)
            node.erase = false; // O(1)
        }
        if (name.compareTo(node.name) < 0) { // O(1)

            node.left = setElement(node.left, name, x, y); // O(n)

        } else if (name.compareTo(node.name) > 0) { // O(1)

            node.right = setElement(node.right, name, x, y); // O(n)
        } else {
            if (node.erase == true) { // O(1)
                node.erase = false; // O(1)
                node.x = x; // O(1)
                node.y = y; // O(1)
            }
        }
        return node; // O(1)
    }
    /*
     * O(2n + 14)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose
     * upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x)))
     * -> loose lower bound: O(log(n)) Big theta:Since this method have a Big omega
     * and Big O then we can say that the average or Big theta is the base runtime:
     * O(n).
     */

    /*----------------Search city by coordinate/name--------------------------------------------*/
    public Node searchByCoordinate(Node node, int x, int y) {
        if (node == null) { // O(1)
            return null; // O(1)
        }
        Node temp = null; // O(1)
        if (node.x == x && node.y == y) { // O(1)
            if (node.erase == false) { // O(1)
                temp = node; // O(1)
            }
        }
        if (temp == null) { // O(1)
            temp = searchByCoordinate(node.left, x, y); // O(n)
        }
        if (node == null) { // O(1)
            temp = searchByCoordinate(node.right, x, y); // O(n)
        }
        return temp; // O(1)
    }
    /*
     * O(2n + 9)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public Node searchByName(Node node, String name) {
        if (node == null) { // O(1)
            return null; // O(1)
        }
        if (node.name == name) { // O(1)
            if (node.erase == false) { // O(1)
                return node; // O(1)
            } else {
                return searchByName(node.right, name); // O(n)
            }
        }
        if (name.compareTo(node.name) < 0) { // O(1)
            return searchByName(node.left, name); // O(n)
        }
        return searchByName(node.right, name); // O(n)
    }
    /*
     * O(3n + 6)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    /*----------------Delete city in the database by name/coordinate--------------------------------------------*/
    public String deleteByName(Node node, String name) { // O(1)
        Node newNode = searchByName(node, name); // O(1)
        if (newNode == null) { // O(1)
            return "City not found"; // O(1)
        }
        newNode.erase = true; // O(1)
        return ("City " + newNode.name + " at " + "(" + newNode.x + "," + newNode.y + ")" + " Has been deleted"); // O(1)
    }
    /*
     * O(1) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public String deleteByCoordinate(Node node, int x, int y) {
        Node newNode = searchByCoordinate(node, x, y); // O(1)
        if (newNode == null) { // O(1)
            return "City not found"; // O(1)
        }
        newNode.erase = true; // O(1)
        return ("City " + newNode.name + " at " + "(" + newNode.x + "," + newNode.y + ")" + " Has been deleted"); // O(1)
    }
    /*
     * O(6) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    /*----------------Print city to database within distance--------------------------------------------*/
    public void inOrder(Node node, int x, int y, double z) {
        if (node == null) { // O(1)
            return; // O(1)
        }
        inOrder(node.left, x, y, z); // O(n)
        if (node.erase == false) { // O(1)
            double distance = Math.sqrt(Math.pow((double) node.x - x, 2) + Math.pow((double) node.y - y, 2)); // O(1)
            if (distance < z) { // O(1)
                System.out.println(node.name + " is at " + "(" + node.x + "," + node.y + ")"); // O(1)
            }
        }
        inOrder(node.right, x, y, z); // O(n)
    }
    /*
     * O(2n + 6)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public int compareTo(Object data) { // O(1)
        return -1; // O(1)
    }
    /*
     * O(2) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

}

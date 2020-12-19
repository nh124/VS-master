public class Node {
    Node left;
    Node right;
    String name;
    int x;
    int y;
    boolean erase;

    public Node(String name, int x, int y) {
        this.name = name;
        this.left = null;
        this.right = null;
        this.x = x;
        this.y = y;
    }
}
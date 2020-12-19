/*
Design a Generic General Tree that contains the following methods:

    value
    isLeaf
    parent
    leftmostChild
    rightSibling
    setValue
    setParent
    insertFirst
    insertNext
    removeFirst
    removeNext
    clear
    root

    Note: Make sure there is a main or test method to run the methods

     Design a Generic Binary Tree that contains the following methods:

    element
    setElement
    left
    right
    isLeaf
    preorder
    in-order
    postorder
    nodes return the total number of nodes.

Note: Make sure there is a main or test method to run the methods.
*/
public class Main {
    public static void main(String[] args) {
        // Tree<Integer> tree = new Tree<>();
        BinarySearchTree<Integer> bts = new BinarySearchTree<>();
        Node root = new Node(1);
        bts.setElement(root, 2);
        bts.setElement(root, 3);
        bts.setElement(root, 4);
        bts.setElement(root, 5);
        bts.setElement(root, 6);

        System.out.println("Pre Order");
        bts.preOrder(root);

        System.out.println("In order");
        bts.inOrder(root);

        System.out.println("Post order");
        bts.postOrder(root);

        System.out.println(bts.isLeft(root, 33));
        System.out.println("There are " + bts.nodes() + " nodes");

    }
}
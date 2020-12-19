#include <iostream>
template <typename T>
struct Node
{
    Node<T> *left;
    Node<T> *right;
    T data;
    Node<T> *next;

public:
    Node(T data)
    {
        this->data = data;
        this->left = NULL;
        this->right = NULL;
        this->next = NULL;
    }
};

template <typename T>
class Tree
{
    T data;
    Node<T> *leftChild;
    Node<T> *rightChild;
    Node<T> *parent;
    Node<T> *childN;
    Node<T> *root;

public:
    Tree(T data)
    {
        this->data = data;
        this->leftChild = NULL;
        this->rightChild = NULL;
        this->childN = NULL;
        this->parent = NULL;
        this->root = NULL;
    }

public:
    T getValue()
    {
        return this->data; // O(1)
    }
    /*
     * O(1) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

public:
    bool isLeaf(Node<T> *node, T data)
    {
        if (node == NULL)
        {                 // O(1)
            return false; // O(1)
        }
        if (node->left == NULL && node->right == NULL)
        {                // O(1)
            return true; // O(1)
        }
        return (isLeaf(node->left, data) || isLeaf(node->right, data)); // O(n)
    }
    /*
     * O(n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

public:
    Node<T> *parenting(Node<T> *node, T data)
    {
        if (node == NULL)
        {                // O(1)
            return NULL; // O(1)
        }
        Node<T> *getParent = NULL; // O(1)
        while (node != NULL)
        { // O(n)
            if (data == node->left->data)
            {                      // O(n)
                getParent = node;  // O(n)
                node = node->left; // O(n)
            }
            else
            {
                getParent = node;   // O(n)
                node = node->right; // O(n)
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

public:
    T rightSibling(Node<T> *node)
    {
        if (node == NULL)
        {                // O(1)
            return NULL; // O(1)
        }
        if (node->left == NULL && node->right == NULL)
        {                // O(1)
            return NULL; // O(1)
        }
        else
        {
            if (node->right != NULL)
            {                // O(1)
                return NULL; // O(1)
            }
        }
        if (node->right != NULL)
        {                                     // O(1)
            return rightSibling(node->right); // O(n)
        }
        return rightSibling(node->left); // O(n)
    }
    /*
     * O(2n + 7)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

public:
    void setValue(T data)
    {
        this->data = data; // O(1)
    }
    /*
     * O(1) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

public:
    void setParent(Node<T> *node, T data)
    {
        if (node == NULL)
        {           // O(1)
            return; // O(1)
        }
        while (node != NULL)
        { // O(n)
            if (data == node->left->data)
            {                              // O(n)
                this->parent->data = data; // O(n)
                node = node->left;         // O(n)
            }
            else
            {
                this->parent->data = data; // O(n)
                node = node->right;        // O(n)
            }
        }
    }
    /*
     * O(6n + 2)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    Node<T> *insertFirst(Node<T> *node, T data)
    {
        if (node == NULL)
        {                // O(1)
            return NULL; // O(1)
        }
        if (node->right != NULL)
        {                                          // O(1)
            return insertFirst(node->right, data); // O(n)
        }
        else
        {
            return (node->right = new Node<T>(data)); // O(n)
        }
    }
    /*
     * O(3n + 3)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

public:
    Node<T> *insertNext(Node<T> *node, T data)
    {
        if (node == NULL)
        {                // O(1)
            return NULL; // O(1)
        }
        while (node->next != NULL)
        {                      // O(n)
            node = node->next; // O(n)
        }
        return (node->next = new Node<T>(data)); // O(n)
    }
    /*
     * O(3n + 2)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

public:
    void removeFirst()
    {
        Node<T> *node = new Node<T>(1); // O(1)
        if (node->data == NULL)
        {           // O(1)
            return; // O(1)
        }
        else
        {
            node->right = this->leftChild; // O(1)
            if (node->left == NULL)
            {           // O(1)
                return; // O(1)
            }
            else
            {
                this->leftChild = NULL; // O(1)
            }
        }
    }
    /*
     * O(7) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

public:
    void removeNext()
    {
        Node<T> *node = new Node<T>(1); // O(1)
        if (node->data == NULL)
        {           // O(1)
            return; // O(1)
        }
        else
        {
            node->right = this->leftChild; // O(1)
            if (node->right == NULL)
            {           // O(1)
                return; // O(1)
            }
            else
            {
                this->rightChild = NULL; // O(1)
            }
        }
    }
    /*
     * O(5) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

public:
    void clear(Node<T> *node)
    {
        if (node == NULL)
        {           // O(1)
            return; // O(1)
        }
        node->left = NULL;  // O(1)
        node->right = NULL; // O(1)
        node = NULL;        // O(1)
    }
    /*
     * O(5) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

public:
    T rooting()
    {
        return root->data; // O(1)
    }
    /*
     * O(1) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    // The following methods must be in my general tree
};

template <typename T>
class BinarySearchTree
{
    Node<T> *root;
    int nodeCounter;

    /*--------------GetElement-----------------------------------------*/
public:
    T getElement(Node<T> *node, T data)
    {                  // O(1)
        nodeCounter++; // O(1)
        if (node == NULL)
        {              // O(1)
            return -1; // O(1)
        }
        if (data == node->data)
        {                // O(1)
            return data; // O(1)
        }
        return (int)data < (int)node->data ? getElement(node->left, data) : getElement(node->right, data); // O(n)
    }
    /*
     * O(n + 6)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

public:
    T getData(T data)
    {
        return getElement(root, data); // O(1)
    }

    /*
     * O(1) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */
    /*--------------Add/setElement-----------------------------------------*/
public:
    Node<T> *setElement(Node<T> *node, T data)
    {
        if (node == NULL)
        {                             // O(1)
            node = new Node<T>(data); // O(1)
            nodeCounter++;            // O(1)
            node->data = data;        // O(1)
            node->left = NULL;        // O(1)
            node->right = NULL;       // O(1)
        }
        if ((int)data < (int)node->data)
        { // O(1)

            node->left = setElement(node->left, data); // O(n)
        }
        else if ((int)data > (int)node->data)
        { // O(1)

            node->right = setElement(node->right, data); // O(n)
        }
        return node;
    }
    /*
     * O(2n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
public:
    void add(T data)
    {
        setElement(root, data);
    }
    /*--------------GetElement-----------------------------------------*/

public:
    void left(Node<T> *node, T data)
    {
        nodeCounter++;     // O(1)
        int startData = 0; // O(1)
        if (node == NULL)
        {           // O(1)
            return; // O(1)
        }
        if (startData < data)
        {                                          // O(1)
            std::cout << " " + node->data << "\n"; // O(1)
            startData = data;                      // O(1)
        }
        left(node->left, data + 1);  // O(n)
        left(node->right, data + 1); // O(n)
    }
    /*
     * O(2n + 7)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

public:
    bool isLeft(Node<T> *node, T data)
    {
        nodeCounter++;     // O(1)
        int startData = 0; // O(1)
        if (node == NULL)
        {                 // O(1)
            return false; // O(1)
        }
        if (startData < data)
        { // O(1)
            if ((int)node->data == data)
            {                // O(1)
                return true; // O(1)
            }
            startData = (int)data; // O(1)
        }
        isLeft(node->left, data + 1);  // O(n)
        isLeft(node->right, data + 1); // O(n)

        return false;
    }
    /*
     * O(2n + 8)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

public:
    void preOrder(Node<T> *node)
    {                  // O(1)
        nodeCounter++; // O(1)
        if (node == NULL)
        {           // O(1)
            return; // O(1)
        }
        std::cout << node->data << " "; // O(1)
        preOrder(node->left);           // O(n)
        preOrder(node->right);          // O(n)
    }
    /*
     * O(2n + 5)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

public:
    void inOrder(Node<T> *node)
    {
        nodeCounter++; // O(1)
        if (node == NULL)
        {           // O(1)
            return; // O(1)
        }
        inOrder(node->left);            // O(n)
        std::cout << node->data << " "; // O(1)
        inOrder(node->right);           // O(n)
    }
    /*
     * O(2n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

public:
    void postOrder(Node<T> *node)
    {
        nodeCounter++; // O(1)
        if (node == NULL)
        {           // O(1)
            return; // O(1)
        }
        postOrder(node->left);          // O(n)
        postOrder(node->right);         // O(n)
        std::cout << node->data << " "; // O(1)
    }

    /*
     * O(2n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
public:
    int nodes()
    {
        return nodeCounter; // O(1)
    }
    /*
     * O(1) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */
};

int main()
{
    // Tree<Integer> tree = new Tree<>();

    BinarySearchTree<int> *bts = new BinarySearchTree<int>();
    Node<int> *root = new Node<int>(1);
    bts->setElement(root, 2);
    bts->setElement(root, 3);
    bts->setElement(root, 4);
    bts->setElement(root, 5);
    bts->setElement(root, 6);
    // bts->add(1);
    // bts->add(2);
    // bts->add(3);
    // bts->add(4);
    // bts->add(5);
    // bts->add(6);

    std::cout << "Pre order"
              << "\n";
    bts->preOrder(root);

    std::cout << "In order"
              << "\n";
    bts->inOrder(root);

    std::cout << "Post order"
              << "\n";
    bts->postOrder(root);

    std::cout << bts->isLeft(root, 33) << "\n";
    std::cout << "There are " << bts->nodes() << " nodes"
              << "\n";
    return -1;
}
#include <iostream>

template<typename T>struct Node{
  Node<T>* left;
  Node<T>* right;
  T data;
  public:
    Node(T data){
      this->data = data;
      left = NULL;
      right = NULL;
    }
};
template <typename T>class Tree{
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
template<typename T>class BinaryTree{
  Node<T>* root;
  public:
    Node<T>* setElement(Node<T>* root,T data){
      if(root == NULL){ // O(1)
        root = new Node(data); // O(1)
        root->data = data; // O(1)
        root->left = NULL; // O(1) 
        root->right = NULL; // O(1)
      }
      if(root->data < data){ // O(1)
        root->left = setElement(root->left,data);  // O(n)
      }else if(root->data > data){ // O(1)
        root->right = setElement(root->right, data); // O(n)
      }
      return root; // O(1)
    }
    /*
     * O(2n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    void leftSide(Node<T>* root){
      this->root = root; // O(1)
      if(root == NULL){ // O(1)
        return; // O(1)
      }
      while(root->left != NULL){ // O(n)
        std::cout << root->left->data << " "; // O(1)
        root->left = root->left->left; // O(1)
      }
    }
    /*
     * O(n + 5)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    bool isLeft(Node<T>* root, T data){
      if(root == NULL){ // O(1)
        return false; // O(1)
      }
      while(root->left != NULL){ // O(n)
        if(root->left->data == data){ // O(n)
          //std::cout << "root->left: " << root->left->data << "data: " << data << "\n";
          return true; // O(1)
        }
        root->left = root->left->left; // O(n)
      }
      return false; // O(1)
    }
   /*
     * O(3n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
    /*-------------------------------------------------------------------------------------*/
    void preOrder(Node<T>* root){
      if(root == NULL){ // O(1)
        return; // O(1)
      }
      std::cout << root->data << " "; // O(1)
      preOrder(root->left); // O(n)
      preOrder(root->right); // O(n)
    } 
     /*
     * O(2n + 5)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
  
    void inOrder(Node<T>* root){
      if(root == NULL){ // O(1)
        return; // O(1)
      }
      preOrder(root->left); // O(n)
      std::cout << root->data << " "; // O(1)
      preOrder(root->right); // O(n)
    }
    /*
     * O(2n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

   
    void postOrder(Node<T>* root){ 
      if(root == NULL){ // O(1)
        return; // O(1)
      }
      preOrder(root->left); // O(n)
      preOrder(root->right); // O(n)
      std::cout << root->data << " "; // O(1)
    }
   /*
     * O(2n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
};

int main() {
  BinaryTree<int>* bst = new BinaryTree<int>();
  Node<int>* root = new Node<int>(1);
  bst->setElement(root,4);
  bst->setElement(root, 1);
  bst->setElement(root, 3);
  bst->setElement(root, 5);
  bst->setElement(root, 7);
  bst->setElement(root, 2);
  bst->setElement(root, 1);
  bst->inOrder(root);
  std::cout << "\n";
  std::cout << "left Side--- " << "\n";
  std::cout << "\n";
  bst->leftSide(root);
  std::cout << "isLeft: 9 -> " << bst->isLeft(root, 4) << "\n";
  
  //std::cout << "Hello World!\n";
}
public class avlTree<T extends Comparable<T>>{
    NodeS<T> root;
    int balance;
    int balanceLeft;
    int balanceRight;
    
    
    public int max(int x, int y){ // O(1)
      return x > y ? x: y; // O(1)
    }
    /*
     * O(2) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */
    public int height(NodeS<T> node){ // O(1)
      if(node == null){ // O(1)
        return 0; // O(1)
      }else{ // O(1)
        return node.height; // O(1) // everytime the a new data is inserted the height is updated from each sub tree as well as the whole tree
      }
    }
    /*
     * O(5) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
    */

  public NodeS<T> rotateLeft(NodeS<T> root){ // O(1)
      NodeS<T> newRoot = root.right; // O(1)
      NodeS<T> temp = newRoot.left; // O(1)
      // newRoot = root;
      // temp = newRoot.left;

      newRoot.left = root; // resetting root // O(1)
      root.right = temp; // O(1)

      root.height = max(height(root.left), height(root.right)) + 1; // O(n)
      newRoot.height = max(height(newRoot.left), height(newRoot.right)) + 1; // O(n)
      return newRoot; // O(1)
  }
  /*
     * O(2n + 6)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public NodeS<T> rotateRight(NodeS<T> root){ // O(1)
      NodeS<T> newRoot = root.left; // O(1)
      NodeS<T> temp = newRoot.right; // O(1)

      newRoot.right = root; // setting the right node to the left // O(1)
      root.left = temp;  // setting left node to the right // O(1) 
      // rotation complete

      //recalculation height
      root.height = max(height(root.left), height(root.right)) + 1; // O(n)
      newRoot.height = max(height(newRoot.left), height(newRoot.right)) + 1; // O(n)

      return newRoot; // resetting the root // O(1)
    }
    /*
     * O(2n + 6)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
    
    public int getBalance(NodeS<T> node){ // O(1)
      if(node == null){ // O(1)
        return -1; // O(1)
      }
      return height(node.left) - height(node.right); // O(1)
    }
    /*
     * O(4) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
    */

    public NodeS<T> insert(NodeS<T> node, T data, StackImp<T> stack) { // O(1)
        if (node == null) { // O(1)
           node = new NodeS(data,stack); // O(1)
           node.data = data; // O(1)
           node.left = null; // O(1)
           node.right = null; // O(1)
        }
        if (data.compareTo(node.data) < 0) { // O(1)
            node.left = insert(node.left , data ,stack); // O(n)
        } else if(data.compareTo(node.data) > 0) { 
            node.right = insert(node.right, data, stack); // O(n)
        }else{
          return node; // O(1)
        }

        balance = getBalance(node); // O(1)

        if(balance > 1 && data.compareTo(node.left.data) > 0  ){ //left and right is unbalanced // O(1)
          return rotateRight(node); // O(1)
        }else if(balance >  1 && data.compareTo(node.left.data) < 0){ // left side in unbalanced
          return rotateRight(node); // O(1)
        }else if(balance < -1 && data.compareTo(node.right.data) > 0){ // right and left side is unbalanced
          return rotateRight(node); // O(1)
        }else if(balance < -1 && data.compareTo(node.right.data) < 0){ // right side is unbalanced
          return rotateRight(node); // O(1)
        }else{
          return null; // O(1)
        }
    }
    /*
     * O(2n + 14)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose
     * upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x)))
     * -> loose lower bound: O(log(n)) Big theta:Since this method have a Big omega
     * and Big O then we can say that the average or Big theta is the base runtime:
     * O(n).
     */
   
    /*-----------------------------------------------------------------------------------------------------------*/

    public NodeS<T> findMin(NodeS<T> node){ // O(1)
      if(node == null){ // O(1)
        return null; // O(1)
      }
      while(node.left != null){ // O(1)
        node = node.left; // O(1)
      }
      return node; // O(1)
    }

    
    public NodeS<T> delete(NodeS<T> node, T data){ // O(1)
      if(node == null){ // O(1)
        return null; // O(1)
      }
      if(data.compareTo(node.data) < 0){ // O(1)
        node.left = delete(node.left, data); // O(n)
      }else if(data.compareTo(node.data) > 0){ // O(1)
        node.right = delete(node.right, data); // O(n)
      }else{ // O(1)
        if(node.left == null && node.right == null){ // O(1)
          node = null; // O(1)
        }else if(node.left == null || node.right == null){ 
          if(node.left == null){ // O(1)
            node = node.right; // O(1)
          }else{ 
            node = node.left; // O(1)
          }
        }else{
          NodeS<T> minPtr = findMin(node.right); // O(1)
          node.data = minPtr.data; // O(1)
          node.right = delete(node.right, data); // O(1)
        }
      }
      balance = getBalance(node); // O(1)
      balanceLeft = getBalance(node.left); // O(1)
      balanceRight = getBalance(node.right); // O(1)

        if(balance > 1 && balanceLeft > 0  ){ //left and right is unbalanced // O(1)
          return rotateRight(node); // O(1)
        }else if(balance >  1 && balanceLeft < 0){ // left side in unbalanced
          node.left = rotateLeft(node.left); // O(1)
          return rotateRight(node); // O(1) 
        }else if(balance < -1 && balanceRight > 0){ // right and left side is unbalanced
          node.right = rotateRight(node.right);  // O(1)
          return rotateLeft(node); // O(1)
        }else if(balance < -1 && balanceRight < 0){ // right side is unbalanced
          return rotateLeft(node); // O(1)
        }
      return node;  // O(1)
    }
     /*
     * O(2n + 31)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
    public void inOrder(NodeS<T> node)
    {
        if (node == null) // O(1)
        {           
            return; // O(1)
        }
        inOrder(node.left);            // O(n)
        System.out.print(node.data + " | "); // O(1)
        node.stack.print(); // O(1)
        inOrder(node.right);           // O(n)
    }
     /*
     * O(2n + 6)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
}

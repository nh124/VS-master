public class AvlTree implements Comparable{
    Node root;
    int balance;
    int balanceLeft;
    int balanceRight;
    
  /*------Avl tree fuctions ---------------------------------------------*/
    public void printStateMent(Node node){ // ruducing repetition  // O(1)
      System.out.println("ID: " + node.userId + " Name: " + node.userName + "\n Bio: " + node.bio + "\n url: " + node.url); // O(1)
      System.out.println("----------------------------------------------------------------"); // O(1)
    }
     /*
     * O(3) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public int max(int x, int y){ // O(1) 
      return x > y ? x: y; // O(1) 
    }
    public int height(Node node){ // O(1)
      if(node == null){ // O(1)
        return 0; // O(1)
      }else{
        return node.height;  // O(1) // everytime the a new data is inserted the height is updated from each sub tree as well as the whole tree
      }
    }
     /*
     * O(6) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public Node rotateLeft(Node root){
      Node newRoot = root.right; // O(1)
      Node temp = newRoot.left; // O(1)
      // newRoot = root;
      // temp = newRoot.left;

      newRoot.left = root; // O(1) // resetting root 
      root.right = temp; // O(1)

      root.height = max(height(root.left), height(root.right)) + 1; // O(n)
      newRoot.height = max(height(newRoot.left), height(newRoot.right)) + 1; // O(n)
      return newRoot; //O(1)
    }
     /*
     * O(2n + 5)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public Node rotateRight(Node root){
      Node newRoot = root.left; // O(1)
      Node temp = newRoot.right; // O(1)

      newRoot.right = root; // setting the right node to the left // O(1)
      root.left = temp;  // setting left node to the right  // O(1)
      // rotation complete

      //recalculation height
      root.height = max(height(root.left), height(root.right)) + 1; // O(n)
      newRoot.height = max(height(newRoot.left), height(newRoot.right)) + 1; // O(n)

      return newRoot; // resetting the root // O(1)
    }
    
    public int getBalance(Node node){ // O(1) 
      if(node == null){ // O(1)
        return -1; // O(1)
      }
      return height(node.left) - height(node.right); // O(1)
    }
     /*
     * O(2n + 9)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
  /*---------------------------------------------------------------------*/

/*------------Insert users--------------------------------------------------------------------*/
  public Node insertion(Node node, int userId, String userName, String bio, String url){
    //this.root = node;
    if (node == null)
        { // O(1)

            node = new Node(userId,userName, bio, url); // O(1)
            node.userId = userId;           // O(1)
            node.userName = userName;       // O(1)
            node.bio = bio;                 // O(1)
            node.left = null;               // O(1)
            node.url = url;                 //O(1)
            node.right = null;              // O(1)
            node.erase = false;            // O(1)
        }
        if (userName.compareTo(node.userName) < 0)
        { // O(1)
            node.left = insertion(node.left, userId, userName, bio, url); // O(n)
        }
        else if (userName.compareTo(node.userName) > 0)
        { // O(1)
            node.right = insertion(node.right, userId, userName, bio, url); // O(n)
        }
        else{
          return node; // O(1)
      }
      if(balance > 1 && userName.compareTo(node.left.userName) > 0  ){ //left and right is unbalanced // O(1)
          return rotateRight(node); // O(1)
        }else if(balance >  1 && userName.compareTo(node.left.userName) < 0){ // left side in unbalanced
          return rotateRight(node); // O(1)
        }else if(balance < -1 && userName.compareTo(node.right.userName) > 0){ // right and left side is unbalanced
          return rotateRight(node); // O(1)
        }else if(balance < -1 && userName.compareTo(node.right.userName) < 0){ // right side is unbalanced
          return rotateRight(node); // O(1)
        }else{
          return null; // O(1)
        }
  }
   /*
     * O(2n + 15)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose
     * upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x)))
     * -> loose lower bound: O(log(n)) Big theta:Since this method have a Big omega
     * and Big O then we can say that the average or Big theta is the base runtime:
     * O(n).
     */

/*------------searchByID--------------------------------------------------------------------*/
  public Node searchByID(Node node, int userId){ //O(1)
    //this.root = node;
     if (node == null) // O(1)
        {                
            return null; // O(1)
        }
        Node temp = null; // O(1)
        if (node.userId == userId)// O(1)
        { 
            if (node.erase == false) // O(1)
            {                
                temp = node; // O(1)
            }
        }
        if (temp == null) // O(1)
        {                                                
            temp = searchByID(node.left, userId); // O(n)
        }
        if (node == null) // O(1)
        {                                                 
            temp = searchByID(node.right, userId); // O(n)
        }
        printStateMent(node);  // O(1) 
        return temp; // O(1)
  }
   /*
     * O(2n + 11)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose
     * upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x)))
     * -> loose lower bound: O(log(n)) Big theta:Since this method have a Big omega
     * and Big O then we can say that the average or Big theta is the base runtime:
     * O(n).
     */
/*------------searchByName--------------------------------------------------------------------*/
  public Node searchingByName(Node node, String userName){ //O(1)
    if (node == null) // O(1)
    {                
        return null; // O(1)
    }
    if (node.userName == userName) // O(1)
    { 
      if (node.erase == false) // O(1)
      {
        printStateMent(node);  // O(1)           
        return node; // O(1)
      }
      else
      {
        printStateMent(node); // O(1)
        return searchingByName(node.right, userName); // O(n)
      }
    }
    if (userName.compareTo(node.userName) < 0)
    {
      printStateMent(node);                                       
      return searchingByName(node.left, userName); // O(n)
    }
    printStateMent(node);  
    return searchingByName(node.right, userName); // O(n)
  }
   /*
     * O(3n + 8)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
  
/*--------------------------------------------------------------------------------*/



/*------------DeleteByID--------------------------------------------------------------------*/
  public Node findMIn(Node node){ // O(1)
    //this.root = node;
    if(node == null){ // O(1)
      return null; // O(1)
    }
    while(node.left != null){ // O(1)
      node = node.left; // O(1)
    }
    return node; // O(1)
  }
   /*
     * O(6) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
    */
  public Node DeleteById(Node node, int userId){ // O(1) 
    if(node == null){ // O(1)
      return null; // O(1)
    }
    //this.root = node;
    if(userId < node.userId){ // O(1)
      node.left = DeleteById(node.left, userId); // O(n)
    }else if(userId > node.userId){ // O(1)
      node.right = DeleteById(node.right, userId); // O(n)
    }else{ // O(1)
      if(node.left == null && node.right == null){ // O(1)
        return null; // O(1)
      }else if(node.left == null || node.right == null){ 
        if(node.left == null){ // O(1)
          node = node.right; // O(1)
        }else{ 
          node = node.left; // O(1)
        }
      }else{
        Node minPointer = findMIn(node.right); // O(1)
        node.userId = minPointer.userId; // O(1)
        node.right = DeleteById(node.right, userId); // O(1)
      }
    }
    // balanceing 
    balance = getBalance(node); // O(1)
    balanceLeft = getBalance(node.left); // O(1)
    balanceRight = getBalance(node.right); // O(1)
    
    if(balance > 1 && balanceLeft > 0  ){ //left and right is unbalanced // O(1)
      return rotateRight(node); // O(1)
    }else if(balance >  1 && balanceLeft < 0){ // left side in unbalanced // O(1)
      node.left = rotateLeft(node.left); // O(1)
      return rotateRight(node); // O(1)
    }else if(balance < -1 && balanceRight > 0){ // right and left side is unbalanced // O(1)
      node.right = rotateRight(node.right);  // O(1)
      return rotateLeft(node); // O(1)
    }else if(balance < -1 && balanceRight < 0){ // right side is unbalanced // O(1)
      return rotateLeft(node); // O(1)
    }
  return node; // O(1)
  }
  /*
     * O(2n + 26)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
/*--------------------------------------------------------------------------------*/

/*------------DeleteByName--------------------------------------------------------------------*/
 
  public Node DeleteByName(Node node, String userName){ // O(1)
    if(node == null){ // O(1)
      return null; // O(1)
    }
    //this.root = node;
    if(userName.compareTo(node.userName) < 0){ // O(1)
      node.left = DeleteByName(node.left, userName); // O(n)
    }else if(userName.compareTo(node.userName) > 0){ // O(1)
      node.right = DeleteByName(node.right, userName); // O(n)
    }else{
      if(node.left == null && node.right == null){ // O(1)
        return null; // O(1)
      }else if(node.left == null || node.right == null){
        if(node.left == null){ //O(1)
          node = node.right;  //O(1)
        }else{  
          node = node.left; //O(1)
        }
      }else{
        Node minPointer = findMIn(node.right); //O(1)
        node.userName = minPointer.userName; //O(1)
        node.right = DeleteByName(node.right, userName); //O(1)
      }
    }
    // balanceing 
    balance = getBalance(node); //O(1)
    balanceLeft = getBalance(node.left); //O(1)
    balanceRight = getBalance(node.right); //O(1)
    
    if(balance > 1 && balanceLeft > 0  ){ //left and right is unbalanced //O(1)
      return rotateRight(node); //O(1)
    }else if(balance >  1 && balanceLeft < 0){ // left side in unbalanced //O(1)
      node.left = rotateLeft(node.left); //O(1)
      return rotateRight(node);
    }else if(balance < -1 && balanceRight > 0){ // right and left side is unbalanced //O(1)
      node.right = rotateRight(node.right);  //O(1)
      return rotateLeft(node); //O(1)
    }else if(balance < -1 && balanceRight < 0){ // right side is unbalanced //O(1)
      return rotateLeft(node); //O(1)
    }
  return node; //O(1)
  }
  /*
     * O(2n + 26)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

/*--------------------------------------------------------------------------------*/
public int compareTo(Object data){ //O(1)
  return -1; //O(1)
}
/*
     * O(2) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */
/*-------Printing-------------------------------------------------------------------------*/
  public void printInOrder(Node node, String search){
    //this.root = node;
    if(node == null){ //O(1)
      return; //O(1)
    }
    
    printInOrder(node.left, search); //O(n)

    System.out.println(node.userName.substring(0, search.length()) + " versus " + search);
    if(node.userName.substring(0, search.length()).equals(search)){ //O(1
        printStateMent(node);  //O(1)
    }
    printInOrder(node.right, search); //O(n)
  }
  /*
     * O(2n + 9)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

}
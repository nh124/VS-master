class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      maxHeap_TO_BinarySearchTree<Integer> mh_Bst = new maxHeap_TO_BinarySearchTree<>();
      mh_Bst.add(1);
      mh_Bst.add(2);
      mh_Bst.add(3);
      mh_Bst.add(4);
      mh_Bst.add(5);
      mh_Bst.add(6);
      mh_Bst.add(7);
      mh_Bst.add(8);
      mh_Bst.conversion();
      mh_Bst.binaryPrint();
      // Note
      /*
      ** Since this is a max heap when reversein it it tuns into a 
      ** inOrder traversal of a binary search Tree. 
      */  
  
    
    }
  }
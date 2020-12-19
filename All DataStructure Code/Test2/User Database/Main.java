/*----------Question 3------------------------*/
class Main {
    public static void main(String[] args) {
      AvlTree avl = new AvlTree();
      Node root = new Node(1,"Goku","Protagonist of Dragon ball Z", "https://media.interaksyon.com/wp-content/uploads/2020/01/Son-Goku-640x427.jpg");
      avl.insertion(root, 2,"Gohan","Son of Goku", "https://techanimate.com/wp-content/uploads/2018/01/gohan-quotes-thumbnail-1024x576.jpg");
      avl.insertion(root,3,"Goten","Son of goku and brother of Gohan", "https://static.wikia.nocookie.net/dragonball/images/2/29/GotenNV.png/revision/latest?cb=20191108050056");
      avl.insertion(root,4,"Trunks","Son of the PRINCE OF ALL SAIYANA: VEGETA", "https://static.wikia.nocookie.net/ultimatepopculture/images/c/c8/Trunks_DBZ_Ep_131_001.png/revision/latest?cb=20191014172429");
      avl.insertion(root,5,"UI Goku","UNSTOPPABLE", "https://qph.fs.quoracdn.net/main-qimg-ad7f3f5b280c0296b28d10b752d01c55");
      avl.insertion(root,6,"Vegeta","PRINCE OF ALL SAIYANA", "https://i.redd.it/1xlrjb24x4f41.jpg");
      avl.insertion(root,7,"beerus","Food Loving God", "https://i.ytimg.com/vi/HMfkhk7mu6U/maxresdefault.jpg");
      avl.printInOrder(root,"V"); 
  
    }
  }
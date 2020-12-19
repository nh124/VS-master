public class Node{
    int userId;
    String userName;
    String bio;
    String url;
    /*--------------*/
    Node left;
    Node right;
    /*--------------*/
    int height;
    boolean erase;
    
    public Node(int userId, String userName, String bio, String url){
      this.userId = userId;
      this.userName = userName;
      this.bio = bio;
      this.url = url;
      left = null;
      right = null;
      height = 1;
    }
    // Each indevidual is an object and each indevidual has their own id, name , bio, and ID.
  }
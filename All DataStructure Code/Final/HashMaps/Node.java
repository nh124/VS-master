public class Node<k,v>{
    k key;
    v val;
    Node<k,v> next;
  
    public Node(k key, v value){
        this.key = key;
        this.val = val;
        next = null;
    } 
  }
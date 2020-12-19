public class Hash_Map<k,v>{

    int i;
    Node [] data = new Node[10];
    int size = data.length;

    public int hashing(Object data){
      int hashCode = data.hashCode(); //O(1)
      int key = hashCode % size; //O(1)
      return key; //O(1)
    }
    /* base runtime: O(3) -> O(1)
      Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */ 
    
    public void put(k key, v val){
      int index = hashing(key); //O(1) 
      Node<k,v> entry = new Node<>(key,val); //O(1)
      entry.key = key; //O(1)
      entry.val = val; //O(1)

      if(data[index] == null){ //O(1)
        data[index] = entry; //O(1)
      }else{
        Node<k,v> noding = null; //O(1)
        Node<k,v> newEntry = data[index]; //O(1)
        while(newEntry != null){ //O(n)
          if(newEntry.key.equals(key)){ //O(n)
            newEntry.val = val; //O(n)
            break; //O(1)
          }
          noding = newEntry; //O(n)
          newEntry = newEntry.next; //O(n)
        }
        if(noding != null){ //O(1)
          noding.next = entry; //O(1)
        }
      }
    }
     /*
     * O(6n + 11)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
    public void delete(k key){
      int index = hashing(key); //O(1)
      Node<k,v> noding = null; //O(1)
      Node<k,v> entry = data[index]; //O(1)
      while(entry != null){ //O(n)
        if(entry.key.equals(key)){ //O(n)
          if(noding == null){ //O(n)
            entry = entry.next; //O(n)
            data[index] = entry; //O(n)
            return; //O(1)
          }else{
            noding.next = entry.next; //O(n)
            return; //O(n)
          }
        }
        noding = entry; //O(1)
        entry = entry.next; //O(1)
      }
    }
    /*
     * O(8n + 5)-> O(n) Big O: O(n) -> tight upper bound: O(10n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
    public boolean containsKey(k key){
      int index = hashing(key); //O(1)
      Node<k,v> entry = data[index]; //O(1)
      while(entry != null){ //O(n)
        if(entry.key.equals(key)){ //O(n)
          return true; //O(1)
        }
        entry = entry.next; //O(n)
      }
      return false; //O(1)
    } 
    /*
     * O(3n + 4)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    public void print(){
      for(i = 0; i < size; i++){ //O(3n)
        if(data[i] != null){ //O(n)
          Node<k,v> currNode = data[i]; //O(n)
          while(currNode != null){ //O(n^2)
            System.out.println(currNode.key + " = " +  currNode.val); //O(n^2)
            currNode = currNode.next; //O(n^2)
          }
        }
      }
    }
    /*
     * O(3n^2 + 5n) -> O(n^2) Big O: O(n^3) -> tight upper bound: O(11n^2) ->
     * loose upperBound: O(10.5n^2) Big omega: O(n) -> tight lower bound: O(1) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(n^2).
     */
}
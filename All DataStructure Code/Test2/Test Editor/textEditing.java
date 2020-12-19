public class textEditing{
    linkedList<Character> ll = new linkedList();
    int sizeOfString;
  
    public void wordTra(String word){ 
      this.sizeOfString = word.length(); // O(1)
      char [] wordArr = word.toCharArray(); // O(1)
      for(int i = 0; i < word.length(); i++){ // O(3n + 1)
        ll.put(wordArr[i]); // O(n)
      }
      ll.put('|'); // O(1)
      ll.print(); // O(1)
    }
    /*
       * O(4n + 5)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
       * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
       * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
       * then we can say that the average or Big theta is the base runtime: O(n).
       */
    public void moveCourserLeft(int leftArrow){
      boolean isEmpty = ll.isEmpty();  // O(1)
      if(isEmpty){ // O(1)
        return; // O(1)
      }else{
        int currPos = ll.findPos('|'); // O(1) 
        ll.deleteGivenPosition(currPos+1); // O(1)
        ll.insertAt((sizeOfString-leftArrow)+1, '|'); // O(1)
        ll.print(); // O(1)
      }
    }
    /*
       * O(7) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
       * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
       * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
       * can say that the average or Big theta is the base runtime: O(1).
    */
    public void moveCourserRight(int rightArrow){
      char lastPos = (char)ll.getLast(); // O(1) 
      if(lastPos == '|'){ // O(1)
        return; // O(1)
      }else{
        int currPos = ll.findPos('|'); // O(1)
        ll.deleteGivenPosition(currPos+1); // O(1)
        ll.insertAt((currPos+rightArrow)+1,'|'); // O(1)
        ll.print(); // O(1)
      }
    }
    /*
       * O(7) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
       * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
       * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
       * can say that the average or Big theta is the base runtime: O(1).
    */
    public void insertChar(char c){
      int cursorPos = ll.findPos('|'); // O(1)
      ll.insertAt((cursorPos+1),c); // O(1)
      ll.print(); // O(1)
    }
    /*
       * O(3) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
       * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
       * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
       * can say that the average or Big theta is the base runtime: O(1).
    */
    public void deleteChar(){
      boolean isEmpty = ll.isEmpty(); // O(1)
      if(isEmpty){ // O(1)
        return; // O(1)
      }else{
        int cursorPos = ll.findPos('|'); // O(1)
        ll.deleteGivenPosition((cursorPos-1)+1); // O(1)
        ll.print(); // O(1)
      }
    }
    /*
       * O(6) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
       * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
       * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
       * can say that the average or Big theta is the base runtime: O(1).
    */
  }
/*
  boolean	add(E e)
  Appends the specified element to the end of this list.

  void	add(int index, E element)
  Inserts the specified element at the specified position in this list.

  void	clear()
  Removes all of the elements from this list.

  boolean	contains(Object o)
  Returns true if this list contains the specified element.

  E	get(int index)
  Returns the element at the specified position in this list.

  int	indexOf(Object o)
  Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.

  boolean	isEmpty()
  Returns true if this list contains no elements.

  int	lastIndexOf(Object o)
  Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.

  E	remove(int index)
  Removes the element at the specified position in this list.

  int	size()
  Returns the number of elements in this list.

  Object[]	toArray()
  Returns an array containing all of the elements in this list in proper sequence (from first to last element).
*/
import java.util.Arrays;
class ArrayList<T>{
  int i;
  final int size = 10;
  int curPos = 0;
  Object [] arr = new Object[size];

  public void resize(){ //O(1)
      int newSize = arr.length*2; //O(1)
      arr = Arrays.copyOf(arr, newSize); //O(1)
  }
  /* base runtime: O(3) -> O(1)
      Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
  */ 

  public void add(Object data){  //O(1)
    if(curPos == arr.length){ //O(1)
      resize(); //O(1)
    }
    arr[curPos] = data; //O(1)
    curPos++; //O(1)
  }
  /*
     * base runtime: O(5) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

  public void insertAt(Object data, int position){ //O(1)
    for(i = 0; i < position-1; i++){ //O(3n)
      arr[i] = arr[i+1]; //O(n)
    }
    arr[position-1] = data; //O(1)
  }
    /* base runtime: O(4n + 3) -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */  

  public void clear(){
    for(int i = 0; i < arr.length; i++){ //O(3n)
      arr[i] = null; //O(n)
    }
  }
  /* base runtime: O(4n) -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
  */  

  public boolean contains(Object data){
    for(i = 0; i < arr.length; i++){  //O(3n)
      if(arr[i] == data){  //O(n)
        return true;  //O(1)
      }
    }
    return false;  //O(1)
  }
  /* base runtime: O(4n + 2) -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
    */  

  public Object get(int position){
    int k = 0; //O(1)
    for(i = 0; i < position; i++){ //O(3n)
      k++; //O(n)
    }
    return arr[k]; //O(1)
  }
  /* base runtime: O(4n + 2) -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
    */  

  public boolean isEmpty(){
    if(size() == 0){ //O(1)
      return true; //O(1)
    }
    return false; //O(1)
  }
    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

  public int lastIndexOf(Object data){
    int instance = 0; //O(1)
    for(int i = 0; i < arr.length; i++){ //O(3n)
      if(arr[i] == data){ //O(n)
        instance = i; //O(n)
      }
    }
    return instance; //O(1)
  }
   /* base runtime: O(5n + 2) -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */  

  public void remove(int position){
    for(i = 0; i < position-1; i++){ //O(3n)
      arr[i] = arr[i-1]; //O(n)
    }
  }
  /* base runtime: O(4n) -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
    */  

  public int size(){
    int size = 0; //O(1)
    for(i = 0; i < arr.length; i++){ //O(3n)
      size++; //O(n)
    }
    return size; //O(1)
  }
   /* base runtime: O(4n + 2) -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
    */  
  public Object[] toArray(){
    return arr; //O(1)
  }
  /* base runtime: O(1) -> O(1)
Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
*/ 
  public void print(){
    for(int j = 0; j < curPos; j++){ //O(3n)
      System.out.print(arr[j] + " "); //O(n)
    }
  }
    /* base runtime: O(4n) -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
    */  
}
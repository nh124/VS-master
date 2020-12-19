public class maxHeap_TO_BinarySearchTree<T extends Comparable<T>>{
    int i;
    Object heap [] = new Object[50];
    Object [] binaryTree = new Object[heap.length];
    int size = -1; 
    int starting = 0;
    int end = size-1;
  
  /*  
    // public int parent(int child){
    //   return (child-1)/2;
    // }
    // public int getLeftChiledIndex(int parent){
    //     return ((2*parent) + 1);
    // }
    // public int getRightChildIndex(int parent){
    //   return ((2*parent) + 2);
    // }
  
    // void swapUp(int currPos){ 
    //   while(currPos > 0 && (int)heap[parent(currPos)] < (int)heap[currPos]){
    //     swapTo(parent(currPos), currPos);
    //     currPos = parent(currPos);
    //   }   
    // }
  
    // void swapDown(int currPos){
    //   // left side
    //   int max = currPos; // top position
    //   int leftChild = getLeftChiledIndex(currPos);
  
    //   if(leftChild <= size && (int)heap[leftChild] > (int)heap[max]){
    //     max = leftChild;
    //   }
    //   // right side
    //   int rightChild = getRightChildIndex(currPos);
    //   if(rightChild <= size && (int)heap[rightChild] > (int)heap[max]){
    //     max = rightChild;
    //   }
    //   if(currPos != max){
    //     swapTo(currPos, max);
    //     swapDown(max);
    //   }
    // }
  
    //   void add(Object data){
    //     size++;
    //     heap[size] = data;
    //     swapUp(size);
    //   }
    //   public Object getMax(){
    //     int max = (int)heap[0]; // at the top
    //     heap[0] = heap[size];
    //     size--; 
    //     swapDown(0);
    //     return max;
    //   }
    //   void remove(int currPos){
    //     heap[currPos] = (int)heap[0] + 1;
    //     swapUp(currPos);
    //     getMax();
    //   }
    //    void swapTo(int first, int second){
    //     Object temp = heap[first];
    //     heap[first] = heap[second];
    //     heap[second] = temp;
    //   }
    //   void print(){
    //     for(i = 0; i < size+1; i++){
    //       System.out.print(heap[i] + " ");
    //     }
    //     System.out.println();
    //   }
  */ 
    public int parent(int child){ //O(1)
      return (child-1)/2;  //O(1)
    }
    public int getLeftChiledIndex(int parent){ //O(1)
        return ((2*parent) + 1); //O(1)
    }
    public int getRightChildIndex(int parent){ //O(1)
      return ((2*parent) + 2); //O(1)
    }
    // For parent getLeftChildIndex and rightChildIndex
    /* base runtime: O(2) -> O(1)
      Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
        Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
        Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */ 
  
    void swapUp(int currPos){ 
      while(currPos > 0 && (int)heap[parent(currPos)] < (int)heap[currPos]){  //O(n)
        swapTo(parent(currPos), currPos); //O(n)
        currPos = parent(currPos); //O(n)
      }   
    }
    /* base runtime: O(3n) -> O(n)
           Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
        Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
        Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
          */  
  
    void swapDown(int currPos){
      // left side
      int max = currPos; // top position //O(1)
      int leftChild = getLeftChiledIndex(currPos); //O(1)
  
      if(leftChild <= size && (int)heap[leftChild] > (int)heap[max]){ //O(1)
        max = leftChild; //O(1)
      }
      // right side
      int rightChild = getRightChildIndex(currPos); //O(1)
      if(rightChild <= size && (int)heap[rightChild] > (int)heap[max]){ //O(1)
        max = rightChild; //O(1)
      }
      if(currPos != max){ //O(1)
        swapTo(currPos, max); //O(1)
        swapDown(max); //O(1)
      } 
    }
      /*
       * O(7) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
       * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
       * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
       * can say that the average or Big theta is the base runtime: O(1).
       */
  
      void add(Object data){
        size++; //O(1)
        heap[size] = data; //O(1)
        swapUp(size); //O(1)
      }
      /*
       * O(3) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
       * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
       * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
       * can say that the average or Big theta is the base runtime: O(1).
       */
      public Object getMax(){
        int max = (int)heap[0]; // at the top // O(1)
        heap[0] = heap[size]; //O(1)
        size--;  //O(1)
        swapDown(0); //O(1)
        return max; //O(1)
      }
      /*
       * O(5) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
       * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
       * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
       * can say that the average or Big theta is the base runtime: O(1).
       */
      void remove(int currPos){
        heap[currPos] = (int)heap[0] + 1;  //O(1)
        swapUp(currPos); //O(1)
        getMax(); //O(1)
      }
      /*
       * O(3) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
       * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
       * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
       * can say that the average or Big theta is the base runtime: O(1).
       */
       void swapTo(int first, int second){
        Object temp = heap[first]; //O(1)
        heap[first] = heap[second]; //O(1)
        heap[second] = temp; //O(1)
      }
      /*
       * O(3) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
       * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
       * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
       * can say that the average or Big theta is the base runtime: O(1).
       */
      void print(){
        for(i = 0; i < size; i++){  //O(3n)
          System.out.println(heap[i] + " "); //O(n)
        }
        System.out.println(); //O(1)
      }
      /*
       * O(4n + 1)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
       * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
       * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
       * then we can say that the average or Big theta is the base runtime: O(n).
       */
      Object top(){ //O(1)
        return heap[0]; //O(1)
      }
  
      int length(){ //O(1)
        return heap.length; //O(1)
      }  
    //---Conversion-------------------------------------------------------------------
    void rverese(Object arr[], int starting, int end)
    {
      while (starting < end) //O(n)
      {
          int temp = (int)arr[starting];  //O(n)
          arr[starting] = arr[end]; //O(n)
          arr[end] = temp; //O(n)
          starting++; //O(n)
          end--; //O(n)
      } 
    }
     /* base runtime: O(5n) -> O(n)
           Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
        Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
        Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
          */
    public void conversion(){
      int i = 0; //O(1)
      while(i < 8){ //O(n)
        binaryTree[i] = top(); //O(n)
        remove(0); //O(n)
        i++; //O(n)
      }
      rverese(binaryTree,starting,end);
    }
     /*
       * O(4n + 1)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
       * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
       * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
       * then we can say that the average or Big theta is the base runtime: O(n).
       */
    public void binaryPrint(){
      for(i = 0; i < 8; i++){ //O(3n)
          System.out.print(binaryTree[i] + " "); //O(n)
        }
        System.out.println(); //O(1)
    }
    /*
       * O(4n + 1)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
       * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
       * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
       * then we can say that the average or Big theta is the base runtime: O(n).
       */
  }
   
  
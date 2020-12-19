#include <iostream>
//Question 1
template<typename T> struct Node{
  T data;
  Node* next;
  Node(T data){
    this -> data = data;
    next = NULL;
  }
};
/*
This is a linear data structure program using linked lists
The data structure has not cap in sime and it can 
hold all primitive data types and abstract types
*/

template<typename T> class linkedList{
  Node<T>* head;
  Node<T>* tail;

  public:
    int length(){ // returns the size of the list 
      int size = 0; //O(1)
      if(this->head == NULL){ //O(1)
        return size; //O(1)
      }
      Node<T>* newNode = this->head; //O(1)
      while(newNode != NULL){ //O(n)
        newNode = newNode->next; //O(n)
        size++; //O(2n)
      }
      return size; //O(1)
    }

     /* base runtime: O(4n + 5) -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we
       can say that the average or Big theta is the base runtime: O(n).
        */  

    bool isEmpty(){ // return if the list is empty
      if(length() == 0){  //O(1)
        return true; //O(1)
      }
      return false; //O(1)
    }
    /* base runtime: O(3) -> O(1)
      Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say t
      hat the average or Big theta is the base runtime: O(1).
    */ 

    void append(T data){ // adds data at the very end of the list.
    //The data range from any primitive type to 
    //abstract. Changes can be made in made function to sute the desired type of data.
      Node<T>* newNode = new Node<T>(data);  //O(1)
      newNode->data = data;  //O(1)
      newNode->next = NULL;   //O(1)
      if(this->head == NULL){  //O(1)
        this->head = newNode;  //O(1)
        this->tail = newNode;  //O(1)
      }else{
        tail->next = newNode;  //O(1)
        this->tail = tail->next;   //O(1)
      } 
    }
    /* base runtime: O(8) -> O(1)
        Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */  

    void clear(){ // clears all the data but nullifiing the head
      head = NULL; //O(1)
    }
    /* base runtime: O(1) 
      Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */ 

    int count(T data){ // counts how many of entered data is in the list
      Node<T>* node = this->head;  //O(1) 
      int counter;  //O(1) 
      while(node != NULL){ //O(n) 
        node = node->next; //O(n) 
        if(node->data == data){ //O(n) 
          counter++; //O(n) 
        }
      }
      return counter; //O(1) 
    }
    /* base runtime: O(4n + 3) -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */ 

    T get(int position){ // get the vale stored in the deired position
      Node<T>* node = this->head; //O(1) 
      for(int i = 0; i < position-1; i++){ //O(n) 
        node = node->next; //O(n) 
      }
      return node->data; //O(1) 
    }
    /* base runtime: O(2n + 2) -> O(n)
        Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */

    void insert(T data, int position){ // allows the user to enter data at desired index. 
      Node<T>* node = new Node<T>(data); //O(1) 
      node->data = data; //O(1) 
      node->next = NULL; //O(1) 
      if(this->head == NULL){ //O(1) 
        head = node; //O(1) 
      }
      if(position == 0){ //O(1) 
        node->next = this->head; //O(1) 
        head = node; //O(1) 
      }
      Node<T>* newNode = this->head; //O(1) 
      for(int i = 0; i < position-2; i++){ //O(3n) 
        newNode = newNode->next; //O(n) 
      }
      node->next = newNode->next; //O(1) 
      newNode->next = node; //O(1) 
    }
     /* base runtime: O(4n + 11) -> O(n)
        Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */
    void remove(){ // removes the first element of the linked list
      Node<T>* node = this->head; //O(1) 
      if(node == NULL){ //O(1) 
        return; //O(1) 
      }
      head = head->next; //O(1) 
      node = NULL;  //O(1) 
    }
    /* base runtime: O(5) -> O(1)
        Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */

    void reverse(){ // reverses the linked list
      Node<T>* pre = NULL; //O(1)
      Node<T>* curr = head; //O(1)
      Node<T>* next = NULL; //O(1)

      while(curr != NULL){ //O(n)
        next = curr->next; //O(n)
        curr->next = pre; //O(n)
        pre = curr; //O(n)
        curr = next; //O(n)
      }
      head = pre; //O(1)
    }
    /* base runtime: O(5n + 4) -> O(n)
         Big O: O(n) -> tight upper bound: O(6n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */  

    void print(){ // print
      Node<T>* curr = this->head; //O(1)
      while(curr != NULL){ //O(n)
        std::cout << curr->data << " -> ";  //O(n)
        curr = curr->next; //O(n)
      }
    }
    /* base runtime: O(3n + 1) -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */

};

int main() {
  linkedList<int> *list = new linkedList<int>();
  
  list->append(1);
  list->append(2);
  list->append(3);
  list->append(4);
  list->append(5);
  list->append(6);


  list->print();
  std::cout << "\n";
  list->reverse();
  std::cout << "\n";
  list->print();

  std::cout << "\n";
  //std::cout << list->get(4) << "\n" ;
  
  //std::cout << "Hello World!\n";
}
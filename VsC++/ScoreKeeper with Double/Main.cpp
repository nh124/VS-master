#include <iostream>

struct Node{
    int data;
    struct Node *next;
    struct Node *pre;

};

class DoubleLinkedList{
    Node* head; //O(1)
    Node* tail;//O(1)

    public:
        DoubleLinkedList(){
            head = NULL;//O(1)
            tail = NULL;//O(1)
    }
    /* base runtime: O(2) -> O(1)
Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
*/ 
    
    void add(int data){
        struct Node *newNode = new Node; //O(1)
        newNode->data = data;//O(1)
        newNode->next = NULL;//O(1)
        newNode->pre = NULL;//O(1)

        if(head == NULL){
            head = newNode;//O(1)
            return;//O(1)
        }else{
            head->pre = newNode;//O(1)
            newNode->next = head;//O(1)
            head = newNode;//O(1)
        }
    }
    /* base runtime: O(11) -> O(1)
        Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
        */ 

    void remove(int data){
         Node *node = head; //O(1)
            if(this->head == NULL){//O(1)
                return;//O(1)
            }
            if(data == 0){//O(1)
                node = node->next;//O(1)
            }
            for(int i = 0; i < data-2 && node != NULL; i++){
            //O(1)        //O(n -2)                    O(2n)
                node = node->next; //O(n)
            }
            node->next = node->next->next;//O(1)
            node->next->pre = node;//O(1)
    }
    /* base runtime: O(n + 10) -> O(n)
        Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */
   /*/Algorithm 2/////////////////////////////////////////////////////////////////////////////
        //  int pos = 0;
        //  struct Node *pre_node;
        //  struct Node *current;
        //  struct Node *last;
            
        //  if(head==NULL) {
        //     printf("Linked List not initialized");
        //     return;
        //  } 
            
        //  if(head->data == data) {
        //     if(head->next != NULL) {
        //        head->next->pre = NULL;
        //        head = head->next;
        //        return;
        //     } else {
        //        head = NULL;
        //        printf("List is empty now");
        //        return;
        //     }
        //  } else if(head->data != data && head->next == NULL) {
        //     printf("%d not found in the list\n", data);
        //     return;
        //  }

        //  current = head;
        
        //  while(current->next != NULL && current->data != data) {
        //     pre_node = current;
        //     current = current->next;
        //  }        

        //  if(current->data == data) {
        //     pre_node->next = pre_node->next->next;
                    
        //     if(pre_node->next != NULL) {          // link back
        //        pre_node->next->pre = pre_node;
        //     } else
        //        last = pre_node;

        //     free(current);
        //  } else
        //     printf("%d not found in the list.", data);

        //   }
        //   void removeFristElement(){
        //       Node *newNode = this->head; // create a pointer for head
        //       head = head->next; // set the next node of the head to as the new head.
        //       newNode->next = NULL; // removing the link between preveos node next
        //       head->pre = NULL; // remove the link between the new head pre and onld nore next.
        //   }
        */
        public:
            void print(){
                Node *newNode = this->head;//O(1)
                while(newNode != NULL){ //O(n)
                    std:: cout << newNode->data << " "; //O(n)
                    newNode = newNode->next; //O(n)
                }
                std::cout << "\n"; //O(1)
            }
    /* base runtime: O(3n + 3) -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */ 

};



int main(){
    DoubleLinkedList *dl = new DoubleLinkedList();
    int choice;
    do{
        std::cout << " GameBoard:" << "\n";
        std::cout << "1. Add score: " << "\n";
        std::cout << "2. delete scores: " << "\n";
        std::cout << "3. Exit: " << "\n";
        std::cin >> choice;
    
        if(choice == 1){
        std:: cout << "How many scores do you have?" << std::endl;
        int numb;
        std::cin >> numb;
        std::cout << "Please enter the scores";
        for(int i = 0; i < numb; i++){
            std::cout << "\n" << std::endl;
            std::cout << "Score " << i + 1 << ": ";
            int score;
            std::cin >> score;
            dl->add(score);
        }
        std::cout << "All the score" << "\n";
        std::cout << "--------------" << std::endl;
        dl->print();
        }else if(choice == 2){
            dl->print();
            std::cout << "from the list above pick the score you want to delet by proving the index: ";
            std::cout << "\n";
            int deleteScore;
            std::cin >> deleteScore;
            dl->remove(deleteScore);
            dl->print();
        }else{
            return -1;
        }
    }while(choice != 3);

    //testing
    // dl->add(3); 
    // dl->add(2); 
    // dl->add(1); 
    // dl->add(6); 
    // dl->add(9); 
    // dl->add(21); 

    // dl->print();

    // dl->remove(2);

    // dl->print();

}
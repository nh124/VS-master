#include <iostream>

/* class Node{
//     int data;
//     Node *next;
// public:
//     Node(int data){
//         this->data = data;
//         next = NULL;
//     }
    
//     public:
//         void setNext(Node *next){
//             this->next = next;
//         }
//     public:
//         Node* getNext(){
//             return this->next;
//         }
//     public:
//         int getData(){
//             return this->data;
//         }        

}; */

struct Node{
    int data; //O(1)
    Node *next;//O(1)
}; 
/* base runtime: O(2) -> O(1)
Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
*/ 

class linkedList{
    Node* head; //O(1)
    Node* tail; //O(1)

    public:
        linkedList(){
            head = NULL;//O(1)
            tail = NULL; //O(1)
        }
        void add(int data){
            Node *newNode = new Node(); //O(1)
            newNode->data = data; //O(1)
            newNode->next = NULL; //O(1)


            if(this->head == NULL){
                this->head = newNode; //O(1)
                this->tail = newNode; //O(1)
            }else{
                tail->next = newNode; //O(1)
                this->tail = tail->next; //O(1)
            }
        }
        /* base runtime: O(11) -> O(1)
        Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
        */   
    public: 
        void remove(int position){ // given index
        
        Node *newNode = head;
            if(this->head == NULL){ //O(1)
                return; //O(1)
            }
            if(position = 0){ //O(1)
                newNode = newNode->next; //O(1) 
            }
            for(int i = 0; i < position-1 && newNode != NULL; i++){ 
                //O(1)        //O(n-1)                          O(2n)
                newNode = newNode->next; //O(1)
                if(newNode == NULL || newNode->next == NULL){ //O(1)
                    return; //O(1)
                }
            }
            Node *next = newNode->next->next; //O(1)
            newNode->next = next; //O(1)
        /* base runtime: O(2n + 10) -> O(n)
        Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */
        /*/////Remove in another way/////////////////////////////////////////////
        //     struct Node* newNode = head;
        //     if(position == 1){
        //         head = newNode->next;
        //         newNode = NULL;
        //         return;
        //     } // 1 2 3 4 5 6 7 8 9 -> 4
        //     for(int i = 0; i < position-2; i++){
        //         newNode = newNode->next;
        //     }
        //     struct Node* temp2 = newNode->next;
        //     newNode->next = temp2->next;
        //     temp2 = NULL;
        */
        }

    public:
        void print(){ //O(1)
            Node* currNode = this->head; //O(1)
            while(currNode != NULL){ //O(n)
                std::cout << currNode->data << " "; //O(n)
                currNode = currNode->next; //O(n)
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
    linkedList *ll = new linkedList();
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
            ll->add(score);
        }
        std::cout << "All the score" << "\n";
        std::cout << "--------------" << std::endl;
        ll->print();
        }else{
            ll->print();
            std::cout << "from the list above pick the you want to delet by p1roviding its index: ";
            std::cout << "\n";
            int deleteScore;
            std::cin >> deleteScore;
            ll->remove(deleteScore);
            ll->print();
        }
    }while(choice != 3);

    //testing
    // ll->add(3); 
    // ll->add(2); 
    // ll->add(1); 
    // ll->add(6); 
    // ll->add(9); 
    // ll->add(21); 

    // ll->print();

    // ll->remove(2);

    // ll->print();

}


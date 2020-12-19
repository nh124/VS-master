#include <iostream>
/*
problem:

 Print
 Add - Adds element to the end of the linked list.
 IsEmpty
 Push - Adds element to the beginning of the linked list
 InsertAt - Inserts an element at a given position
 Clear - Removes all elements from the linked list
 Contains - Returns true if element is in the linked list
 Get - Returns a value at a specic position
 IndexOf - Returns the first position where an element occurs, -1 if
not
 LastOf - Returns the last position where an element occurs, -1 if not
 Remove - Removes the last item added to the list
 RemoveAt - Removes an element at a specic position
 RemoveElement - Removes the first occurrence of a specfic element
 Size
 Slice - Returns a subset of this linked list given a beginning position
start and end position stop.
*/

struct Node
{
    Node *next;
    Node *pre;
    int data;
};
template <typename T>
class LinkedList
{
    Node *head;
    Node *tail;

public:
    void put(T data) // O(1)
    {
        Node *node = new Node(); // O(1)
        node->data = data;       // O(1)
        node->next = NULL;       // O(1)
        if (this->head == NULL)  // O(1)
        {
            this->head = node; // O(1)
            this->tail = node; // O(1)
        }
        else // O(1)
        {
            tail->next = node;       // O(1)
            this->tail = tail->next; // O(1)
        }
    }
    /* O(10) -> O(1)
        ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */

    void deleteFirst()
    {
        if (this->head == NULL) // O(1)
        {
            return; // O(1)
        }
        else
        {
            Node *newNode = this->head; // O(1)
            this->head = head->next;    // O(1)
            //this->head = NULL;
            newNode = NULL; // O(1)
        }
    }
    /* O(5) -> O(1)
        ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */
    void deleteLast()
    {
        Node *newNode = this->head; // O(1)

        if (this->head == NULL) // O(1)
        {
            return; // O(1)
        }
        // if (head->next != NULL)
        // {
        //     return head;
        // }
        else // O(1)
        {
            while (newNode->next->next != NULL) // O(n)
            {
                newNode = newNode->next; // O(n)
            }
            newNode->next = NULL; // O(1)
        }
        /* O(2n + 4)-> O(n)
        Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */
    }
    void deleteGivenPosition(T position)
    {
        Node *newNode = this->head; // O(1)
        if (this->head == NULL)     // O(1)
        {
            return; // O(1)
        }
        if (position == 0) // O(1)
        {
            newNode = newNode->next; // O(1)
        }
        for (int i = 0; i < position - 2 && newNode->next != NULL; i++) // O(3n-1)
        {
            newNode = newNode->next;                      // O(n-2)
            if (newNode == NULL || newNode->next == NULL) // O(n-2)
            {
                return; // O(1)
            }
        }
        Node *newNode2 = newNode->next->next; // O(1)
        newNode->next = newNode2;             // O(1)
    }
    /* O(6n + 3) -> O(n)
    Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
  Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
  Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
    */

public:
    void push(T dataB)
    {
        Node *newNode = new Node(); // O(1)
        newNode->data = dataB;      // O(1)
        newNode->next = this->head; // O(1)
        this->head = newNode;       // O(1)
    }                               /* O(4) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
          Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
          Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */
    void Add(T data)
    {
        Node *node = new Node(); // O(1)
        Node *nodeIt = head;     // O(1)
        node->data = data;       // O(1)
        node->next = NULL;       // O(1)

        if (this->head == NULL) // O(1)
        {
            head = node; // O(1)
            return;      // O(1)
        }
        while (nodeIt->next != NULL) // O(n) n: size of list
        {
            nodeIt = nodeIt->next; // O(n)
        }
        nodeIt->next = node; // O(1)
    }                        /* O(2n + 8) -> O(n)
    Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
  Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
  Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
    */
    void InsertAt(int position, T data)
    {
        Node *node = new Node(); // O(1)
        node->data = data;       // O(1)
        node->next = NULL;       // O(1)

        if (this->head == NULL) // O(1)
        {
            head = node; // O(1)
        }
        if (position == 0) // O(1)
        {
            node->next = this->head; // O(1)
            head = node;             // O(1)
        }
        Node *nodeIt = this->head;             // O(1)
        for (int i = 0; i < position - 2; i++) // O(3n -1)
        {
            nodeIt = nodeIt->next; // O(n)
        }
        node->next = nodeIt->next; // O(1)
        nodeIt->next = node;       // O(1)
    }                              /* O(4n + 10) -> O(n)
        Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */

public:
    T isEmpty()
    {
        Node *node = new Node(); // O(1)
        if (head == NULL)        // O(1)
        {
            return true; // O(1)
        }
        return false; // O(1)
        /* O(4) -> O(1)
    Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
    Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
    Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).*/
    }
    void clear()
    {
        Node *node = this->head; // O(1)
        Node *next;              // O(1)
        if (this->head == NULL)  // O(1)
        {
            std::cout << "The list is already empty."; // O(1)
            return;                                    // O(1)
        }
        else
        {
            while (node != NULL) // O(n) n: size of list
            {
                next = node->next; // O(n)
                node = NULL;       // O(n)
                node = next;       // O(n)
            }
            this->head = NULL; // O(1)
        }
    } /* O(4n + 5)-> O(n)
    Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
 Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
 Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
   */

    int size()
    {
        int size;                  // O(1)
        Node *node = this->head;   // O(1)
        while (node->next != NULL) // O(n)
        {
            size++;            // O(n)
            node = node->next; // O(n)
        }
        return size + 1; // O(1)
    }                    /* O(3n + 3)-> O(n)
        Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */

public:
    T contains(T element)
    {
        Node *node = this->head; // O(1)

        if (node == NULL) // O(1)
        {
            return false; // O(1)
        }
        if (element - 1 == 0) // O(1)
        {
            if (node->data == element) // O(1)
            {
                return true; // O(1)
            }
            else // O(1)
            {
                return false; // O(1)
            }
        }
        else // O(1)
        {
            for (int i = 0; i < size(); i++) // O(3n + 1) n: size of list
            {
                if (node->data == element) // O(n)
                {
                    return true; // O(1)
                }
                return false; // O(1)
            }
        }
        return false; // O(1)
    }                 /* O(4n + 13) -> O(n)
    Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
    */
    T get(T position)
    {
        Node *node = this->head; // O(1)
        if (node == NULL)        // O(1)
        {
            return -1; // O(1)
        }
        if (position - 1 == 0) // O(1)
        {
            return node->data; // O(1)
        }
        for (int i = 0; i < position - 1 && node->next != NULL; i++) // O(3n)
        {
            node = node->next; // O(n)
        }
        return node->data; // O(1)
    }
    /* O(5n + 6) -> O(n)
    Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
  Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
  Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
    */

public:
    T indexOf(T element)
    {
        Node *node = this->head; // O(1)
        int iterator;            // O(1)
        while (node != NULL)     // O(n) n: size of the array
        {
            if (node->data == element) // O(n)
            {
                return iterator += 1; // O(1)
            }
            node = node->next; // O(n)
            iterator++;        // O(1)
        }

        return -1; // O(1)
    }
    /* O(2n + 6) -> O(n)
    Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
  Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
  Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
    */
    T lastOf(T element)
    {
        Node *node = this->head; // O(1)
        int iterator;            // O(1)
        int lastPosition;        // O(1)
        if (head == NULL)        // O(1)
        {
            return -1; // O(1)
        }
        else if (node != NULL) // O(1)
        {
            while (node != NULL) // O(n) n: size of the list
            {
                if (node->data == element) // O(n)
                {
                    lastPosition = iterator + 1; // O(n)
                }
                node = node->next; // O(n)
                iterator++;        // O(n)
            }
            return lastPosition; // O(1)
        }
        else // O(1)
        {
            return -1; // O(1)
        }
    }
    /* O(5n + 9)-> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */
    void slice(int firstPosition, int lastPosition)
    {
        Node *headNode;
        Node *tailNode;
        Node *curr = this->head;

        while (curr != NULL)
        {
            if (curr->data == firstPosition)
            {
                headNode = curr;
            }
            curr = curr->next;
        }
        while (curr != NULL)
        {
            if (curr->data == lastPosition)
            {
                tailNode = curr;
            }
            curr = curr->next;
        }
        headNode = head;
        tailNode = tail;
        tail->next = NULL;
    }

public:
    void print()
    {
        Node *curr = this->head; // O(1)
        while (curr != NULL)     // O(n) n:size of the array
        {
            std::cout << curr->data << " "; // O(n)
            curr = curr->next;              // O(n)
        }
        std::cout << "\n"; // O(1)
    }                      /* O(3n + 2) -> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
 Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
 Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
*/
};
/*--------------Double Lined List------------------------------------------------------------------------*/
template <typename T>
class DoubleLinkedList
{
    Node *head;
    Node *tail;

public:
    void put(T data) // O(1)
    {
        struct Node *newNode = new Node; //O(1)
        newNode->data = data;            //O(1)
        newNode->next = NULL;            //O(1)
        newNode->pre = NULL;             //O(1)

        if (head == NULL)
        {
            head = newNode; //O(1)
            return;         //O(1)
        }
        else
        {
            head->pre = newNode;  //O(1)
            newNode->next = head; //O(1)
            head = newNode;       //O(1)
        }
    }
    /* base runtime: O(11) -> O(1)
        Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
        */

    void deleteFirst()
    {
        if (this->head == NULL) // O(1)
        {
            return; // O(1)
        }
        Node *newNode = this->head; // O(1)  // create a pointer for head
        head = head->next;          // O(1)          // set the next node of the head to as the new head.
        newNode->next = NULL;       // O(1)     // removing the link between preveos node next
        head->pre = NULL;           // O(1)           // remove the link between the new head pre and onld nore next.
    }                               // O(6)
    void deleteLast()               // work on
    {

        if (this->head == NULL) // O(1)
        {
            return; // O(1)
        }

        Node *newNode = this->tail; // O(1)
        tail = tail->pre;           // O(1)
        newNode->pre = NULL;        // O(1)
        tail->next = NULL;          // O(1)
    }                               // O(6)
    void deleteGivenPosition(int position)
    {
        Node *newNode = head;   // O(1)
        if (this->head == NULL) // O(1)
        {
            return; // O(1)
        }
        if (position == 0) // O(1)
        {
            newNode = newNode->next; // O(1)
        }
        for (int i = 0; i < position - 2 && newNode->next != NULL; i++) // O(n-2)
        //O(1)        //O(n -2)                    O(2n)
        {
            newNode = newNode->next; // O(n-2)
        }
        newNode->next = newNode->next->next; // O(1)
        newNode->next->pre = newNode;        // O(1)
        /* base runtime: O(n + 10) -> O(n)
        Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */

        /*--------------------------------------------------------------------------------*/
        // Node *node = head; //O(1)
        // if (this->head == NULL)
        // {           //O(1)
        //     return; //O(1)
        // }
        // if (data == 0)
        // {                      //O(1)
        //     node = node->next; //O(1)
        // }
        // for (int i = 0; i < data - 2 && node != NULL; i++)
        // {
        //     //O(1)        //O(n -2)                    O(2n)
        //     node = node->next; //O(n)
        // }
        // node->next = node->next->next; //O(1)
        // node->next->pre = node;        //O(1)
    }
    int size()
    {
        int size;                  // O(1)
        Node *node = this->head;   // O(1)
        while (node->next != NULL) // O(n)
        {
            size++;            // O(n)
            node = node->next; // O(n)
        }
        return size + 1; // O(1)
    }
    /* O(3n + 3)-> O(n)
        Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */

public:
    void push(T data)
    {
        Node *newNode = new Node(); // O(1)
        newNode->data = data;       // O(1)
        newNode->next = head;       // O(1)
        newNode->pre = NULL;        // O(1)

        if (head != NULL) // O(1)
        {
            head->pre = newNode; // O(1)
        }
        head = newNode; // O(1)
    }
    /* O(7) -> O(1)
        Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
        */
    void Add(T data)
    {
        Node *node = new Node(); // O(1)
        Node *curr = this->head; // O(1)
        node->data = data;       // O(1)

        node->next = NULL; // O(1)

        if (head == NULL) // O(1)
        {
            node->pre = NULL; // O(1)
            head = node;      // O(1)
            return;           // O(1)
        }
        while (curr->next != NULL) // O(n)
        {
            curr = curr->next; // O(n)
        }
        curr->next = node; // O(1)
        node->pre = curr;  // O(1)
    }
    /* O(2n+ 10) -> O(n)
    Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
    Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
    Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
    */
    void InsertAt(int position, T data)
    {
        Node *node = new Node(); // O(1)
        Node *curr = head;       // O(1)

        for (int i = 0; i < position - 2; i++) // O(3n-3 )
        {
            curr = curr->next; // O(n)
        }
        node->next = curr->next; // O(1)
        curr->next->pre = node;  // O(1)
        curr->next = node;       // O(1)
        node->pre = curr;        // O(1)
    }
    /* O(4n + 3)-> O(n)
    Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
 Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
 Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
   */

public:
    bool isEmpty()
    {
        Node *node = new Node(); // O(1)
        if (head == NULL)        // O(1)
        {
            return true; // O(1)
        }
        return false; // O(1)
        /* O(4) -> O(1)
    Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
    Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
    Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
*/
    }
    void clear()
    {
        Node *node = new Node(); // O(1)
        Node *curr = this->tail; // O(1)

        if (this->head == NULL) // O(1)
        {
            std::cout << "The list is already empty. "
                      << "\n"; // O(1)
        }
        while (curr != NULL) // O(n) -> n: size of the list
        {
            node = curr->pre; // O(n)
            curr = NULL;      // O(n)
            node = curr;      // O(n)
        }
        this->head = NULL; // O(1)
    }
    /* O(4n + 5)-> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */

public:
    T contains(T element)
    {
        Node *node = this->head; // O(1)

        while (node != NULL) // O(n) n: the size of the list
        {
            if (node->data == element) // O(n)
            {
                return true; // O(1)
            }
            node = node->next; // O(n)
        }
        return false; // O(1)
    }
    /* O(3n + 3)  -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
    */
    T get(int position)
    {
        Node *node = this->head;               // O(1)
        for (int i = 0; i < position - 1; i++) // O(3n)
        {
            node = node->next; // O(n)
        }
        return node->data; // O(1)
    }
    /* O(5n + 2) -> O(n)
    Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
  Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
  Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
    */

public:
    int indexOf(T element)
    {
        Node *node = this->head; // O(1)
        int iterator;            // O(1)
        while (node != NULL)     // O(n) n: size of the array
        {
            if (node->data == element) // O(n)
            {
                return iterator += 1; // O(1)
            }
            node = node->next; // O(n)
        }
        iterator++; // O(1)

        return -1; // O(1)
    }
    /* O(2n + 6)-> O(n)
    Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
 Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
 Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
   */
    int lastOf(T element)
    {
        Node *node = this->head; // O(1)
        int iterator;            // O(1)
        int lastPosition;        // O(1)
        if (head == NULL)        // O(1)
        {
            return -1; // O(1)
        }
        else if (node != NULL) // O(1)
        {
            while (node != NULL) // O(n) n: size of the list
            {
                if (node->data == element) // O(n)
                {
                    lastPosition = iterator + 1; // O(n)
                }
                node = node->next; // O(n)
                iterator++;        // O(n)
            }
            return lastPosition; // O(1)
        }
        else // O(1)
        {
            return -1; // O(1)
        }
    }
    /* O(5n + 9)-> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */
    void slice(int firstPosition, int lastPosition)
    {
        Node *headNodeIt = head; // O(1)
        Node *tailNodeIt = tail; // O(1)
        Node *curr = this->head; // O(1)
        /* int i = 1;
        // while (curr != null && i <= lastPosition) {
        // if (i == firstPosition) {
        // headNodeIt = curr;
        // }

        // if (i == lastPosition) {
        // tailNodeIt = curr;
        // tailNodeIt.next = null;
        // }
        // curr = curr.next;
        // i++;
        // }
        ////////////////////////////////////////////////////////
        */

        while (curr != NULL)
        { // O(n) n: size of the list
            if (curr->data == firstPosition)
            {                      // O(n)
                headNodeIt = curr; // O(n)
                // break;
            }
            curr = curr->next; // O(n)
        }

        while (curr != NULL)
        { // O(n)
            if (curr->data == lastPosition)
            {                      // O(n)
                tailNodeIt = curr; // O(n)
                // break;
            }
            curr = curr->next; // O(n)
        }
        tail->next = NULL; // O(n)
    }                      /* O(9n + 3)-> O(n)(drop constants)
           Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
           Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
           Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n). 
             */

public:
    void print()
    {
        Node *curr = this->head; // O(1)
        while (curr != NULL)     // O(n) n:size of the array
        {
            std::cout << curr->data << " "; // O(n)
            curr = curr->next;              // O(n)
        }
        std::cout << "\n"; // O(1)
    }
    /* O(3n + 2) -> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
 Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
 Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
*/
};

int main()
{
    // Testing
    DoubleLinkedList<int> *dl = new DoubleLinkedList<int>();
    LinkedList<int> *ll = new LinkedList<int>();
    ll->put(1);
    ll->put(1);
    ll->put(0);
    ll->put(9);
    ll->put(12);
    ll->put(13);

    ll->print();
    std::cout << ll->indexOf(13) << "\n";
    //std::cout << dl->indexOf(1) << "\n";
    // dl->print();
}
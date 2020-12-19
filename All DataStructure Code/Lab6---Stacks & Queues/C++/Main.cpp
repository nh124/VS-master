#include <iostream>
using namespace std;

template <typename T>
struct Node
{
    Node *next; // O(1)
    T data;     // O(1)
};
/* base runtime: O(2) -> O(1)
Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
*/

template <typename T>
class LinkedList
{
    Node<T> *head; //O(1)
    Node<T> *tail; //O(1)

public:
    void add(T data)
    {
        Node<T> *newNode = new Node<T>(); //O(1)
        newNode->data = data;             //O(1)
        newNode->next = NULL;             //O(1)
        if (this->head == NULL)           //O(1)
        {
            this->head = newNode; //O(1)
            this->tail = newNode; //O(1)
        }
        else
        {
            tail->next = newNode;    //O(1)
            this->tail = tail->next; //O(1)
        }
    }

    /* base runtime: O(10) -> O(1)
    Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
        */

public:
    void removeFirst()
    {
        if (this->head == NULL) // O(1)
        {
            return; // O(1)
        }

        Node<T> *newNode = this->head; // O(1)
        head = head->next;             // O(1)
        newNode = NULL;                // O(1)
    }
    /* O(5) -> O(1)
        ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */

public:
    void removeLast()
    {
        if (this->head == NULL) // O(1)
        {
            return; // O(1)
        }
        Node<T> *curr = this->head;      // O(1)
        while (curr->next->next != NULL) // O(n)
        {
            curr = curr->next; // O(n)
        }
        curr->next = NULL; // O(1)
    }
    /* O(2n + 4)-> O(n)
        Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */

public:
    T returnLast()
    {
        Node<T> *curr = this->head; // O(1)
        while (curr != NULL)        // O(n)
        {
            curr = curr->next; // O(n)
        }
        return curr->data; // O(1)
    }
    /* O(2n + 2)-> O(n)
        Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */

public:
    int size()
    {
        Node<T> *curr = this->head; // O(1)
        int size;                   // O(1)
        while (curr != NULL)        // O(n)
        {
            curr = curr->next; // O(n)
            size++;            // O(n)
        }
        return size; // O(1)
    }
    /* O(3n + 3)-> O(n)
        Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */

public:
    void print()
    {
        Node<T> *curr = this->head; // O(1)
        while (curr != NULL)        // O(n)
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

template <typename T>
class Stack
{
    LinkedList<T> *ll = new LinkedList<T>(); // O(1)
    int max = 10;                            // O(1)
    T arr[10];                               // O(1)
    int start = -1;                          // O(1)

public:
    void push(T data) //
    {
        if (start <= max) // O(1)
        {
            start++;           // O(1)
            arr[start] = data; // O(1)
        }
        else // O(1)
        {
            ll->add(data); // O(1)
        }
    }
    /* O(8) -> O(1)
        ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */

    void pop()
    {
        if (start == -1) // O(1)
        {
            return; // O(1)
        }
        if (start <= max) // O(1)
        {
            start--; // O(1)
        }
        else // O(1)
        {
            if (ll->size() == 1) // O(1)
            {
                ll->removeFirst(); // O(1)
            }
            else // O(1)
            {
                ll->removeLast(); // O(1)
            }
        }
    }
    /* O(9) -> O(1)
        ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */

    T peek()
    {
        if (start == -1) // O(1)
        {
            std::cout << "Empty" // O(1)
                      << "\n";   // O(1)
        }
        if (start > max) // O(1)
        {
            ll->returnLast(); // O(1)
        }
        return arr[start]; // O(1)
    }
    /* O(6) -> O(1)
        ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */

    bool isEmpty()
    {
        if (start == -1) // O(1)
        {
            return true; // O(1)
        }
        return false; // O(1)
    }
    /* base runtime: O(3) -> O(1)
Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
*/

    int size()
    {
        if (start < max) //O(1)
        {
            return start + 1; //O(1)
        }
        else //O(1)
        {
            return start + ll->size(); //O(1)
        }
    }
    /* O(5) -> O(1)
        ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */

    void print()
    {
        if (start == -1) //O(1)
        {
            std::cout << "the stack is empty" //O(1)
                      << "\n";                //O(1)
        }
        if (start <= max) //O(1)
        {
            for (int i = 0; i <= start; i++) //O(3n)
            {
                std::cout << arr[i] << " "; //O(n)
            }
            std::cout << "\n"; //O(1)
        }
        else if (start > max) //O(1)
        {
            for (int i = 0; i <= max; i++) //O(3n)
            {
                std::cout << arr[i] << " "; //O(n)
            }
            std::cout << "\n"; //O(1)
            ll->print();       //O(1)
            std::cout << "\n"; //O(1)
        }
        else //O(1)
        {
            return; //O(1)
        }
    }
    /* base runtime: O(8n + 11) -> O(n)
         Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
        */
};

template <typename T>
class Queue
{
    int max = 10;                            //O(1)
    int start = 0;                           //O(1)
    int end = -1;                            //O(1)
    T arr[10];                               //O(1)
    LinkedList<T> *ll = new LinkedList<T>(); //O(1)

public:
    void enqueue(T data) //O(1)
    {
        end++;         //O(1)
        if (end < max) //O(1)
        {
            arr[end] = data; //O(1)
        }
        else //O(1)
        {
            ll->add(data); //O(1)
        }
    }
    /* O(6) -> O(1)
        ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */

    void dequeue()
    {
        if (start == end) //O(1)
        {
            return; //O(1)
        }
        start++; //O(1)
    }
    /* base runtime: O(3) -> O(1)
Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
*/

    T peek()
    {
        if (start == end) // O(1)
        {
            std::cout << "Empty" // O(1)
                      << "\n";   // O(1)
        }
        if (end > max) // O(1)
        {
            ll->returnLast(); // O(1)
        }
        return arr[end]; // O(1)
    }
    /* O(6) -> O(1)
        ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */

    bool isEmpty()
    {
        if (start == end) //O(1)
        {
            return true; //O(1)
        }
        return false; //O(1)
    }
    /* base runtime: O(3) -> O(1)
Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
*/
    int size()
    {
        if (end < max) //O(1)
        {
            return end; //O(1)
        }
        return (max) + ll->size(); //O(1)
    }
    /* O(3)
        ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
      Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */

    void print()
    {
        if (end <= max) //O(1)
        {
            for (int i = start; i <= end; i++) //O(3n)
            {
                std::cout << arr[i] << " "; //O(n)
            }
            std::cout << "\n"; //O(1)
        }
        else if (end > max)
        {
            for (int i = start; i < max; i++) //O(3n)
            {
                std::cout << arr[i] << " "; //O(n)
            }
            ll->print();       //O(1)
            std::cout << "\n"; //O(1)
        }
        else
        {
            return;
        }
    }

    /* O(8n + 4) -> O(n)
    Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
  Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
  Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n).
    */
};

int main()
{

    /*-----------------------------------------------------------------------------------------------*/
    Stack<char> stack = Stack<char>();
    std::cout << "Cheracters: "
              << "\n";
    std::cout << "How many cheracters would you like to add: "
              << "\n";
    int push;
    std::cin >> push;
    for (int i = 0; i <= push - 1; i++)
    {
        char data;
        std::cout << "Enter data: "
                  << "\n";
        std::cin >> data;
        stack.push(data);
    }
    stack.print();
    std::cout << "Pop"
              << "\n";
    std::cout << "How many times would you like to pop: "
              << "\n";
    int pop;
    std::cin >> pop;
    for (int i = 0; i < pop; i++)
    {
        stack.pop(); // issue when overflow.
    }
    stack.print();
    std::cout << "Empty: " << stack.isEmpty() << "\n";
    std::cout << "Peek: " << stack.peek() << "\n";
    std::cout << "Size: " << stack.size() << "\n";
    /*-----------------------------------------------------------------------------------------------*/

    /*-----------------------------------------------------------------------------------------------*/
    Queue<double> queue = Queue<double>();
    std::cout << "Double:  "
              << "\n";
    std::cout << "How many doubles would you like to enqueue: "
              << "\n";
    int pushToQueue;
    std::cin >> pushToQueue;

    std::cout << "-------------------Enqueueing----------------------------------"
              << "\n";
    std::cout << "Enqueueing"
              << "\n";

    for (int i = 0; i < pushToQueue; i++)
    {
        std::cout << "Enter data " << i + 1 << ": "
                  << "\n";
        double data;
        std::cin >> data;
        queue.enqueue(data);
    }
    queue.print();
    std::cout << "------------------------------------------------------------------"
              << "\n";
    std::cout << "-----------------Dequeueing-------------------------------------- "
              << "\n";
    std::cout << "Dequeue"
              << "\n";
    std::cout << "How many times would you like to dequeue: "
              << "\n";
    int popFromQueue;
    std::cin >> popFromQueue;
    for (int i = 0; i < popFromQueue; i++)
    {
        queue.dequeue();
    }
    queue.print();
    std::cout << "empty? " << queue.isEmpty() << "\n";
    std::cout << "size: " << queue.size() << "\n";
    std::cout << "peek " << queue.peek() << "\n";

    std::cout << "------------------------------------------------------------------"
              << "\n";

    /*-----------------------------------------------------------------------------------------------*/

    // testing
    // Queue<int> queue = Queue<int>();
    // queue.enqueue(1);
    // queue.enqueue(2);
    // queue.enqueue(3);
    // queue.enqueue(4);
    // queue.enqueue(5);
    // queue.enqueue(6);
    // queue.enqueue(7);
    // queue.enqueue(8);
    // queue.enqueue(9);
    // queue.enqueue(10);
    // queue.enqueue(11);
    // queue.enqueue(12);
    // queue.enqueue(156);

    // std::cout << "size " << queue.size() << "\n";

    //queue.print();

    // return -1;
}
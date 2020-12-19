#include <iostream>
template <typename T>
class StackImp
{
    int start;
    int max = 3;
    QueueImp<T> queue = new Queue<T>();

public:
    void push(T data)
    {
        queue.enqueue(); // O(1)
    }
    /*
     * base runtime: O(4n + 4) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
public:
    void pop()
    {
        queue.dequeue(); // O(1)
    }
    /*
     * base runtime: O(4n + 4) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
public:
    T rear()
    {
        queue.rear(); // O(1)
    }
    /*
     * base runtime: O(4n + 4) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
public:
    T front()
    {
        queue.front(); // O(1)
    }
    /*
     * base runtime: O(4n + 4) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
public:
    int size()
    {
        queue.size(); // O(1)
    }
    /*
     * base runtime: O(4n + 4) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
public:
    bool isEmpty()
    {
        queue.isEmpty(); // O(1)
    }
    /*
     * base runtime: O(4n + 4) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
public:
    T *Copy()
    {
        queue.copy(); //O(1)
    }
    /*
     * base runtime: O(4n + 4) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
public:
    void print()
    {
        queue.print() : //O(1)
    }
    /*
     * base runtime: O(4n + 4) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
};

template <typename T>
class QueueImp
{
    int end = -1;
    int start = 0;
    int max = 3;
    T arr[10];
    // StackImp<T> stack = new StackImp<T>();

public:
    void enqueue(T data)
    {
        end++;         // O(1)
        if (end < max) // O(1)
        {
            arr[end] = data; // O(1)
        }
        else
        {
            return; // O(1)
        }
    }
    /*
     * base runtime: O(4) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

public:
    void dequeue()
    {
        if (start == end) // O(1)
        {
            return; // O(1)
        }
        else
        {
            start++; // O(1)
        }
    }
    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

public:
    T rear()
    {
        if (end == start) // O(1)
        {
            return -1; // O(1)
        }
        return arr[end]; // O(1)
    }
    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

public:
    T front()
    {
        if (end == start) // O(1)
        {
            return -1; // O(1)
        }
        return arr[start]; // O(1)
    }
    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

public:
    int size()
    {
        return end; // O(1)
    }
    /*
     * base runtime: O(1) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

public:
    bool isEmpty()
    {
        if (end == start) // O(1)
        {
            return true; // O(1)
        }
        return false; // O(1)
    }
    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

public:
    T *copy()
    {
        return arr; // O(1)
    }
    /*
     * base runtime: O(1) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

public:
    void print()
    {
        if (end == -1) // O(1)
        {
            return; // O(1)
        }
        else
        {
            for (int i = 0; i < end; i++) // O(3n + 1)
            {
                std::cout << arr[i] << " "; // O(n)
            }
            std::cout << "\n"; // O(1)
        }
    }
    /*
     * base runtime: O(4n + 4) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
};

int main()
{

    QueueImp<int> queue = new QueueImp<int>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    queue.print();
    return -1;
}
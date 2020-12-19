#include <iostream>
struct Stack
{
    int start = -1;
    int max = 100;
    int arr[100];

public:
    void push(int data)
    {
        start++;         // O(1)
        if (start < max) // O(1)
        {
            arr[start] = data; // O(1)
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
    void print()
    {
        if (start == -1) // O(1)
        {
            std::cout << "The stack is empty. " // O(1)
                      << "\n";
        }
        if (start <= max) // O(1)
        {
            for (int i = 0; i < start; i++) // O(3n)
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

public:
    int peek()
    {
        return arr[start]; // O(1)
    }
    /*
     * base runtime: O(1) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */
};
class Queue
{
    Stack stack = Stack();
    int start = 0;
    int max = 100;
    int end = -1;
    int arr[100];

public:
    void enqueue(int data)
    {
        end++;         // O(1)
        if (end < max) // O(1)
        {
            arr[end] = data; // O(1)
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
    void dequeue()
    {
        if (end == start) // O(1)
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
    void reverse()
    {
        if (start == -1) // O(1)
        {
            std::cout << "The list is empty" // O(1)
                      << "\n";
        }
        else
        {
            end += 1;         // O(1)
            while (end != -1) // O(n)
            {
                stack.push(arr[end - 1]); // O(n)
                end--;                    // O(n)
            }
            stack.print(); // O(1)
        }
    }
    /*
     * base runtime: O(3n + 2) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
public:
    int getSize()
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
    int peek()
    {
        return arr[end]; // O(1)
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

            std::cout << "The Queue is empty" // O(1)
                      << "\n";
        }
        else
        {
            for (int i = start; i < end + 1; i++) // O(3n)
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
    Queue queue = Queue();
    Stack stack = Stack();

    for (int i = 0; i < 10; i++)
    {
        queue.enqueue(i * 2);
    }

    queue.print();

    queue.reverse();
    stack.print();

    return -1;
}
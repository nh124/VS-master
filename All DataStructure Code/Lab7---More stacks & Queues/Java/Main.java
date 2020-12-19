
/*
[(1)] Design a Stack that is composed ONLY of one or two Queue objects ergo the ONLY instance variables that exist in this stack are queues.
 Stack class should contain the following methods:
           Print
            Pop
            Push
            Top
            Size
            isEmpty
            copy
[(2)] Design a Queue that is composed ONLY of two Stacks objects ergo the ONLY instance variables that exist in this queue are stacks.
Queue class should contain the following methods:
               Print
                Enqueue
                Dequeue
                Front
                Rear
                Size
                isEmpty
               Copy
*/

public class Main {
    public static void main(String[] args) {
        QueueImp<Integer> queue = new QueueImp<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();

    }
}

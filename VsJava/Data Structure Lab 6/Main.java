import java.util.Scanner;

public class Main {
    static int add;
    static int choice;
    static Scanner scan = new Scanner(System.in);
    static int dataType;

    public static void main(String[] args) {
        StackImp<Integer> stack = new StackImp<>();

        System.out.println("Integers: ");
        System.out.println("How many integers would you like to add: ");
        int push = scan.nextInt();
        for (int i = 0; i <= push; i++) {
            System.out.println("Enter data: ");
            int data = scan.nextInt();
            stack.push(data);
        }
        stack.print();
        System.out.println("Pop");
        System.out.println("How many times would you like to pop: ");
        int pop = scan.nextInt();
        for (int i = 0; i < pop; i++) {
            stack.pop();
        }
        stack.print();
        System.out.println("Empty: " + stack.isEmpty());
        stack.peek();
        System.out.println("Size: " + stack.size());

        // StackImp<Integer> stack = new StackImp<>();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);
        // stack.push(6);
        // stack.push(7);
        // stack.push(8);
        // stack.push(9);
        // stack.push(10);
        // stack.push(11);
        // stack.push(12);

        // stack.print();
        // stack.pop();
        // stack.print();
        // stack.peek();
        // System.out.println("Size " + stack.size());

        QueueImp<String> queue = new QueueImp<String>();
        System.out.println("String: ");
        System.out.println("How many words would you like to enqueue: ");
        int pushToQueue = scan.nextInt();

        System.out.println("-------------------Enqueueing-----------------------------------");
        System.out.println("Enqueueing");
        for (int i = 0; i < pushToQueue + 1; i++) {
            System.out.println("Enter data " + i + 1 + ": ");
            String data = scan.nextLine();
            queue.enqueue(data);
        }
        queue.print();
        System.out.println("------------------------------------------------------------------");
        System.out.println("-----------------Dequeueing---------------------------------------");
        System.out.println("Dequeue");
        System.out.println("How many times would you like to dequeue: ");
        int popFromQueue = scan.nextInt();
        for (int i = 0; i < popFromQueue; i++) {
            queue.dequeue();
        }
        queue.print();
        System.out.println("------------------------------------------------------------------");

        System.out.println("Empty: " + queue.isEmpty());
        queue.peek();
        System.out.println("Size: " + queue.size());

        // queue testing
        // QueueImp<String> queue = new QueueImp<String>();
        // queue.enqueue("Hello");
        // queue.enqueue("Hello");
        // queue.enqueue("Hello");
        // queue.enqueue("Hello");
        // queue.enqueue("Hello");
        // queue.enqueue("Hello");
        // queue.enqueue("Hello");
        // queue.enqueue("Hello");
        // queue.enqueue("Hello");
        // queue.enqueue("Hello");
        // queue.enqueue("Hello");
        // queue.enqueue("Hello");

        // queue.print();
        // System.out.println(queue.size());
    }
}

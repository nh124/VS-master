public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Stack stack = new Stack();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i * 2);
        }

        queue.print();

        queue.reverse();
        stack.print();
    }
}

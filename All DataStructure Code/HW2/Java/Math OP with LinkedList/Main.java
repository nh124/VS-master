public class Main {
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        Node firstNumber = ll.firstNumber();
        Node secondNumber = ll.secondNumber();
        ll.print(firstNumber);
        ll.print(secondNumber);

        System.out.println(ll.power(firstNumber, 2));
    }
}

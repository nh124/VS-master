public class Main {
    public static void main(String[] args) {
        postfixNotation pn = new postfixNotation();
        String expression = "53+62/*35*+";
        System.out.println("The result is: " + pn.operation(expression));
    }
}

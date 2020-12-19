public class Palindrome {

    Stack stack = new Stack();
    char[] arr2;

    public void palindromeImp(String word) {
        char[] arr = word.toCharArray();
        int length = word.length() - 1;
        int rev = 0;

        for (int i = 0; i < word.length(); i++) {
            stack.push(arr[i]);
        }
        stack.print();

        while (length > 0) {
            arr2[0] = stack.peek();
            stack.pop();
            length--;
            rev--;
        }

    }

}

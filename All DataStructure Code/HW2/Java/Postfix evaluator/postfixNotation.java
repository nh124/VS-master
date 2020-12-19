public class postfixNotation {
    int numbs(char c) {
        int val; // O(1)
        val = c; // O(1)
        return (val - '0'); // O(1)
    }

    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */
    int operation(String word) {
        char[] expression = word.toCharArray();
        int numb1, numb2; // O(1)
        Stack stk = new Stack(); // O(1)
        int size = word.length(); // O(1)
        for (int i = 0; i < size; i++) // O(3n)
        {

            if (isOperator((char) i) != -1) // O(n)
            {
                numb1 = stk.top(); // O(n)
                stk.pop(); // O(n)
                numb2 = stk.top(); // O(n)
                stk.pop(); // O(n)
                stk.push(operations(expression[i], numb1, numb2)); // O(n)
            } else if (isNumber(expression[i]) > 0) {
                stk.push(numbs(expression[i])); // O(1)
            }
        }
        return stk.top(); // O(1)
    }

    /*
     * base runtime: O(8n + 5) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperbound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */
    int isNumber(char c) {
        if (c >= '0' && c <= '9') // O(1)
        {
            return 1; // O(1)
        }
        return -1; // O(1)
    }

    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */
    int isOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') // O(1)
        {
            return 1; // O(1)
        }
        return -1; // O(1)
    }

    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */
    int operations(char operation, int numb1, int numb2) {
        if (operation == '+') // O(1)
        {
            return numb2 + numb1; // O(1)
        } else if (operation == '-') {
            return numb2 - numb1; // O(1)
        } else if (operation == '*') {
            return numb2 * numb1; // O(1)
        } else if (operation == '/') {
            return numb2 / numb1; // O(1)
        } else {
            return -1; // O(1)
        }
    }
    /*
     * base runtime: O(6) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperbound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */
}
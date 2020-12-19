public class Stack {

    int start = -1;
    int max = 100;
    int arr[] = new int[max];

    public void push(int data) {
        start++; // O(1)
        if (start < max) { // O(1)
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

    public void print() {
        if (start == -1) { // O(1)
            System.out.println("The stack is empty. ");// O(1)
        }
        if (start <= max) { // O(1)
            for (int i = 0; i < start; i++) { // O(3n)
                System.out.print(arr[i] + " "); // O(n)
            }
            System.out.println(); // O(1)
        }
    }
    /*
     * base runtime: O(4n + 4) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */

    public int peek() {
        return start; // O(1)
    }
    /*
     * base runtime: O(1) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

    public int[] getArray() {
        return this.arr; // O(1)
    }
    /*
     * base runtime: O(1) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

}

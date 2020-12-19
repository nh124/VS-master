public class StackImp<T> {
    int start;
    int max = 3;

    QueueImp<T> arr = new QueueImp<T>();

    public void push(Object data) {
        if (start == -1) { // O(1)
            return; // O(1)
        }
        start++; // O(1)
        if (start <= max) { // O(1)
            arr.enqueue(data); // O(1)
        }
        /*
         * base runtime: O(5) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
         * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
         * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
         * Big O then we can say that the average or Big theta is the base runtime:
         * O(1).
         */

    }

    public void pop() {
        if (start == -1) { // O(1)
            return; // O(1)
        } else {
            start--; // O(1)
            arr.dequeue(); // O(1)
        }
    }
    /*
     * base runtime: O(5) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

    public Object rear() {
        if (start == -1) { // O(1)
            return -1; // O(1)
        } else {
            return arr.rear(); // O(1)
        }
    }
    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

    public Object front() {
        return arr.front(); // O(1)
    }
    /*
     * base runtime: O(1) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

    public int size() {
        if (start == -1) { // O(1)
            return -1; // O(1)
        }
        return start; // O(1)
    }
    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

    public boolean isEmpty() {
        if (start == -1) { // O(1)
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

    public Object[] Copy() {
        return arr.arr; // O(1)
    }
    /*
     * base runtime: O(1) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

    public void print() {
        arr.print(); // O(1)

    }
    /*
     * base runtime: O(1) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */
}
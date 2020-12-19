//Stack methods(push, pop, peek, isEmpty, size, print) and Queue methods (enqueue, deque, peek, isEmpty, size, print
public class QueueImp<T> {
    int max = 10; // O(1)
    Object[] arr = new Object[max]; // O(1)
    int start = -1; // O(1)
    linkedList<T> ll = new linkedList<T>(); // O(1)
    int end = -1; // O(1)

    public void enqueue(T data) {
        try { // O(1)
            end++; // O(1)
            arr[end] = data; // O(1)
        } catch (Exception e) {
            ll.add(data); // O(1)
        }
    }
    /*
     * base runtime: O(4) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

    public void dequeue() {
        if (end == -1) { // O(1)
            return; // O(1)
        }
        start += 2; // O(1)
    }

    public void dequeueC() {
        if (end == -1) { // O(1)
            return; // O(1)
        } else if (start != end) { // O(1)
            start++; // O(1)
        } else {
            if (start % 2 == 0) { // O(1)
                start = start % 2; // O(1)
            } else { // O(1)
                start = (start % 2) - 1; // O(1)
            }

        }
    }
    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

    public void peek() {
        if (end == -1) { // O(1)
            return; // O(1)
        } else if (end <= max) {
            System.out.println("Peek: " + arr[start + 1]); // O(1)
        } else {
            ll.Last(); // O(1)
        }
    }
    /*
     * base runtime: O(4) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

    public boolean isEmpty() {
        if (start == end) { // O(1)
            return true; // O(1)
        } else {
            return false; // O(1)
        }
    }
    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

    public int size() {
        if (start == end) { // O(1)
            return 0; // O(1)
        }
        if (end <= max) { // O(1)
            return end; // O(1)
        } else {
            return max + (ll.size() - 1); // O(1)
        }
    }
    /*
     * O(5) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public void print() {
        if (end == -1) { // O(1)
            System.out.println("Empty"); // O(1)
        }
        if (end <= max) { // O(1)
            for (int i = start + 1; i <= end; i++) { // O(3n)
                System.out.print(arr[i] + " "); // O(n)
            }
            System.out.println(); // O(1)
        } else {
            for (int i = start + 1; i <= max - 1; i++) { // O(3n)
                System.out.print(arr[i] + " "); // O(n)
            }
            ll.print(); // O(1)
            System.out.println(); // O(1)
        }
    }
    /*
     * base runtime: O(8n + 6) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */

}
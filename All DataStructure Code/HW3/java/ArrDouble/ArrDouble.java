public class ArrDouble<T> {

    int max = 10; // O(1)
    Object[] arr = new Object[max]; // O(1)
    Object[] newArr = new Object[max * 2]; // O(1)

    int end = -1; // O(1)
    int start = 0;
    int i;
    /*------------------------------------------------------------------------------------*/

    public void append(T data) {
        try { // O(1)
            end++; // O(1)
            arr[end] = data; // O(1)
        } catch (Exception e) {
            end++; // O(1)
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[end] = data; // O(1)
        }
    }
    /*
     * O(4) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public void insert(T data) {
        try { // O(1)
            if (end == -1) { // O(1)
                arr[0] = data; // O(1)
            } else {
                arr[i] = arr[i + 1]; // O(1)
                arr[0] = data; // O(1)
            }
        } catch (Exception e) {
            end++; // O(1)
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr[i] = arr[i + 1]; // O(1)
            arr[0] = data; // O(1)
        }
    }
    /*
     * O(5) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public void remove(T data) {
        for (i = 0; i < arr.length; i++) { // O(3n)
            if (arr[i] == data) { // O(n)
                arr[i] = null; // O(n)
            }
        }
    }
    /*
     * base runtime: O(5n) -> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose
     * upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x)))
     * -> loose lower bound: O(log(n)) Big theta:Since this method have a Big omega
     * and Big O then we can say that the average or Big theta is the base runtime:
     * O(n).
     */

    public void removeFromStart() {
        if (end == -1) {
            return;
        }
        start++;
    }
    /*
     * O(3) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public void removeFromEnd() {
        if (end == -1) { // O(1)
            return; // O(1)
        }
        end--; // O(1)
    }
    /*
     * O(3) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    public Object pre(T data) {
        if (end == -1) { // O(1)
            return -1; // O(1)
        }
        for (i = 0; i < arr.length; i++) { // O(3n)
            if (arr[i] == data) { // O(n)
                return arr[i - 1]; // O(n)
            }
        }
        return "The value you entered does not exist in the array!"; // O(1)
    }
    /*
     * base runtime: O(5n + 3) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */

    public Object next(T data) {
        if (end == -1) { // O(1)
            return -1; // O(1)
        }
        for (i = 0; i < arr.length; i++) { // O(3n)
            if (arr[i] == data) { // O(n)
                return arr[i + 1]; // O(n)
            }
        }
        return "The value you entered does not exist in the array!"; // O(1)
    }
    /*
     * base runtime: O(5n + 3) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */

    public void moveToPosition(int position, T data) { // O(1)
        if (start == -1) { // O(1)
            return; // O(1)
        }
        for (i = 0; i < arr.length; i++) { // O(3n)
            if (arr[i] == data) { // O(n)
                arr[position] = data; // O(n)
            }
        }
    }
    /*
     * base runtime: O(5n + 3) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */

    public Object getVal(int position) {
        if (end == -1) { // O(1)
            return -1; // O(1)
        }
        return arr[position]; // O(1)
    }
    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

    public void print() {
        if (end == -1) { // O(1)
            System.out.println("Empty"); // O(1)
        }
        for (int i = start; i <= end; i++) { // O(3n)
            System.out.print(arr[i] + " "); // O(n)
        }
        System.out.println(); // O(1)

    }
    /*
     * base runtime: O(8n + 8) -> O(n) Big O: O(n) -> tight upper bound: O(5n) ->
     * loose upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound:
     * 25(O(log(x))) -> loose lower bound: O(log(n)) Big theta:Since this method
     * have a Big omega and Big O then we can say that the average or Big theta is
     * the base runtime: O(n).
     */

}
/*
problem:
 Print
 Add - Adds element to the end of the linked list.
 IsEmpty
 Push - Adds element to the beginning of the linked list
 InsertAt - Inserts an element at a given position
 Clear - Removes all elements from the linked list
 Contains - Returns true if element is in the linked list
 Get - Returns a value at a specic position
 IndexOf - Returns the first position where an element occurs, -1 if
not
 LastOf - Returns the last position where an element occurs, -1 if not
 Remove - Removes the last item added to the list
 RemoveAt - Removes an element at a specic position
 RemoveElement - Removes the first occurrence of a specfic element
 Size
 Slice - Returns a subset of this linked list given a beginning position
start and end position stop.
*/
public class client {
    public static void main(String[] args) {
        Linked_List<Integer> ll = new Linked_List<Integer>();
        DoubleLinkedList<Integer> dl = new DoubleLinkedList<Integer>();

        dl.put(1);
        dl.put(2);
        dl.put(3);
        dl.put(4);
        dl.put(5);
        dl.put(6);
        dl.put(19);
        dl.put(8);
        dl.put(9);
        dl.put(19);

        dl.print();
        System.out.println(dl.indexOf(19));
        System.out.println(dl.lastOf(19));
        // System.out.println(ll.get(7));
        // ll.slice(3, 19);
        dl.print();

    }
}

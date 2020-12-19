class client {
    public static void main(String[] arsg){
        linkedList<Integer> ll = new linkedList<Integer>();
        ll.addData(1);
        ll.addData(2);
        ll.addData(3);
        ll.addData(4);
        ll.addData(5);
        ll.addData(6);
        ll.addData(7);
        ll.addData(8);

        linkedList<String> llString = new linkedList<String>();
        llString.addData("hello");
        llString.addData("dog");
        llString.addData("car");
        llString.addData("cat");
        llString.addData("house");
        llString.addData("bob");
        llString.addData("sky");
        
        
        // original
        System.out.println("Original list");
        ll.print();
        // removal from end
        System.out.println("List with the last element removed");
        ll.removeData();
        ll.print();
        // removal from element
        int element = 3;
        System.out.println("list with element " + 3 + " removed.");
        ll.removeData(element);
        ll.print();
        // insertion at the begining
        int elementAddBeg = 0;
        System.out.println("list with element " + elementAddBeg + " added");
        ll.insertionbeg(elementAddBeg);
        ll.print();
        // insertion at the end
        int elementAddEnd = 10;
        System.out.println("list with element " + elementAddEnd + " added");
        ll.insertionEnd(elementAddEnd);
        ll.print();
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
          // original
          System.out.println("Original list");
          llString.print();
          // removal from end
          System.out.println("List with the last element removed");
          llString.removeData();
          llString.print();
          // removal from element
          int elementString = 3;
          System.out.println("list with element " + elementString + " removed.");
          llString.removeData(elementString);
          llString.print();
          // insertion at the begining
          String elementAddBegString = "hello";
          System.out.println("list with element " + elementAddBegString + " added");
          llString.insertionbeg(elementAddBegString);
          llString.print();
          // insertion at the end
          String elementAddEndString = "Bye";
          System.out.println("list with element " + elementAddEndString + " added");
          llString.insertionEnd(elementAddEndString);
          llString.print();


    }
}
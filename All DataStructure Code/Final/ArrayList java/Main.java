import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    ArrayList<Integer> list= new ArrayList<>();
    for(int i = 0; i < 10; i++){
      list.add(i+1);
    }
    list.insertAt(32,4);
    list.print();

  } 
}
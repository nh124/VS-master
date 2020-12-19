public class Main{
    public static void main(String[] args){
      priorityQueue<Integer> pq = new priorityQueue<Integer>(); // max heap
      pq.add(7);
      pq.add(3);
      pq.add(1);
      pq.add(5);
      pq.add(8);
      pq.add(1);
      pq.add(3);
      pq.remove(0);
      pq.print();
    }
  }
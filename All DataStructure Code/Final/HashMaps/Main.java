class Main {
    public static void main(String[] args) {
      Hash_Map<Integer, String> map = new Hash_Map<>();
      map.put(1, "Hello");
      map.put(2, "danny");
      map.put(4, "rob");
      map.put(5, "coby");
      map.put(6, "ron");
      map.put(7, null);
      map.delete(2);
      map.print();
      System.out.println(map.containsKey(7));
  
  
    }
  }
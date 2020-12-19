
public class Main {
    public static void main(String[] args) {
        cityDatabase city = new cityDatabase();
        Node root = new Node("New York", 3, 1);
        city.setElement(root, "Savannah", 2, 4);
        city.setElement(root, "Augusta", 8, 10);
        city.setElement(root, "Macon", 12, 6);
        city.setElement(root, "Valdosta", 18, 10);
        city.setElement(root, "Atlanta", 1, 10);
        city.setElement(root, "Athens", 9, 1);

        System.out.println("All cities within 9.0");
        city.inOrder(root, 1, 4, 9.0);

        // System.out.println(city.searchByCoordinate(root, 2,4));
        // System.out.println(city.searchByName(root, "Macon"));

        // System.out.println(city.deleteByCoordinate(root,2,4));
        System.out.println(city.deleteByName(root, "Athens"));
        city.inOrder(root, 1, 4, 9.0);

    }
}

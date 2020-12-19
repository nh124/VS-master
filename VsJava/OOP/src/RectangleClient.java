public class RectangleClient {
    public static void main(String[] args)
    {
        rectangle r = new rectangle(11,12,3,4);
        System.out.println(r.toString());
        System.out.println(r.area());
        System.out.println(r.isSquare());
    }
}

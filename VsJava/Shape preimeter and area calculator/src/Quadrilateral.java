public class Quadrilateral implements polygonInterface
{
    static double base;
    static double side;

    public Quadrilateral()
    {

    }
    public Quadrilateral(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3)
    {
        base = Math.sqrt(Math.pow((x_2 - x_1),2) +  Math.pow((y_2 - y_1),2));
        side = Math.sqrt(Math.pow((x_3 - x_2),2) +  Math.pow((y_3 - y_2),2));
    }
    @Override
    public double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3)
    {
        base = Math.sqrt(Math.pow((x_2 - x_1),2) +  Math.pow((y_2 - y_1),2));
        side = Math.sqrt(Math.pow((x_3 - x_2),2) +  Math.pow((y_3 - y_2),2));
        System.out.println("con side" + side);
        return base * side;
    }

    @Override
    public double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        return (2*base) + (2*side);
    }

    public double getBase()
    {
        return base;
    }
    public double getSide()
    {
        return side;
    }
}

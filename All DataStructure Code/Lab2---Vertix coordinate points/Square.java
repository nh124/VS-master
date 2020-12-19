public class Square extends Quadrilateral
{
    double side;
    @Override
    public double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        side = Math.sqrt(Math.pow((x_3 - x_2),2) +  Math.pow((y_3 - y_2),2));
        return Math.pow(side, 2);
    }

    @Override
    public double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        return 4*side;
    }
}

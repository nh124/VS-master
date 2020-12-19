public class EquilateralTriangle extends Triangle
{
    double base;
    double side;

    @Override
    public double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        base = Math.sqrt(Math.pow((x_2 - x_1),2) +  Math.pow((y_2 - y_1),2));
        side = Math.sqrt(Math.pow((x_3 - x_2),2) +  Math.pow((y_3 - y_2),2));
        double halfBase = base/2;
        double apothem = Math.pow(side,2) - Math.pow(halfBase,2);
        return (apothem * base)/2;
    }

    @Override
    public double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        return base*3;
    }
}

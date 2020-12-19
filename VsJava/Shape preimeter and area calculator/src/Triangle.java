interface polygonInterface
{
    double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3);
    double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3);
}
public class Triangle implements polygonInterface
{
    static double base;
    static double side;
    Triangle()
    {

    }

    Triangle(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3){
        base = Math.pow(Math.pow((x_2 - x_1),2) +  Math.pow((y_2 - y_1),2), (double)1/2);
        side = Math.pow(Math.pow((x_3 - x_2),2) +  Math.pow((y_3 - y_2),2), (double)1/2);
    }


    @Override
    public double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        double halfBase = base/2;
        double apothem = Math.pow(side,2) - Math.pow(halfBase,2);

        return  (apothem * base)/2;
    }

    @Override
    public double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        return base + (side * 2);
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

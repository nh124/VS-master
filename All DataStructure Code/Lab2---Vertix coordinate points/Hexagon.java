import java.util.Scanner;

public class Hexagon extends Quadrilateral
{
    double sideLength1;
    double sideLength2;
    @Override
    public double area(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        sideLength1 = Math.sqrt(Math.pow((x_2 - x_1),2) +  Math.pow((y_2 - y_1),2));
        sideLength2 = Math.sqrt(Math.pow((x_3 - x_2),2) +  Math.pow((y_3 - y_2),2));
        Scanner console = new Scanner(System.in);
        if (sideLength1 == sideLength2) {
            double apothem = (sideLength1 / 2)/(Math.tan(Math.toRadians(360) / (6 * 2)));
            return ((sideLength1 * 6) * apothem) / 2;
        }
            System.out.println("Please make sure the shape is symmetrical.");
            System.out.println("Please reenter the 3 vertices");
            this.sideLength1 = console.nextInt();
            this.sideLength2 = console.nextInt();
            return area(x_1, y_1,x_2, y_2, x_3, y_3);
    }

    @Override
    public double perimeter(int x_1, int y_1, int x_2, int y_2, int x_3, int y_3) {
        if (sideLength1 == sideLength2) {
            return 6 * sideLength1;
        }
        return perimeter(x_1, y_1,x_2, y_2, x_3, y_3);
    }
}

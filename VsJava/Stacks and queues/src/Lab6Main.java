import java.util.ArrayList;
import java.util.Collections;
public class Lab6Main {

    public static void main(String[] args) {
            ArrayList<Point> Points = new ArrayList<Point>();
            Points.add(new Point(1, 2, 3));
            Points.add(new Point(0, 0, 0));
            Points.add(new Point(0, 34, 68));

            Collections.sort(Points);
            System.out.println(Points.toString());

        }// .toSting has make a method of .toString

    }



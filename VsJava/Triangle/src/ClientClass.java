import java.util.ArrayList;
import java.util.Collections;

public class ClientClass {
    public static void main(String[] args){

        Point p1 = new Point(1,2); Point p2 = new Point(3,4); Point p3 = new Point(6,7);
        Triangle T1 = new Triangle(p1, p2, p3);
        Point p4 = new Point(1,2); Point p5 = new Point(5,4); Point p6 = new Point(5,7);
        Triangle T2 = new Triangle(p4, p5, p6);
        Point p7 = new Point(1,6); Point p8 = new Point(3,4); Point p9 = new Point(6,7);
        Triangle T3 = new Triangle(p7, p8, p9);
        Point p10 = new Point(1,8); Point p11 = new Point(4,4); Point p12 = new Point(9,7);
        Triangle T4 = new Triangle(p10, p11, p12);
        Point p13 = new Point(1,3); Point p14 = new Point(0,4); Point p15 = new Point(9,7);
        Triangle T5 = new Triangle(p13, p14, p15);
        Point p16 = new Point(1,6); Point p17 = new Point(3,4); Point p18 = new Point(9,7);
        Triangle T6 = new Triangle(p16, p17, p18);
        Point p19 = new Point(2,2); Point p20 = new Point(3,4); Point p21 = new Point(6,7);
        Triangle T7 = new Triangle(p19, p20, p21);
        Point p22 = new Point(1,2); Point p23 = new Point(5,4); Point p24 = new Point(6,7);
        Triangle T8 = new Triangle(p22, p23, p24);
        Point p25 = new Point(1,2); Point p26 = new Point(3,3); Point p27 = new Point(6,7);
        Triangle T9 = new Triangle(p25, p26, p27);
        Point p28 = new Point(1,1); Point p29 = new Point(3,4); Point p30 = new Point(6,7);
        Triangle T10 = new Triangle(p28, p29, p30);

       ArrayList<Triangle> list1 = new ArrayList<>();
        list1.add(T1);
        list1.add(T2);
        list1.add(T3);
        list1.add(T4);
        list1.add(T5);
        list1.add(T6);
        list1.add(T7);
        list1.add(T8);
        list1.add(T9);
        list1.add(T10);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

    }
}


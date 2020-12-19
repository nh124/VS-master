import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;

public class clientClass
{
    public static void main(String[] args)
    {
        // Triangle 1
        point p1 = new point(2,4);
        point p2 = new point(3,4);
        point p3 = new point(6,14);
        // Triangle 2
        point p4 = new point(7,4);
        point p5 = new point(13,14);
        point p6 = new point(16,14);
        // Triangle 3
        point p7 = new point(7,14);
        point p8 = new point(0,9);
        point p9 = new point(1,5);
        // Triangle 4
        point p10 = new point(7,34);
        point p11 = new point(23,14);
        point p12 = new point(16,0);
        // Triangle 5
        point p13 = new point(2,8);
        point p14 = new point(0,0);
        point p15 = new point(9,1);
        // Triangle 6
        point p16 = new point(21,41);
        point p17 = new point(18,44);
        point p18 = new point(26,40);
        // Triangle 7
        point p19 = new point(3,41);
        point p20 = new point(13,4);
        point p21 = new point(20,4);
        // Triangle 8
        point p22 = new point(56,1);
        point p23 = new point(3,14);
        point p24 = new point(6,14);
        // Triangle 9
        point p25 = new point(6,14);
        point p26 = new point(3,34);
        point p27 = new point(61,14);
        // Triangle 10
        point p28 = new point(21,41);
        point p29 = new point(1,4);
        point p30 = new point(19,43);


        triangle t1 = new triangle(p1,p2,p3);
        triangle t2 = new triangle(p4,p5,p6);
        triangle t3 = new triangle(p7,p8,p9);
        triangle t4 = new triangle(p10,p11,p12);
        triangle t5 = new triangle(p13,p14,p15);
        triangle t6 = new triangle(p16,p17,p18);
        triangle t7 = new triangle(p19,p20,p21);
        triangle t8 = new triangle(p22,p23,p24);
        triangle t9 = new triangle(p25,p26,p27);
        triangle t10 = new triangle(p28,p29,p30);

        ArrayList<triangle> list = new ArrayList<triangle>();
            list.add(t1);
            list.add(t2);
            list.add(t3);
            list.add(t4);
            list.add(t5);
            list.add(t6);
            list.add(t7);
            list.add(t8);
            list.add(t9);
            list.add(t10);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

}

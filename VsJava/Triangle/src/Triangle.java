
public class Triangle implements Comparable<Triangle> {
    Point VertexA;
    Point VertexB;
    Point VertexC;

    public Triangle(Point VertexA, Point VertexB, Point VertexC){
        this.VertexA = VertexA;
        this.VertexB = VertexB;
        this.VertexC = VertexC;

    }
    public void setVertexB(){
        this.VertexB = VertexB;
    }

    private void setVertexA(){
        this.VertexA = VertexA;
    }

    private void setVertexC() {
        this.VertexC = VertexC;
    }
    public Point getVertexA(){
        return VertexA;
    }
    public Point getVertexB(){
        return VertexB;
    }
    public Point getVertexC(){
        return VertexC;
    }
    public double getArea(Point a, Point b, Point c){
        int s1;
        s1 = (int)Math.sqrt((b.getX() - a.getX())*(b.getX() - a.getX()) + (b.getY() - a.getY())*(b.getY() - a.getY()));
        int s2;
        s2 = (int)Math.sqrt((b.getX() - c.getX())*(b.getX() - c.getX()) + (b.getY() - c.getY())*(b.getY() - c.getY())); // b-c
        int s3;
        s3 = (int)Math.sqrt((b.getX() - a.getX())*(b.getX() - a.getX()) + (b.getY() - a.getY())*(b.getY() - a.getY()));// a-c

        double Area;
        int s = (s1 + s2 + s3)/2;
        Area = Math.sqrt(s*(s-s1))* s*(s-s2) * s*(s-s3);
        return Area;
    }

    public double printArea(){
        return getArea(VertexA, VertexB, VertexC);
    }
    @Override
    public int compareTo(Triangle o) {
        if(o.getArea(o.getVertexA(),o.getVertexB(),o.getVertexC()) == this.getArea(this.getVertexA(), this.getVertexB(), this.getVertexC())){
            return 1;
        }else{
            return 0;
        }
    }
    public String toString(){
        return VertexA + "," +  VertexB + "," +  VertexC + printArea() + "\n";
    }


}

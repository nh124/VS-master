public class Point implements Comparable<Point> {
    public float x;
    public float y;
    public float z;

    public Point(int inX, int inY, int inZ)
    {
        x = inX;
        y = inY;
        z = inZ;
    }
    public int compareTo(Point o){
        if(x != o.x){
            return (int) (x - o.x);
        }
        else {
            if(y != o.y){
                return (int) (y-o.y);
            }
            else{
                if(z != o.z){
                   return (int) (z-o.z);
                }
                else{
                    return 0;
                }
            }
        }

    }
    public String toString(){
        return ("Point: "+" " + this.x + " " + " " + this.y + " " + " " +  this.z);
    }
}



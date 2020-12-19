public class point {
    private int x;
    private int y;

    public point()
    {
        this(0,0);
    }
    public point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }

}

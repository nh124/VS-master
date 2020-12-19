public class rectangle
{
    public int x;
    public int y;
    public int width;
    public int height;
    public int area;

    public rectangle(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    // the x
    public void setX(int x)
    {
          this.x = x;
    }
    public int getX()
    {
        return x;
    }
    // the y
    public void setY(int y)
    {
        this.y = y;
    }
    public int getY(int y)
    {
        return y;
    }
    // the width
    public void setWidth(int width)
    {
        this.width = width;
    }
    public int getWidth(int width)
    {
        return width;
    }
    // height
    public void setHeight(int height)
    {
        this.height = height;
    }
    public int getHeight(int height)
    {
        return height;
    }
    public boolean isSquare()
    {
        if(x == y)
        {
            return true;
        }else{
          return false;
        }
    }
   // area
    public int area()
    {
        area = this.width * this.height;
        return area;
    }
    public String toString()
    {
        return "Rectangle location is: " + "(" + x + "," + y + ")\t" + "With the dimension" + width + "x" + height + "\tand the area is: " + area;
    }


}

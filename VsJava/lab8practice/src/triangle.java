public class triangle implements Comparable{
    point vertexA;
    point vertexB;
    point vertexC;

    public triangle(point vertexA, point vertexB, point vertexC){
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
    }
    public point getVertixA()
    {
        return vertexA;
    }
    public point getVertixB()
    {
        return vertexB;
    }
    public point getVertixC()
    {
        return vertexC;
    }

    public String toString()
    {
      return "vertex A" + vertexA + "vertex B" + vertexB + "vertex C" + vertexC;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

import java.util.Arrays;

public class Polygon {
    private final Point[] vertices;

    //konstruktor dokonuje głębokiej kopii
    public Polygon(Point[] vertices)
    {
        this.vertices = vertices.clone();
        for (int i = 0; i < vertices.length; i++)
            this.vertices[i] = new Point(vertices[i]);
    }

    public Polygon(Polygon other)
    {
        this.vertices = new Point[other.vertices.length];
        for (int i = 0; i < vertices.length; i++)
        {
            this.vertices[i] = new Point(other.vertices[i]);
        }
    }

    public void setPoint(int ix, int x, int y)
    {
        this.vertices[ix].setX(x);
        this.vertices[ix].setY(y);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Point p : vertices)
        {
            s.append(p.getX()).append(",").append(p.getY()).append(" ");
        }
        return s.toString().trim();
    }

    public String toSvg()
    {
        return "<polygon points=\"" +
                toString()
                + "\" style=\"fill:lime;stroke:purple;stroke-width:3\" />";
    }
}

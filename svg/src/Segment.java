import static java.lang.Math.pow;

public class Segment {
    public Point a;
    public Point b;

    public double length() {
        return Math.sqrt(pow(a.getX() - b.getX(), 2) + pow(a.getY() - b.getY(), 2));
    }

    public static Segment maxSegment(Segment[] arr) {
        if (arr.length == 0)
            return null;

        Segment max = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i].length() > max.length())
                max = arr[i];
        }

        return max;
    }

    public String toSvg() {
        return "<line x1=\"" + a.getX() + "\" y1=\"" + a.getY() + "\" x2=\"" + b.getX() + "\" y2=\"" + b.getY() + "\" style=\"stroke:blue;stroke-width:5\" />";
    }

    @Override
    public String toString()
    {
        return "(" + a.getX() + ", " + a.getY() + ")" + "<->" + "(" + b.getX() + ", " + b.getY() +")";
    }
}

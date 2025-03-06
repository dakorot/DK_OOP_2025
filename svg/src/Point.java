public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public String toSvg() {
        return "<circle r=\"5\" cx=\"" + x + "\" cy=\"" + y + "\" fill=\"red\" />";
    }

    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public Point translated(double dx, double dy) {
        Point newPoint = new Point();
        newPoint.x = this.x + dx;
        newPoint.y = this.y + dy;

        return newPoint;
    }
}

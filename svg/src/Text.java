public class Text extends Shape {
    String text;
    Point point;
    int textLength;
    int fontSize;

    public Text(String text, Point point, int textLength, int fontSize, Style style)
    {
        super(style);
        this.text = text;
        this.point = point;
        this.textLength = textLength;
        this.fontSize = fontSize;
    }

    public String toSvg()
    {
        return " <text x=\"" + this.point.getX() + "\" y=\"" + this.point.getY() + "\" length=\"" + this.textLength + "\"" + "font=" + this.fontSize + "style=" + this.style + ">Some text</text>";
    }

    public BoundingBox boundingBox()
    {
        return BoundingBox(point.getX(), point.getY(), textLength, fontSize);
    }
}

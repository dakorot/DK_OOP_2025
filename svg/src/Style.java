public class Style {
    public final String fillColor, strokeColor;
    public final double strokeWidth;

    public Style(String fillColor, String strokeColor, double strokeWidth) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }

    public String toSvg()
    {
        return "style=\"fill:" + fillColor + "lime;stroke:purple;stroke" + strokeColor + "-width:" + strokeWidth +"\"";
    }
}

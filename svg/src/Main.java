public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(30, 40);
        Point p2 = new Point();
        p2.setY(20);

        System.out.println(p1);
        System.out.println(p2);

        Segment seg = new Segment(p1, p2);
        System.out.println(seg);
        p2.setX(60);
        System.out.println(seg);

        Point[] arr = {p1, p2, p1};
        arr[2] = new Point(30, 0);
        p2.setX(0);

        Polygon pol = new Polygon(arr);
        System.out.println(pol);

        Polygon polCopy = new Polygon(pol);
        System.out.println(polCopy);

        pol.setPoint(1, 0, 40);
        System.out.println("Poly: " + pol);
        System.out.println("PolCopy: " + polCopy);

        System.out.println(pol.toSvg());

        SvgScene scene = new SvgScene();
        scene.addPolygon(pol);
        scene.addPolygon(polCopy);
        System.out.println(scene);

        polCopy.setPoint(1, -50, 40);
        System.out.println(scene);

        pol.toSvg();
    }
}
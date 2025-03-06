import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
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
        polCopy.setPoint(0, -50, -50);
        polCopy.setPoint(1, 0, 0);
        polCopy.setPoint(2, 100, -30);

        Polygon square = new Polygon(new Point[]{new Point(70,70),
                                                new Point(130, 70),
                                                new Point(130, 130),
                                                new Point(70, 130)}
        );
        scene.addPolygon(square);

        polCopy.setPoint(1, -50, 40);
        System.out.println(scene);

        pol.toSvg();

        System.out.println(polCopy.boundingBox());

        scene.save("rysunek.svg");
    }
}

/*
* Polygon:
* dodać klasę Style z polami fill, stroke, stroke_width
* dodać pole style w tej klasie
* zamienić atrybut style = (line 69)
*
* Main:
* utworzyć obiekt Style i przypisać do utworzonych poligonów (jako referencja)
* zmienić style w main i zaobserwować zmianę we wszystkich wielokątach
* */
public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 20.0;
        p.y = 20.0;
        System.out.println("P = " + p);
        System.out.println(p.toSvg());

        p.translate(5, -5);
        System.out.println("translate: " + p);

        System.out.println("translated: " + p.translated(3, 3));
        Point translated = p.translated(3, 3);
        System.out.println("translated 2: " + translated);

        Segment seg = new Segment();

        seg.a = new Point();
        seg.b = new Point();

        seg.a.x = 1.0;
        seg.a.y = 1.0;
        seg.b.x = 212.0;
        seg.b.y = 113.0;

        System.out.println("Seg length: " + seg.length());

        Segment[] tab = new Segment[2];
        tab[0] = seg;
        tab[1] = new Segment();
        tab[1].a = new Point();
        tab[1].b = new Point();
        tab[1].a.x = 0;
        tab[1].a.y = 0;
        tab[1].b.x = 12;
        tab[1].b.y = 5;

        Segment longest = Segment.maxSegment(tab);
        System.out.println("Longest: " + longest.length());
        System.out.println("Segment: " + longest.toString());
        System.out.println("Line: \n" + seg.toSvg());
    }
}
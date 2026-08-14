package Kadai1_1;

public class Main {
    public static void main(String[] args) {

        Figure p = new Point();
        Figure l = new Line();
        Figure c = new Circle();
        Figure t = new Triangle();
        Figure r = new Rectangle();
        Figure s = new Square();

        p.draw();
        l.draw();
        c.draw();
        t.draw();
        r.draw();
        s.draw();
    }
}
import java.util.ArrayList;
import java.util.List;

interface Shape {
    double getArea();
}

class CircleShape implements Shape {
    double r;
    CircleShape(double r) { this.r = r; }
    public double getArea() { return Math.PI * r * r; }
}

class RectShape implements Shape {
    double w, h;
    RectShape(double w, double h) { this.w = w; this.h = h; }
    public double getArea() { return w * h; }
}

class TriangleShape implements Shape {
    double b, h;
    TriangleShape(double b, double h) { this.b = b; this.h = h;}
    public double getArea() {return 0.5 * b * h;}
}


public class Question7 {
    public static void main(String[] args) {
        // List of the Interface type
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new CircleShape(5));
        shapes.add(new RectShape(4, 5));
        shapes.add(new TriangleShape(4,5));

        // Polymorphic Loop
        for (Shape s : shapes) {
            // Java knows which getArea() to call
            System.out.printf("Area: %.2f\n", s.getArea());
        }
    }
}
class Circle {
    protected double radius; // protected so child can access

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius); // Call parent constructor
        this.height = height;
    }

    // OVERRIDDEN method
    @Override
    public double getArea() {
        // Surface area of a cylinder:
        // 2πr² + 2πrh
        return 2 * Math.PI * radius * radius
                + 2 * Math.PI * radius * height;
    }

    public double getVolume() {
        // Reuse the parent's getArea logic!
        return super.getArea() * height;
    }
}

public class Question6 {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(5, 10); // radius 5, height 10
        System.out.printf("Cylinder Volume: %.2f\n", cyl.getVolume());

        System.out.printf("Cylinder Area: %.2f\n", cyl.getArea());
    }
}


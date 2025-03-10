package homework29.shapes;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaShape() {
        return PI * radius * radius;
    }

    @Override
    public double perimeterShape() {
        return 2 * PI * radius;
    }
}




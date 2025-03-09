package homework29;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double areaShape() {
        return width * height;
    }

    @Override
    public double perimeterShape() {
        return 2 * (width + height);
    }
}
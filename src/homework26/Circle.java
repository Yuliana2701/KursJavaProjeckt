package homework26;

public class Circle  extends Shape{
    private double radius;
    public static final double constantPi = 3.14;

    public Circle(String name, double radius, String color) {
        super(name,color);
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public void calculateArea(double radius){
        double area =  constantPi * radius * radius;
        System.out.println("Площадь круга: " + area);

    }
}

package homework29.shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Площадь круга: " + circle.areaShape());

        System.out.println("\n========================================");

        Rectangle rectangle = new Rectangle(6.0, 7.0);

        System.out.println("Площадь прямоугольника: " + rectangle.areaShape());

        System.out.println("\n========================================");
        Triangle triangle = new Triangle(5.0, 10.0, 7.0, 12.0, 13.0);
        System.out.println("Площадь треугольника: " + triangle.areaShape());
        System.out.println("Периметр треугольника: " + triangle.perimeterShape());

        System.out.println("\n========================================");


        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(6.0, 7.0);
        shapes[2] = new Triangle(5.0, 10.0, 7.0, 12.0, 13.0);
        double totalArea = 0;
        double totalPerimeter = 0;


        for (Shape shape : shapes) {
            totalArea += shape.areaShape();
            totalPerimeter += shape.perimeterShape();
        }


        System.out.println("Общая площадь всех фигур: " + totalArea);
        System.out.println("Общий периметр всех фигур: " + totalPerimeter);
    }
}




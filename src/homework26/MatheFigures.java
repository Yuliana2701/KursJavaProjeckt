package homework26;

public class MatheFigures {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Прямоугольник ", 5,7," yellow");
        rectangle.displayInfo();
        rectangle.calculateArea(5, 7);

        System.out.println("\n===========================================");

        Circle circle = new Circle("Круг ", 7, "green");
        circle.displayInfo();
        circle.calculateArea(7);

    }
}

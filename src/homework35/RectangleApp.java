package homework35;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1.0, 1.0);
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        Rectangle rectangle2 = new Rectangle(2.0, 6.0);
        Rectangle rectangle3 = new Rectangle(1.0, 1.0);
        System.out.println(rectangle.toString());
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(rectangle3.toString());


        System.out.println("rectangle.equals(rectangle3): " + rectangle.equals(rectangle3)); // Должно быть true
        System.out.println("rectangle1.equals(rectangle3): " + rectangle1.equals(rectangle3)); // Должно быть false
        System.out.println("rectangle2.equals(rectangle3): " + rectangle2.equals(rectangle3));
        System.out.println("rectangle.equals(rectangle1): " + rectangle.equals(rectangle1));

    }

}

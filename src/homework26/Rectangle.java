package homework26;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String name, double width, double height,String color) {
        super(name,color);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setDimensions(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void calculateArea(double width, double height){
        double  area = width * height;
        System.out.println("Площадь прямоугольника " + area);


    }
}

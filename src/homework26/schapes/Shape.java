package homework26.schapes;

public class Shape {
    protected String name;
    protected String color;

    public Shape(String name,String color) {
        this.name = name;
        this.color = color;
    }
    public void displayInfo(){
        System.out.println("name: " + name + "color: " + color);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}


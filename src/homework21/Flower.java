package homework21;

public class Flower {
    String name;
    int size;

    public Flower(String name, int size) {
        this.name = name;
        this.size = size;

    }

    public void info() {
        System.out.println("Flower: " + name + " , size: " + size + "cm");
    }

    public void watering() {
        System.out.println("После полива я росту!");
        this.size++;
    }

    public void nowSize() {
        if (size == 2) {
            System.out.println("Я выросла. Мой рост сейчас: " + size + "cm");
        }

    }
}
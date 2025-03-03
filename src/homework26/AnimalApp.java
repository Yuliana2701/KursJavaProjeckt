package homework26;

public class AnimalApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Felix ", 5, "Pers", 3);
        System.out.println(cat.toString());

        Dog dog = new Dog("Rex ", 7, "Pitbul", 7);
        System.out.println(dog.toString());

    }
}

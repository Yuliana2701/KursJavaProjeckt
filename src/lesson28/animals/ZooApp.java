package lesson28.animals;

public class ZooApp {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.voice();// унаследовал от Animal
        System.out.println(cat.toString());
        cat.eat();// метод класса Cat

        System.out.println("\n===============================");

        Dog dog = new Dog();
        dog.voice();//если в потомке не переопределен метод,то будет вызвана реализация метода родителя
        System.out.println(dog.toString());

        System.out.println("\n===============================");
        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster.toString());

        System.out.println("\n===============================");

        Object object = new Object();

    }

}

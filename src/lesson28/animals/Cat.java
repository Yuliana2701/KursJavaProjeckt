package lesson28.animals;

public class Cat extends Animal {
    //Уникальный функционал кота
    public void eat(){
        System.out.println("Cat eat");
    }
    // переопределение родительского метода voice
    //аннотация указывает,что метод переопределяет родительский метод
    @Override
    public void voice(){
        System.out.println("Cat say MEOW!");
    }
}

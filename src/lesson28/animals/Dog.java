package lesson28.animals;

public class Dog extends Animal {
    @Override
    public void voice(){
        //обращение к обьекту родителя и вызов его реализации методом voice
        super.voice();
    }
    @Override
    public String toString(){
        return super.toString() + " | Dog. Дополнение реализации родительского метода";
    }
}

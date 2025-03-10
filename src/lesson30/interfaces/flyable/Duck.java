package lesson30.interfaces.flyable;
//множественная реализация интерфейсов
public class Duck implements Flyable,Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swimm() {
        System.out.println("Duck swimming");

    }

    //Class B extends A, A extends C; != class B extends A, C;
}

package homework28.vehicle;

public class Bicycle extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Велосипед не имеет двигателя! Запуск не возможен!");
    }
}
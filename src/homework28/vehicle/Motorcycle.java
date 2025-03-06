package homework28.vehicle;

class Motorcycle extends Vehicle {
    // Переопределяем метод startEngine для мотоцикла
    @Override
    public void startEngine() {
        System.out.println("Мотоцикл запускает двигатель.");
    }
}
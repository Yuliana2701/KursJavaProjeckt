package lesson30.interfaces.flyable;

public class Application {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(50);
        Duck duck = new Duck();
        duck.fly();
        duck.swimm();

        Flyable[] flyables = new Flyable[2];
        flyables[0] = duck;
        flyables[1] = airplane;

        for (int i = 0; i < flyables.length; i++){
            Flyable flyable = flyables[i];

            flyable.fly();

            //Проверяем возможность приведения ссылки к типу интерфейса
            if (flyable instanceof Swimmable){
                System.out.println("огу привести этот обьект к Swimmable");
                Swimmable swimmable = (Swimmable) flyable;
                swimmable.swimm();
                System.out.println("============================\n");

            }
            //Проверяем возможность приведения ссылки к типу класса

            if (flyable instanceof  Airplane){
                System.out.println("Могу привести к классу Airplane");
                Airplane airplaneLink = (Airplane) flyable;
                System.out.println("Вместимость: " + airplaneLink.capacity);
                airplaneLink.takePassenger();
                System.out.println("ол-во пассажиров: " + airplaneLink.amountPassengers);
            }
        }
    }
}

package lesson27;
/*
    Ассоциация- это связь при которой один обьект связан с другим.Это наиболее общая форма связи.

    Агрегация-форма ассоциациации,представляющая собой отношение часть-целое,
    где часть может существовать независимо от целого.

    Композиция-это более жесткая форма агрегации(тоже отношение часть-целое),но где часть
    не может существовать без целого.
    Обычно часть создается вместе с целым.Если целое уничтожается,часть так же уничтожается.
    (жизненные циклы обьектов)

    Ассоциации (в том числе и Агрегация и Композиция)реализуются через создание ссылок в классе
     на другие обьекты. Это значит,что класс содержит поля,которые ссылаются на обьеты других классов.

     Ассоциация - это отношение между двумя классами,где один класс использует другой класс,
     в качестве одного из своих полей.

     Автобус имеет Bодителя.HAS-A. Агрегация.Водитель может существовать отдельно от автобуса.


     Автобус имеет Aвтопилот.HAS-A.Композиция.Автопилот является неотемлимой часть автобуса,
     то есть жесткая/ неразрывная связь.Часть создается вместе с целым.

     Важные аспекты ассоциации:

     Направленность.Ассоциация может быть однонаправленная или двунаправленная.
     Кардинальность связи.Определяет сколько обьектов одного класса может быть ассоциировано с обьектом.

     1.One-to-One(один к одному) Автобус и двигатель,каждый автобус может иметь только один двигатель
     и на каждый двигатель приходится только один автобус.

     2.One-to-Many(один ко многим) Автобус и список пассажиров.Один автобус может иметь сразу множество пассажиров,
     но со сторононы пассажира,он может быть только в одном автобусе.

     3.Many-to-Many(многие ко многим) Список автобусов и список автобусных остановок.Каждый автобус останавливается
      на множестве остановок и на каждой остановке может обслуживаться множество автобусов.



     */

import java.util.Arrays;

public class Autobus {
    private static int counter = 1;

    //уникальный(не повторяющийся)идентификатор обьекта
    private  final int id;

    private BusDriver driver;//Агрегация(мягкая связь)
    private Autopilot autopilot;//Композиция(жесткая связь)

    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;

    public Autobus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v0001");
        this.passengers = new Passenger[capacity];
    }

    @Override
    //ДЗ записать это через StringBuilder
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobus{")
                .append("id=").append(id)
                .append(", driver=").append(driver.toString())
                .append(", autopilot=").append(autopilot.toString())
                .append(", capacity=").append(capacity)
                .append('}');
        return sb.toString();
    }

    public void showListPassengers(){
        if (countPassengers == 0){
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++){
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers - 1) ? ", " : "]");

        }
        System.out.println(sb.toString());

    }

    public boolean takePasseger(Passenger passenger){
        if (passenger == null) return false;

        /*
        1.Проверить свободное место
        2.Находится ли этот пассажир в нашем автобусе
        3.Если есть место и пассажир еще не в автобусе-садим на борт:
        -добавляем его в список пассажиров
        -увеличиваем кол-во пассажиров
        -возвращаем true
        4.Иначе (3.3)- что-то пошло не так-выдаем сообщение об ошибке и возвращаем false

         */
        if (countPassengers < capacity){
            //Место есть
             //Надо проверить пункт 2
            if (isPassengerInBus(passenger)){
                //метод вернул true,значит пассажир в автобусе
                System.out.printf("Пассажир с id %d уже в автобусе id %d\n",
                        passenger.getId(), this.id);
                return false;
            }

            //Садим на борт пассажира
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир с id %d завершил посадку в автобус id %d\n",
                    passenger.getId(), this.id);
            return true;

        }
        //Свободного места в автобусе нет
        System.out.printf("В автобусе с id %d свободных мест нет!\n", this.id);
        return false;
    }

    private boolean isPassengerInBus(Passenger passenger){
        for (int i = 0; i < countPassengers; i++){
            if (passengers[i].getId() == passenger.getId()){
                //id совпали-значит один и тот же обьект
                return true;
            }
        }
        //пассажира с id таким нет в массиве пассажиров
        return false;
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }
}

package homework28.sport;
/*
Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи

У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5

В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */

public class People {
    private int speed;
    private int freeTime;

    public void run(int speed){
        System.out.println("I am run!" + speed);


    }
    public void rest( int freeTime){
        System.out.println("I need free time: " + freeTime);

    }

    public String toString(int speed,int freeTime){
        return "Человек бежит со скоростью: " + speed + " км " + " и ему нужен отдых: " + freeTime + " мин";
    }
}

package homework28.sportsmen;


/*
Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи

У человека есть метод бежать (run()).
Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе.
Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5

В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */

public class Human {

    private int runSpeed;
    private int restTime;

    protected String typeRunner = "Человек";


//    public Human(){
//
//    }

    public Human() {
        this(10, 15);
//        this.runSpeed = 10;
//        this.restTime = 15;
    }

    public Human(int runSpeed, int restTime) {
        this.runSpeed = runSpeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.printf("%s бежит со скорость %d км/ч\n", typeRunner, runSpeed);
        rest();
    }

    public void rest() {
        System.out.printf("%s нужно %d минут отдыха\n",typeRunner, restTime);
    }

    @Override
    public String toString() {
        return "Human {" +
                "runSpeed=" + runSpeed +
                ", restTime=" + restTime +
                '}';
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }


}

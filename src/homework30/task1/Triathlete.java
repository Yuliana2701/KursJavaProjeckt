package homework30.task1;

public class Triathlete implements Swimmer, Runner {
    @Override
    public void swim() {
        System.out.println("Triathlete swimming");
    }

    @Override
    public void run() {
        System.out.println("Triathlete running");
    }
}

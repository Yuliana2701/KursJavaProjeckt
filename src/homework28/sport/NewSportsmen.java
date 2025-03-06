package homework28.sport;

public class NewSportsmen extends People {
    @Override
    public void run(int speed) {
        System.out.println("Новичек бежит со скоростью: " + speed + " km ");

    }

    @Override
    public void rest(int freeTime) {
        System.out.println("И ему нужен отдых: " + freeTime + " min");
    }
}
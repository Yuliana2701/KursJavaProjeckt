package homework28.sport;

public class ProfiSportsmen extends People {
    @Override
    public void run(int speed) {
        System.out.println("Спортсмен профи бежит со скоростью: " + speed + " km ");

    }

    @Override
    public void rest(int freeTime) {
        System.out.println("И ему нужен отдых: " + freeTime + " min");

    }
}

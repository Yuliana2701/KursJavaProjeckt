package homework28.sport;

public class PeopelsApp {
    public static void main(String[] args) {
        People people = new People();
        people.toString(10,15);
        System.out.println(people.toString(10,15));

        System.out.println("\n===============================");

        NewSportsmen newSportsmen = new NewSportsmen();
        newSportsmen.run(15);
        newSportsmen.rest(10);

        System.out.println("\n===============================");

        ProfiSportsmen profiSportsmen = new ProfiSportsmen();
        profiSportsmen.run(25);
        profiSportsmen.rest(5);
    }
}

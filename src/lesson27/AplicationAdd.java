package lesson27;

public class AplicationAdd {
    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("Jon", "LN-12111111212");

        Autobus bus = new Autobus(busDriver, 15);
        System.out.println(bus.toString());

        BusDriver busDriver1 = new BusDriver("Margo", "AR-453522225");
        bus.setDriver(busDriver1);
        System.out.println(bus.toString());
        bus.showListPassengers();

        System.out.println("\n====================================");

        Passenger jon = new Passenger("Jon");
        Passenger mario = new Passenger("Mario");
        Passenger jane = new Passenger("Jane");

        System.out.println(jon.toString());
        System.out.println(mario.toString());

        bus.takePasseger(jon);
        bus.takePasseger(jon);

        bus.takePasseger(mario);

        bus.takePasseger(jane);
        bus.takePasseger(jane);

        System.out.println("Колличество пассажиров" + bus.getCountPassengers());

        bus.showListPassengers();

    }
}

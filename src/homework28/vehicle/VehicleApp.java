package homework28.vehicle;

public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();

        Bicycle bicycle = new Bicycle();
        bicycle.startEngine();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();


        System.out.println("\n=========================================");

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();
        vehicles[2] = new Motorcycle();

        for (int i = 0; i < vehicles.length; i++){
            vehicles[i].startEngine();
        }

    }
}




package lesson26.transport;
//Train is-a Bus - НЕ верно,наследоваться нельзя
public class Train extends Vehicle {

    private int capacity;
    private  int countPassengers;
    private  int countWagons;
    private final int wagonCapacity;

    public Train(String model, int year, int wagonCapacity, int countWagons) {
        super(model, year);
        this.wagonCapacity = wagonCapacity;
        this.countWagons = countWagons;
       //Определить вместимость - просчитать capacity
        calculateCapacity();
    }
    private void calculateCapacity(){
        this.capacity = countWagons * wagonCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
        calculateCapacity();
        // роконтролировать,что кол-во пассажиров не превышает новую вместимость
    }
}

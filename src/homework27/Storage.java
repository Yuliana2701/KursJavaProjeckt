package homework27;

public class Storage extends Component{
    private int capacity;

    public Storage(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Storage " + super.toString() + " | Capacity: " + capacity + " GB";
    }
}


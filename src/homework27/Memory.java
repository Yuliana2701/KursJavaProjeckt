package homework27;

public class Memory extends Component{
    private int size;
    private Computer computer;

    public Memory(String brand, String model, int size) {
        super(brand, model);
        this.size = size;
    }

    public void attachToComputer(Computer computer) {
        if (computer != null) {
            this.computer = computer;
        } else {
            throw new IllegalArgumentException("Memory can only be attached to a Computer");
        }
    }

    @Override
    public String toString() {
        return "Memory " + super.toString() + " | Size: " + size + " GB";
    }
}
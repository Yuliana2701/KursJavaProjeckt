package homework27;

public class Processor extends Component{
        private double speed;
        private Computer computer;

        public Processor(String brand, String model, double speed) {
            super(brand, model);
            this.speed = speed;
        }

        public void attachToComputer(Computer computer) {
            if (computer != null) {
                this.computer = computer;
            } else {
                throw new IllegalArgumentException("Processor can only be attached to a Computer");
            }
        }

        @Override
        public String toString() {
            return "Processor " + super.toString() + " | Speed: " + speed + " GHz";
        }
    }


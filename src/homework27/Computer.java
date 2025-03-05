package homework27;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;

        this.processor.attachToComputer(this);
        this.memory.attachToComputer(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer with:\n");
        sb.append(processor).append("\n");
        sb.append(memory).append("\n");
        sb.append(storage);
        return sb.toString();
    }
}


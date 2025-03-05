package homework27;

public class MethodMain {
    public static void main(String[] args) {

        Processor processor = new Processor("Intel", "Core i9", 3.5);
        Memory memory = new Memory("Corsair", "Vengeance LPX", 16);
        Storage storage = new Storage("Samsung", "970 Evo", 1024);

        Computer computer = new Computer(processor, memory, storage);


        System.out.println(computer);
    }
}


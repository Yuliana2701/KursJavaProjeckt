package homework28.sportsmen;

public class AmateurRunner extends Human {

    // Блок инициализации
    {
        typeRunner = "Любитель";
    }

    public AmateurRunner() {
        super(15, 10);

    }

    public AmateurRunner(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }


}

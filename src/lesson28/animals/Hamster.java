package lesson28.animals;

public class Hamster extends Animal {
    //ничего не переопределяем в этом классе,получаем реализацию всех родительских методов по наследству


    @Override
    //Переопределение метода родителя(Animal)
    public String toString() {
        return "Hamster!";
    }
}

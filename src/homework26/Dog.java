package homework26;

public class Dog extends Animal{
    private int weight;
    public Dog(String name, int age, String breed, int weight) {
        super(name, age, breed);
        this.weight = weight;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String toString() {
        return "Животное: " + getName() + "Возраст: " + getAge() + " лет " + "порода: " + getBreed() + " вес " + getWeight() + " kg";
    }
}

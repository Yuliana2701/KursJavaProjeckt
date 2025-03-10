package lesson30.interfaces.flyable;

public class Boat implements Swimmable{
    @Override
    public void swimm() {
        System.out.println("Boat swimming");
    }
}

package homework47;



import java.util.List;
import java.util.stream.Collectors;

public class PersonApp {
    private static List<Person> getListPerson() {
        return List.of(
                new Person("Igor", "Berlin", 32),
                new Person("Petr", "Unna", 25),
                new Person("Anna", "Dortmund", 27),
                new Person("Max", "Berlin", 18)
        );
    }

    public static void main(String[] args) {
        List<Person> people = getListPerson();

        List<Person> filteredPeople = people.stream()
                .filter(person -> person.getAge() > 25)
                .filter(person -> person.getCity().equals("Berlin"))
                .collect(Collectors.toList());

        System.out.println(filteredPeople);
    }
}






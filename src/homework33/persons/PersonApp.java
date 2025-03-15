package homework33.persons;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("test@mail.com", "qwerty1!");

        person.setEmail("test@ma1.1il.net");

        System.out.println(person);
        // Тестируем пароль
        System.out.println("Password valid: " + person.getPassword()); // true
    }
}






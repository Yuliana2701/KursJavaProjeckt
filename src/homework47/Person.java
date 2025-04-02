package homework47;

public class Person {
    /*
    Task 3
Дан список Person с полями name, age, city.
 Используйте Stream API для фильтрации людей,
 которые старше определенного возраста и проживают в определенном городе,
 а затем соберите их в список.
     */

    private String name;
    private String city;
    private int age;

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return "Person{name='" + name + "', city='" + city + "', age=" + age + "}";
    }
}
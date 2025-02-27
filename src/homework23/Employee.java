package homework23;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String info() {
        String result = String.format("Employee: %s, age: %d, salary: %.2f$ v chas\n", name, age, salary);
        return result;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Сотрудник должен быть совершеннолетний! ");
            return;

        }
        if (age > 40) {
            System.out.println("Ошибка: возраст сотрудника не должен превышать 40 лет!");
            return;
        }
        this.age = age;

    }

}




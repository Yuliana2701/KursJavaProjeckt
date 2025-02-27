package homework23;

public class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String info() {
        String result = String.format("Employee: %s, age: %d, salary: %d$ v chas\n", name, age, salary);
        return result;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
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




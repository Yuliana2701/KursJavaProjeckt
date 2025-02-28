package homework23;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private int hourWorked;

// сделали конструктор
    public Employee(String name, int age, double salary, int hourWorked) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hourWorked = hourWorked;
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

    public int getHourWorked(){
        return hourWorked;
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
    public void setSalary(int hourWorked){
        this.hourWorked = hourWorked;
        if (hourWorked == 8){
            salary = (salary + 0.50) * hourWorked;

        }else {
            salary  = salary * hourWorked;
        }
    }
}









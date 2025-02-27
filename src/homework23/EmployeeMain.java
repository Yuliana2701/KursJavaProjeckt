package homework23;

public class EmployeeMain {
    public static void main(String[] args){
        Employee employee = new Employee("Max", 28, 12.45, 8);
        System.out.println(employee.info());

        int employeeAge = employee.getAge();
        System.out.println("Vozrast employee: " + employeeAge);
        System.out.println("Zarplata employee: " + employee.getSalary() + "$ v chas");
        System.out.println("Name " + employee.getName());
        System.out.println("Рабочий день: " + employee.getHourWorked());

        System.out.println("\n====================================");

        employee.setAge(5);
        employee.setAge(45);
        employee.setAge(-10);


        System.out.println("\n====================================");
        employee.setSalary(8);
        System.out.println("Zarplata : $" + employee.getSalary());










    }
}

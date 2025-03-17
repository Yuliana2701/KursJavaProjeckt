package lesson35.equals;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private String dateOfBirch;

    public Employee(String firstName, String lastName, String dateOfBirch) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirch = dateOfBirch;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirch() {
        return dateOfBirch;
    }

    public void setDateOfBirch(String dateOfBirch) {
        this.dateOfBirch = dateOfBirch;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirch='" + dateOfBirch + '\'' +
                '}';
    }
    //Прописываю логику сравнения ЭТОГО (this) обьекта с другим обьектом любого типа данных
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;//еременные ссылаются на один и тот же обьект

        if (!(obj instanceof Employee)) return false;// проверка на возможность привести к Employee
        Employee employee = (Employee) obj;

        //сравниваю значение полей,которые должны быть равными,для признания обьектов равными
        return firstName.equals(employee.firstName) && lastName.equals(employee.lastName) &&
                dateOfBirch.equals(employee.dateOfBirch);
        //firstName.equals(employee.firstName)-> при таком сравнении возможно появление NPE
        //null.equals(employee.firstName) ->аварийное завершение программы
        //Objects.equals(null, employee.firstName)-> просто вернет false

    }


}

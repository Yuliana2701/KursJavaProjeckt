package homework21;

public class MainStudent {
    public static void main(String[] args){
        Student myStudent = new Student("Yuliana", "Economist", 18, 5);
        myStudent.infoStudent();

        myStudent.nextYear();
        myStudent.infoStudent();

        myStudent.yearEnd();
        myStudent.infoStudent();
    }
}

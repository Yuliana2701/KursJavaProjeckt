package homework21;

public class Student {
    String name;
    String profession;
    int age;
    int studyYears;

    public Student(String name, String profession, int age, int studyYears) {
        this.name = name;
        this.profession = profession;
        this.age = age;
        this.studyYears = studyYears;
    }

    public void infoStudent() {
        System.out.println("Меня зовут: " + name + " я учусь на " + profession + " мне " + age + " лет" + " учиться осталось " + studyYears + " лет");
    }

    public void nextYear() {
        System.out.println("Мне осталось учиться еще " + studyYears + "лет");
        studyYears--;
    }

    public void yearEnd() {
        while (studyYears > 0) {
            System.out.println("Учеба продолжается. Осталось " + studyYears + "лет.");
            studyYears--;
        }
        System.out.println("Учеба окончена! Ура!");

    }
}

package homework49;
/*
Task 1
Добавить в класс валидацию пароля.
При провале валидации выбросить исключение: PasswordValidateException

 */

public class PersonApp {

        public static void main(String[] args) {

            Person person =new Person("john@gmail.com", "John1988!");
            System.out.println(person);

            System.out.println("=============================\n");

            Person person1 =new Person("john@gmail.com", "john1988");
            System.out.println(person1);



        }



    }



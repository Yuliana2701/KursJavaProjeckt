package homework25;
/*
Task 2
Неизменяемая переменная
•	Объявите переменную final int MAX_USERS = 100;.
•	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
•	Объясните, что произошло при попытке изменения значения.
 */

public class Variable {
    public static final int MAX_USERS = 100;
    public static void main(String[] args){
        System.out.println("Variable: " + MAX_USERS);
    }

    //  MAX_USERS = 200; // Выдает ошибку, так как в задании указано ключевое слово final, значит,что переменная неизменна
}
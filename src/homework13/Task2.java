package homework13;

public class Task2 {  public static void main(String[] args) {
        /*
Task 2
Создайте строки:
- "Java"
- "is"
- "a"
- "powerful"
- "language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.

         */
    String str1 = "Java";
    String str2 = "is";
    String str3 = "a";
    String str4 = "powerful";
    String str5 = "language";

    System.out.println(str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5);

    System.out.println(str1.concat(" ").concat(str2).concat(" ").concat(str3).concat(" ").concat(str4).concat(" ").concat(str5).concat("."));

    String greeting = "Java is a powerful language";
    int lengtStr = greeting.length();
    System.out.println("lengtStr: " + lengtStr);

        /*
Task 2.2
Замените в результирующей строке слово "powerful" на "super".
Опционально Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.

         */
    String replStr = greeting.replace("powerful", "super");
    System.out.println("replStr: " + replStr);

    boolean containsAge = replStr.contains("age");
    System.out.println("Cодержит ли строка подстроку 'age' ? : " + containsAge);





}
}


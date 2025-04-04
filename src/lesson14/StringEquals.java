package lesson14;


public class StringEquals {
    public static void main(String[] args) {

        int x = 10;

        // Ссылочный тип данных. В переменной str1 хранится ссылка на область в памяти в которой находится объект типа String (значение)
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = new String("Java");

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);


        // ВАЖНО! Оператор == сравнивает значения, которые хранятся в переменных

        boolean b1 = str1 == str2;
        System.out.println("str1 == str2: " + b1); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // false
        System.out.println("str1 == str4: " + (str1 == str4)); // false
        System.out.println("str2 == str4: " + (str2 == str4)); // false

        System.out.println("\n===============\n");

        // ВАЖНО!
        // Для сравнения строк по их значению мы ДОЛЖНЫ использовать метод equals()

        boolean b2 = str1.equals(str2);
        System.out.println("str1.equals(str2): " + b2);
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equals(str4): " + str1.equals(str4));
        System.out.println("str2.equals(str4): " + str2.equals(str4));



        // Мы можем сравнивать значения игнорируя регистр букв
        System.out.println("\"java\".equalsIgnoreCase(\"JAVA\"): " + str1.equalsIgnoreCase(str3)); // java равно по значению Java



    }
}

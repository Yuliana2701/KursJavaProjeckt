package homework14;

public class Task4 {  public static void main(String[] args) {

    int a = 8;
    int b = 3;
    boolean result;

    result = (a + b) > 10;
    System.out.println("Result 1: " + result);

    result = (a - b) == 5;
    System.out.println("Result 2: " + result);

    result = (a * b) != 24;
    System.out.println("Result 3: " + result);

    result = (a / b) >= 2;
    System.out.println("Result 4: " + result);

    result = !(a % b == 2);
    System.out.println("Result 5: " + result);

        /*
        1. (a + b) > 10; - true // 11 > 10
        2. (a - b) == 5; - true // 5 == 5
        3. (a * b) != 24; - false // 24 == 24
        4. (a / b) >= 2; - true // 2.666666 > 2
        5. !(a % b == 2); - false // ! - логический тип отрицания (НЕ) 2.66666666 (НЕ) == 2
         */
}
}


package homework24;

public class Calculator {


    public static int summaMethod(int x, int y) {
        return x + y;
    }

    public static int subtractionMethod(int x, int y){
        return x - y;
    }
    public static int multiplicationMethod(int x, int y){
        return x * y;
    }
    public static int divisionMethod(int x, int y){
        return x / y;
        }

        public static boolean booleanMethod(int x, int y) {
            return !(x == 0 && y == 0);


        }


        public static void main(String[] args) {
            int x = 10;
            int y = 5;

            System.out.println("Сложение: " + summaMethod( x, y));
            System.out.println("Вычитание: " + subtractionMethod( x, y));
            System.out.println("Умножение: " + multiplicationMethod( x,y));
            System.out.println("Деление: " +divisionMethod( x, y));

            System.out.println("\n===========================================");

            if (booleanMethod(x, y)){
                System.out.println("Выполняем математические действия!");
            }else {
                System.out.println("Математические действия не выполняются!");
            }

        }

}

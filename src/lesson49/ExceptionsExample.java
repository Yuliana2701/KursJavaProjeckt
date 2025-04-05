package lesson49;

import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionsExample {

        public static void main(String[] args) {

            // Ошибки компиляции
//        int a = "Java";
//        int x = 10

            // Ошибки Runtime (время выполнения)

            // Exception (исключение) - представляют собой событие, которые могут возникнуть во время выполнения программы
            // и нарушить ее нормальное выполнение.

            // Исключение в Java является объектом определенного класса, который наследуется от класса Throwable().

            // Обработка ошибок - предусмотреть возможность появление ошибки = Exception (объекта определенного класса)
            // И написать какой-то код, который будет выполнен при возникновении ошибки

        /*
        try-catch

        try {
            // код, который может вызвать исключение.
        } catch (ExceptionType name) {
            // код для обработки исключения
            // код, который будет выполнен при возникновении объекта определенного класса
        } catch (AnotherExceptionType ex2) {
             // код обработки другого типа ошибки
        } finally {
            // код, который будет выполнен в любом случае, перед выходом из конструкции try-catch
        }

         */

            int[] array = {1, 23, 4};
//        array[10] = 100; //  java.lang.ArrayIndexOutOfBoundsException

//        int x = 10 / 0; //  java.lang.ArithmeticException

            try {
                array[2] = 10;
                System.out.println("Try continue");
//            array[10] = 100;
                System.out.println("Try continue #2");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayException: " + e.getMessage());
            } catch (Exception ex) {
                System.out.println("Какая-то ошибка");
                ex.printStackTrace();
            } finally {
                System.out.println("Finally");
            }

//        catch (ArrayIndexOutOfBoundsException exception) {
//            System.out.println("Что-то не так с индексом: " + exception.getMessage());
//        }

            System.out.println("Продолжение работы программы");

            System.err.println("Печатаю в потоке ошибок");

            System.out.println("=============\n");

            // Проверяемые (checked exception) и непроверяемые исключения

//        Проверяемые (checked exception) - это тип исключения, наличие которых вы обязаны проверить и обработать.
            // Непроверяемые исключения - это исключения, возможность появления которых я не обязан обрабатывать в коде

            String result = getUrlString();
            System.out.println("result: " + result);

            System.out.println("==============\n");

            String result2;

            try {
                result2 = getUrlString2();
            } catch (MalformedURLException e) {
                System.out.println("MalformedURLException: " + e.getMessage());
                result2 = "https://google.com";
            }

            System.out.println("result2: " + result2);


        }

        private static String getUrlString() {
            URL myUrl = null;

            // бросает проверяемое исключение

            try {
                myUrl = new URL("http://example.com");
            } catch (MalformedURLException e) {
                System.out.println("Неверный формат URL: " + e.getMessage());
                return "https://google.com";
            }

            return myUrl.toString();
        }

        // Ключевое слово throws используется в сигнатуре метода для указания, что метод может выбросить исключения
        private static String getUrlString2() throws MalformedURLException {
            URL myUrl = new URL("htt://example.com");
            return myUrl.toString();
        }
    }



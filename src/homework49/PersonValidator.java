package homework49;

import lesson49.validator.EmailValidateException;

public class PersonValidator {


        public static void validateEmail(String email) throws EmailValidateException {

            // throw - Ключевое слово используется для явного выброса исключения (создание объекта исключения)

            if (email == null) throw new EmailValidateException("email should be not null");

            // 1. Должна присутствовать @
            int indexAt = email.indexOf('@');
            int lastAt = email.lastIndexOf('@');
            if (indexAt == -1 || indexAt != lastAt) throw new EmailValidateException("@ error");

            // 2. Точка после собаки
            int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
            if (dotIndexAfterAt == -1) throw new EmailValidateException(". after @ error");

            // 3. после последней точки есть 2 или более символов
            int lastDotIndex = email.lastIndexOf('.');
            if (lastDotIndex >= email.length() - 2) throw new EmailValidateException("last . error");

            // 4. Алфавит, цифры, '-', '_', '@', '.'
        /*
        Перебираю все символы в строке. Проверяю текущий символ.
        Если нахожу хоть один "не правильный" сразу возвращаю false
         */

            // string.toCharArray() -> char[]
            for (char ch : email.toCharArray()) {


                // проверка символа на правильность
                boolean isPass = Character.isAlphabetic(ch)
                        || Character.isDigit(ch)
                        || ch == '-'
                        || ch == '_'
                        || ch == '.'
                        || ch == '@';

                // Если символ не подходит (isPass = false) возвращаем false
                if (!isPass) throw new EmailValidateException("Illegal symbol"); // делай что-то, если переменная false
            }

            // 5. До собаки должен быть хотя бы один символ. Т.е. индекс собаки не равен 0
            if (indexAt == 0) throw new EmailValidateException("@ should be not first");

            // 6. Первый символ - должна быть буква. Символ с индексом 0 должен быть буквой
            if (!Character.isLetter(email.charAt(0))) throw new EmailValidateException("first symbol should be letter");

            // Все проверки пройдены. Email подходит



        }
    /*
     Требования к паролю:
    1. Длина пароля >= 8
    2. Должна быть мин 1 цифра
    3. Должна быть мин 1 маленькая буква -> Character.isLowerCase()
    4. Должна быть мин 1 большая буква
    5. Должна быть мин 1 специальный символ: "!%$@&*()[],.-"

    Пароль должен удовлетворять ВСЕМ требованием сразу.
    5 boolean переменных. Каждая отвечает за свой пункт.
    Пароль будет подходить только если все пять - имеют true
     */

    public static void passwordValid(String password) throws PasswordValidException {
        if (password == null || password.length() < 8) throw new PasswordValidException("Пароль не должен быть больше 8 символов");

        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialSymbol = false;

        // альтернативный способ объявления переменных
        boolean[] result = new boolean[4]; // false, false, false, false

        String symbols = "!%$@&*()[],.-";

        // Перебираю символы
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) isDigit = true;
            if (Character.isUpperCase(ch)) isUpperCase = true;
            if (Character.isLowerCase(ch)) isLowerCase = true;
            if (symbols.indexOf(ch) >= 0) isSpecialSymbol = true;
//            if (symbols.contains(String.valueOf(ch))) isSpecialSymbol = true;
        }
//        System.out.printf("%s | %s | %s | %s\n", isDigit, isUpperCase, isLowerCase, isSpecialSymbol);

        // Если хотя бы одна из переменных останется в значение false, то весь пароль НЕ будет признан валидным (вернется false)
        if (!isDigit) {
            throw new PasswordValidException("Пароль должен содержать хотя бы одну цифру");
        }
        if (!isUpperCase) {
            throw new PasswordValidException("Пароль должен содержать хотя бы одну заглавную букву");
        }
        if (!isLowerCase) {
            throw new PasswordValidException("Пароль должен содержать хотя бы одну строчную букву");
        }
        if (!isSpecialSymbol) {
            throw new PasswordValidException("Пароль должен содержать хотя бы один специальный символ");
        }
    }
}






package lesson34.persons;


    public class Person {

        private String email;
        private String password;

        public Person(String email, String password) {
            setEmail(email);
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            if (isEmailValid(email)) {
                this.email = email;
            }
        }

    /*
    test@email.com.n.et
    1. Должна присутствовать @ и только одна
    2. Точка после собаки
    3. после последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '@', '.'
    5. До собаки должен быть хотя бы один символ
    6. Первый символ - должна быть буква
     */

        private boolean isEmailValid(String email) {

            // 1. Должна присутствовать @
            int indexAt = email.indexOf('@');
            int lastAt = email.lastIndexOf('@');
            if (indexAt == -1 || indexAt != lastAt) return false;

            // 2. Точка после собаки
            int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
            if (dotIndexAfterAt == -1) return false;

            // 3. после последней точки есть 2 или более символов
            int lastDotIndex = email.lastIndexOf('.');
            if (lastDotIndex >= email.length() -2) return false;

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
                if (!isPass) return false; // делай что-то, если переменная false
            }

            // 5. До собаки должен быть хотя бы один символ. Т.е. индекс собаки не равен 0
            if (indexAt == 0) return false;

            // 6. Первый символ - должна быть буква. Символ с индексом 0 должен быть буквой
            if (!Character.isLetter(email.charAt(0))) return false;

            // Все проверки пройдены. Email подходит
            return true;
        }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*
    1.Длина пароля больше или равна 8 символом+
    2.Должна быть минимум одна цифра+
    3.Должна быть минимум одна маленькая буква Character.isLowerCase();
    4.Должна быть минимут 1 большая буква
    5.Должен быть минимум один спец. символ : "!%$@&*() [],.-"+

    Пароль должен удовлетворять всем требованиям сразу.
    5 boolean переменных.Каждая отвечает за свой пункт.
    Пароль будет подходить,если все пять имеют - true
    ("qwerty1!")
     */
    private boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) return false;
        // 1.Длина пароля больше или равна 8 символам



        boolean hasDigit = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;



        // 2. Перебираем символы пароля
        for (char ch : password.toCharArray()) {
            // Проверка на цифру
            if (Character.isDigit(ch)) {
                hasDigit = true;
                System.out.println("Пароль содержит цифру: " + ch);
            }

            // Проверка на маленькую букву
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
                System.out.println("Пароль содержит маленькую букву: " + ch);
            }

            // Проверка на большую букву
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
                System.out.println("Пароль содержит большую букву: " + ch);
            }

            // Проверка на спецсимвол
            if ("!%$@&*()[],.-".indexOf(ch) != -1) {
                hasSpecialChar = true;
                System.out.println("Пароль содержит спецсимвол: " + ch);
            }
        }

        // Проверяем, выполнены ли все условия
        if (hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar) {
            System.out.println("Пароль удовлетворяет всем требованиям.");
            return true;
        } else {
            System.out.println("Пароль не удовлетворяет всем требованиям.");
            return false;
        }
    }

        @Override
        public String toString () {
            return "Person{" +
                    "email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }
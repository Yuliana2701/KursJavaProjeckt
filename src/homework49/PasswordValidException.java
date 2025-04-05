package homework49;
/*
Task 1
Добавить в класс валидацию пароля.
При провале валидации выбросить исключение: PasswordValidateException

 */

public class PasswordValidException extends Throwable {
    public PasswordValidException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password Validate Exception | " +  super.getMessage();
    }
}



package lesson34.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PersonTest {
    Person person;
    String startEmail = "jon@test.com";
    String startPassword = "qwerty1q%s";

    @BeforeEach
    void setUp(){
        person = new Person(startEmail,startPassword);

    }
    /*
    1.Беру валидный имэйл
    2.Устанавливаем его сеттером person
    3.Ожидаем: что у person в поле имэйл будет значение,которое мы установили в шаге 2
     */
    @ParameterizedTest
     @ValueSource(strings = {"valid@test.com", "test111@com.de",})
    void testValidEmailSet(String validEmail){
        person.setEmail(validEmail);

        Assertions.assertEquals(validEmail, person.getEmail());

    }

     /*
    1.Берем не валидный имэйл
    2.Устанавливаем его сеттером
    3.Ожидаемый результат:такой имэйл установлен не будет
    3.1 поле имейл у person не будет равно "не валидный имейл"
    3.2 значение поля имейл у person должно остаться прежним

     */


    @ParameterizedTest
    @ValueSource(strings = {"invalid@@test.com", "test@gmailcom.", "test#gmail.com"})
    void testInValidEmailSet(String inValidEmail) {
        String oldEmail = person.getEmail();



        person.setEmail(inValidEmail);

        Assertions.assertNotEquals(inValidEmail, person.getEmail());
        Assertions.assertEquals(oldEmail, person.getEmail());

    }


}

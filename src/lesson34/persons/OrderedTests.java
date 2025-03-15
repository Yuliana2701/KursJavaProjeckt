package lesson34.persons;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//порядок запуска тестовых методов будет определятся аннотацией  @Order
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {


    @Test
    @Order(10)
    void firstTest(){
        System.out.println("First Test");
    }
    @Test
    @Order(20)
    void secondTest(){
        System.out.println("Second Test");
    }
    @Test
    @Order(15)
    void thirdTest(){
        System.out.println("Third Test");

    }
    @Test
    void randomTest(){
        System.out.println("Random Test");
    }
}

package Consultation_13;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Copy;




    public class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        private void sayHello() {
            System.out.println("привет, меня зовут " + name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


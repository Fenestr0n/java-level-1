package oop.test;

import oop.person.Person;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 17);
        System.out.println(person);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(1, 7);
            String result = String.format("Ваше число %s", number);
            System.out.println(result);
        }



    }
}

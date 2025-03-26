package oop.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();

        ArrayList<AbleToRun> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
//        animals.add(fish);

        for (AbleToRun animal : animals) {
//            animal.eat();
            animal.run();
        }

        AbleToFly ableToFly = new Bird();
        ableToFly.fly();

        AbleToRun ableToRun = new Dog(); // автоматический upcast
        Dog dog1 = (Dog) ableToRun; // ручной downcast
    }
}

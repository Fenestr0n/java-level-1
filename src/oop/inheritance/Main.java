package oop.inheritance;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Lion lion = new Lion();
//        cat.eat();
//        lion.eat();

        Rect rect = new Rect(10, 20);
        Triangle triangle = new Triangle(10, 10,10);
        rect.showPerimeter();
        triangle.showPerimeter();
    }
}

package OOP;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 10;
        box1.length = 10;
        box1.width = 10;
        double volume = box1.height * box1.length * box1.width;
        System.out.println(volume); // 1000.0

        Box box2 = new Box();
        box2.height = 20;
        box2.length = 20;
        box2.width = 20;
        double volume2 = box2.height * box2.length * box2.width;
        System.out.println(volume2); // 8000.0

        Box box3 = box2;
        box3.width = 0;
        volume2 = box2.height * box2.length * box2.width;
        System.out.println(volume2); // 0.0

        Person john = new Person();
        john.name = "John";
        john.age = 17;
        john.weight = 70;

        Person nick = new Person();
        nick.name = "Nick";
        nick.age = 27;
        nick.weight = 80;

        Person max = new Person();
        max.name = "Max";
        max.age = 35;
        max.weight = 60;

        double sum = john.age + nick.age + max.age;
        double average = sum / 3;
        System.out.println(average);
    }
}

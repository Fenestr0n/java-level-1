package oop.person;

public class MainPerson {
    public static void main(String[] args) {
        Person john = new Person("John", 17);
//        john.name = "John";
//        john.age = 17;
//        john.weight = 70;

        Person nick = new Person("Nick", 27);
//        nick.name = "Nick";
//        nick.age = 27;
//        nick.weight = 80;

        Person max = new Person("Max", 35);
//        max.name = "Max";
//        max.age = 35;
//        max.weight = 60;

        double sum = john.getAge() + nick.getAge() + max.getAge();
        double average = sum / 3;
        System.out.println(average);

        Person person = new Person("John", 25);
//        person.age = -40;
        person.setAge(33);
        System.out.println("Name: " + person.getName() + " Age: " + person.getAge());
    }
}

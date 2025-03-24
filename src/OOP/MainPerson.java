package OOP;

public class MainPerson {
    public static void main(String[] args) {
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

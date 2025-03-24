package OOP;

public class MainDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Тузик";
        dog.breed = "Такса";
        dog.weight = 4;
        System.out.println(dog.getInfo());

        dog.speed = 10;
        dog.run();

    }
}

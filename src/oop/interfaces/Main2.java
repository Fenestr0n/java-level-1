package oop.interfaces;

public class Main2 {
    public static void main(String[] args) {
        Director director = new Director();
//        Programmer programmer = new Programmer();
        director.force(new Worker() {
            @Override
            public void work() {
                System.out.println("Работаю");
            }
        });

    }
}

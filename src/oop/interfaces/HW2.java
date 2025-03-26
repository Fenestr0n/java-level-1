package oop.interfaces;

public class HW2 {
    public static void main(String[] args) {
        Client client = new Client();
        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("Я вам принес: " + dish);
            }
        }, "Пицца");
    }
}

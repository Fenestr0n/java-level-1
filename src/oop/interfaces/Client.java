package oop.interfaces;

public class Client {
    void makeOrder(Waiter waiter, String dish) {
        waiter.bringOrder(dish);
    }
}

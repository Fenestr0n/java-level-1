package oop.box;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        WeightBox weightBox = new WeightBox(10,20);
        box.showInfo();
        weightBox.showInfo();
    }
}

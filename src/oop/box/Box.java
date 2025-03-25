package oop.box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box() {
//        this.length = 10;
//        this.width = 10;
//        this.height = 10;
        this(10);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
//        this.length = size;
//        this.width = size;
//        this.height = size;
        this(size, size, size);
    }

    public Box(Box another) {
        this(another.length, another.width, another.height);
    }

    void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Box copy() {
        return new Box(this.length, this.width, this.height);
    }

    public Box increase() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

    public int compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        int result;
        if (currentVolume > anotherVolume) {
//            System.out.println("Current > Another");
            result = 1;
        } else if (currentVolume < anotherVolume) {
//            System.out.println("Current < Another");
            result = -1;
        } else {
//            System.out.println("Current == Another");
            result = 0;
        }
        return result;
    }


    public double getVolume() {
//        double volume = length * width * height;
        return length * width * height;
    }

    public void showVolume() {
//        double volume = length * width * height;
//        System.out.println(volume);
        System.out.println(getVolume());
//        return volume;
    }
}

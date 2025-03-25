package OOP;

public class Box {
    double length;
    double width;
    double height;

    Box() {
//        this.length = 10;
//        this.width = 10;
//        this.height = 10;
        this(10);
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(double size) {
//        this.length = size;
//        this.width = size;
//        this.height = size;
        this(size, size, size);
    }

    Box(Box another) {
        this(another.length, another.width, another.height);
    }

    void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box copy() {
        return new Box(this.length, this.width, this.height);
    }

    Box increase() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

    int compare(Box another) {
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


    double getVolume() {
//        double volume = length * width * height;
        return length * width * height;
    }

    void showVolume() {
//        double volume = length * width * height;
//        System.out.println(volume);
        System.out.println(getVolume());
//        return volume;
    }
}

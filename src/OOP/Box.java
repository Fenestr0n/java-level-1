package OOP;

public class Box {
    double length;
    double width;
    double height;

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

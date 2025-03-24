package OOP;

public class MainBox {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 10;
        box1.length = 10;
        box1.width = 10;
//        double volume = box1.height * box1.length * box1.width;
        double volume = box1.getVolume();
        System.out.println(volume); // 1000.0

        Box box2 = new Box();
        box2.height = 20;
        box2.length = 20;
        box2.width = 20;
//        double volume2 = box2.height * box2.length * box2.width;
//        double volume2 = box2.getVolume();
//        System.out.println(volume2); // 8000.0
        box2.showVolume();

        Box box3 = box2;
        box3.width = 0;
//        volume2 = box2.height * box2.length * box2.width;
//        volume2 = box2.getVolume();
//        System.out.println(volume2); // 0.0
        box2.showVolume();


    }
}

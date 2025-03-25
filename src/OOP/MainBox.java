package OOP;

public class MainBox {
    public static void main(String[] args) {
        Box box1 = new Box();
//        box1.height = 10;
//        box1.length = 10;
//        box1.width = 10;
//        box1.setDimens(10, 10, 10);
//        double volume = box1.height * box1.length * box1.width;
        double volume = box1.getVolume();
        System.out.println(volume); // 1000.0

        Box box2 = new Box(20,20,20);
//        box2.height = 20;
//        box2.length = 20;
//        box2.width = 20;
//        box2.setDimens(20,20,20);
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

        Box current = new Box(10);
        Box another = new Box(20);
        int result = current.compare(another);
        System.out.println(result);

        Box current2 = new Box(5);
        Box another2 = new Box(current2);
        current2.showVolume();
        another2.showVolume();

        Box current3 = new Box(3);
        Box another3 = current3.copy();
        current3.showVolume();
        another3.showVolume();

        Box current4 = new Box(2);
        Box another4 = current4.increase();
        current4.showVolume();
        another4.showVolume();
    }
}

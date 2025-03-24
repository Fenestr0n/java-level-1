package HelloWorld;

public class IntegerTypes {
    public static void main(String[] args) {
        long speed = 300_000;
        long distance = 365 * 24 * 60 * 60 * speed;
        System.out.println(distance);

        byte b = 127;
//        b = b + 1; // ошибка, правая часть выражения приводится к int
        b++;
        System.out.println(b); // -128

        b = 10;
        b = (byte) (b + 10);
        System.out.println(b);

        byte a = 10;
        int c = a;

        int e = 1;
        byte f = (byte) e; // явное приведение типа
    }
}

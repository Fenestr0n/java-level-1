package oop.math;

public class MainMath {
    public static void main(String[] args) {
//        Math math = new Math();
        System.out.println(MyMath.multiple(10, 5));
        System.out.println(MyMath.multiple(10.8, 5.2));
        System.out.println(MyMath.multiple(4));

        System.out.println(Math.min(5, 7));

        System.out.println(MyMath.length(3));

        System.out.println(MyMath.sum(1, 2, 3, 4, 5, 6, 777));

    }
}

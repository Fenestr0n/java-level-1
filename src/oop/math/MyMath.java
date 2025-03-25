package oop.math;
/*
 * В программе мы можем использовать методы с одним и тем же именем,
 * но с разными типами и/или количеством параметров.
 * Такой механизм называется перегрузкой методов (method overloading).
 * */

public class MyMath {
    private static final double PI = 3.14;

//    Аргументы переменной длины
    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double length(double radius) {
        return 2 * PI * radius;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }

    public static double multiple(double a, double b) {
        return a * b;
    }

    public static int multiple(int a) {
        return a * a;
    }
}

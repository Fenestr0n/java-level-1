package oop.math;
/*
 * В программе мы можем использовать методы с одним и тем же именем,
 * но с разными типами и/или количеством параметров.
 * Такой механизм называется перегрузкой методов (method overloading).
 * */

public class MyMath {
    static int multiple(int a, int b) {
        return a * b;
    }

    static double multiple(double a, double b) {
        return a * b;
    }

    static int multiple(int a) {
        return a * a;
    }
}

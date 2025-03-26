package oop.exceptions;

public class HW {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        try {
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println("Выход за пределы массива");
        }

    }
}

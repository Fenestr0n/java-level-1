package oop.exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        try {
            int b = 7 / a;
            int c = Integer.parseInt("abcde");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
//        } catch (NumberFormatException e1) {
//            System.out.println("NumberFormatException");
        } catch (Exception e) {
            System.out.println("Поймано исключение " + e.getClass());
        }
        System.out.println("Hello");
    }
}

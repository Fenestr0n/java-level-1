package HelloWorld;

public class WhatToDo {
    public static void main(String[] args) {
        boolean isGoodWeather = false;
        boolean isNight = false;
        if (isNight) {
            System.out.println("Спать");
        }
        if (!isNight && isGoodWeather) {
            System.out.println("Гулять");
        }
        if (!isNight && !isGoodWeather) {
            System.out.println("Читать книгу");
        }
    }
}

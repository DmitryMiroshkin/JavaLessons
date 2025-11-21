package Lessons7;

public class WhatToDo {
    static void main() {
        int time = 21;
        boolean goodWeather = true;
        boolean badWeather = false;
        boolean isNigth = time > 22 || time < 6;
        if (goodWeather && !isNigth) {
            System.out.println("Гулять");
    } else if (badWeather && !isNigth) {
            System.out.println("Читать книгу");
        } else if (isNigth) {
            System.out.println("Спать");

        }

    }
}

package com.javarush.balykova;

import java.util.Scanner;

public class AppConsoleRunner {
    public static void main(String[] args) {
        System.out.println("Выбери команду: ");

        Scanner input = new Scanner(System.in);

        MainApp mainApp = new MainApp();
        Result result = mainApp.run(args);
        System.out.println(result);
    }
}

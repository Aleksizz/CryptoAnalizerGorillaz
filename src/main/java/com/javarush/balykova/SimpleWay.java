package com.javarush.balykova;

import com.javarush.balykova.controller.AppConsole;
import com.javarush.balykova.controller.MainController;
import com.javarush.balykova.controller.Menu;



import java.util.Scanner;

public class SimpleWay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu(input);
       MainController mainController = new MainController();
        AppConsole application = new AppConsole(mainController, menu);
        //run console app
        application.run();

    }



}

package com.javarush.balykova;

import java.util.Arrays;

public class MainApp {
    private Controller controller;

    public MainApp() {
        controller = new Controller();
    }
    public  Result run(String[] args){

        if(args.length >0) {
            String action = args[0];
            String[] params = Arrays.copyOfRange(args, 1, args.length);


            Result result = controller.doAction(action, params);

        }
        throw new AppException("No args");
    }
}

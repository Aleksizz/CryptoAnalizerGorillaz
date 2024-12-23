package com.javarush.balykova.controller;


import com.javarush.balykova.actions.Result;
import com.javarush.balykova.constants.Constants;
import com.javarush.balykova.constants.ResultStatuses;

import java.util.Arrays;

public class AppConsole {


    private final MainController mainController;
    private final Menu menu;

    public AppConsole(MainController mainController, Menu menu) {
        this.mainController = mainController;
        this.menu = menu;
    }

    public void run() {
        Result result;
        String[] args;
        do {
            args = menu.getArgs();
            result = getResult(args);
            print(result);
        } while (result.resultStatuses == ResultStatuses.SOMETHING_WENT_WRONG);
    }

    private Result getResult(String[] args) {
        String action = args[0];
        String[] parameters = Arrays.copyOfRange(args, 1, args.length);
        return mainController.doAction(action, parameters);
    }

    private void print(Result result) {
        String message = switch (result.resultStatuses) {
            case FINISHED_SUCCESS -> String.format(
                    Constants.OK, result.message
            );
            case SOMETHING_WENT_WRONG -> String.format(
                    Constants.INCORRECT_SELECTION, result.message
            );
            case JUST_EXIT -> String.format(
                    Constants.JUST_FINISH_NO_CHANGES, result.message
            );
        };
        System.out.println(message);
    }
}

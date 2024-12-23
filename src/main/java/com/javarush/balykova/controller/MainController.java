package com.javarush.balykova.controller;


import com.javarush.balykova.actions.Result;
import com.javarush.balykova.constants.ResultStatuses;
import com.javarush.balykova.exception.AppCustomException;


public class MainController {
    public Result doAction(String actionName, String[] parameters) {
        Action action = AppAction.get(actionName);
        try {
            return action.execute(parameters);
        } catch (NumberFormatException | AppCustomException e) {
            return new Result(ResultStatuses.SOMETHING_WENT_WRONG, e.getMessage());
        }
    }

}

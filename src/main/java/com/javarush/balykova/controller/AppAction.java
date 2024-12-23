package com.javarush.balykova.controller;

import com.javarush.balykova.actions.*;
import com.javarush.balykova.constants.Constants;
import com.javarush.balykova.exception.AppCustomException;


public enum AppAction {
    ENCODE(new EncodeAct()),
    DECODE(new DecodeAct()),
    BRUTEFORCE(new BruteForceAct()),
    EXIT(new Exit());

    private final Action action;

    AppAction(Action action) {
        this.action = action;
    }

    public static Action get(String actionName) {
        try {
            AppAction value = AppAction.valueOf(actionName.toUpperCase());
            return value.action;
        } catch (IllegalArgumentException e) {
            String message = String.format(Constants.NOT_FOUND_ACTION_FORMAT, actionName);
            throw new AppCustomException(message, e);
        }
    }
}


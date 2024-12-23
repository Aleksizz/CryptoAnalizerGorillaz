package com.javarush.balykova.controller;


import com.javarush.balykova.actions.Result;

public interface Action {
    Result execute(String[] parameters);
}

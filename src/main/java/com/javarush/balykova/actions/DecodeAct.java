package com.javarush.balykova.actions;

public class DecodeAct extends AbstractAct {

    @Override
    public Result execute(String[] parameters){
        String input = parameters[0];
        String output = parameters[1];
        int step = Integer.parseInt(parameters[2]);
        return changeText(input, output, step -1);
    }
}

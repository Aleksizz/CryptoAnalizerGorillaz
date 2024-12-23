package com.javarush.balykova.actions;

import com.javarush.balykova.constants.Constants;
import com.javarush.balykova.constants.ResultStatuses;

public class Exit extends AbstractAct {

    @Override
    public Result execute(String[] parameters){
        return new Result(ResultStatuses.JUST_EXIT, Constants.JUST_FINISH_NO_CHANGES);
    }
}

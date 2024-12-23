package com.javarush.balykova.actions;

import com.javarush.balykova.constants.ResultStatuses;

public class Result {

    public final ResultStatuses resultStatuses;
    public final String message;

    public Result(ResultStatuses resultStatuses, String message) {
        this.resultStatuses = resultStatuses;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultStatus=" + resultStatuses +
                ", resultFile='" + message + '\'' +
                '}';
    }
}

package com.javarush.balykova.exception;

public class AppCustomException extends  RuntimeException{

    public AppCustomException(String message) {
        super(message);
    }

    public AppCustomException(String message, Throwable cause) {
        super(message, cause);
    }

}

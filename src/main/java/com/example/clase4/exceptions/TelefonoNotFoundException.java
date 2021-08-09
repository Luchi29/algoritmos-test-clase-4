package com.example.clase4.exceptions;

public class TelefonoNotFoundException extends RuntimeException{

    public TelefonoNotFoundException(String message) {
        super(buildMessage(message));
    }

    private static String buildMessage(String message){
        return message;
    }
}

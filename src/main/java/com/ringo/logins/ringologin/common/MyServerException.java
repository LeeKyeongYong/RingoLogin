package com.ringo.logins.ringologin.common;

public class MyServerException extends RuntimeException{
    int status;
    String message;

    public MyServerException(int status,String message){
        super(message);
        this.status=status;
    }
}

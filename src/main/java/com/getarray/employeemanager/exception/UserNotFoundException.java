package com.getarray.employeemanager.exception;

public class UserNotFoundException extends RuntimeException  {
    public UserNotFoundException(String message){
        super(message);
    }
}

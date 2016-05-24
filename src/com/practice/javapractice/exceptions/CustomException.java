package com.practice.javapractice.exceptions;

/**
 * Created by vaibhavr on 14/04/16.
 */

//This is a custom exception
public class CustomException extends Exception {

    private String description;

    public CustomException(String description){
        super(description);
    }

}

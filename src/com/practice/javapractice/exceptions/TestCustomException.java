package com.practice.javapractice.exceptions;

/**
 * Created by vaibhavr on 14/04/16.
 */
public class TestCustomException {

    public static void main(String[] args) throws CustomException{
        int age = 17;
        try{
            if(age < 18){
                throw new CustomException("Entry not allowed");
            }else{
                System.out.println("We are cool!");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}

package com.practice.javapractice.exceptions;

/**
 * Created by vaibhavr on 30/03/16.
 */
public class TestReturn {

    public static void main(String[] args){
        TestReturn obj = new TestReturn();
        obj.checkFinally();
    }

    public int checkFinally(){
        try{
            System.out.println("I am currently in try block");
            throw new Exception();
            /*return 1;*/
        }catch(Exception e){
            System.out.println("I am currently in catch block");
            return -1;
        }finally {
            System.out.println("I am currently in finally block");
        }
        /*return 0;*/
    }

}

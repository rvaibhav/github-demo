package com.practice.javapractice.lambdas;

import java.util.Arrays;

/**
 * Created by vaibhavr on 15/04/16.
 */
public class TestLambdas {

    public static void main(String[] args){
        Arrays.asList("a", "b", "d").forEach( e -> {
            System.out.print( e );
            System.out.print( e );
        } );


        String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );

        final String separatorNew = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );

    }
}

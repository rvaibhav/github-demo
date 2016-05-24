package com.practice.javapractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by vaibhavr on 16/04/16.
 */
public class PracticeCollections {

    public static void main(String[] args){
        /*Set<String> mySet = new HashSet<String>();
        System.out.println(mySet.add(new String("Vicky")));
        System.out.println(mySet.add(new String("Vaibhav")));
        System.out.println(mySet.add(new String("Vishesh")));
        System.out.println(mySet.add(new String("Vishesh")));
        System.out.println(mySet.add(null));
        System.out.println(mySet.add(null));*/

        Map<String, String> myMap = new HashMap<String, String>();
        myMap.put(null, "Vaibhav");
        myMap.put(null, "Vicky");
        myMap.put(null, null);
        System.out.println(myMap);
    }

}

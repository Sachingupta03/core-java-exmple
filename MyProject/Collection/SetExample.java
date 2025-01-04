package com.sachin.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main (String[] args) {
        // Creating a Set using HashSet
        Set<String> set = new HashSet<> ();

        // Adding element
        set.add ("Apple");
        set.add ("Banana");
        set.add ("Cherry");
        set.add ("Banana"); //Duplicate element will be ignored

        // Displaying the Set
        System.out.println ("Set:" + set);

        //Iterating over the Set
        System.out.println ("Iterating using for-each loop:");
        for (String fruit : set){
            System.out.println (fruit);
        }


    }
}

package com.sachin.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main (String[] args) {
        // Creating a List using ArrayList
        List<String> list = new ArrayList<> ();
         // Adding element
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana"); // Duplicate element i allowed

        // Displaying the List
        System.out.println ("LIST:" + list);

        // Accessing element
        System.out.println ("Element at index 1:" + list.get (1));

        // Removing an element
        list.remove ("Banana");
        System.out.println ("List after removing Banana:" +list);

        //Iterating over the list
        System.out.println ("Iterating using for-each loop:");
        for (String fruit : list){
            System.out.println (fruit);
        }

    }
}

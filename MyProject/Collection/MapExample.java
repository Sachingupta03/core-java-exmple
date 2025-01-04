package com.sachin.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main (String[] args) {
        //Creating a Map using HashMap
        Map<String,Integer> map = new HashMap<> ();

        // Adding key- value Pairs
        map.put ("Apple",2);
        map.put ("Banana",3);
        map.put ("Cherry",5);

        //Displaying the Map
        System.out.println ("Map: " + map);

        // Accessing value using a key
        System.out.println ("Value for key 'Banana': " + map.get ("Banana"));

        // Removing a key-value pair
        map.remove ("Apple");

        // Displaying  the Map After removal
        System.out.println ("Map after removing 'Apple': " +map);

        // Iterating over the map(key-value pairs)
        System.out.println ("Iterating over the Map:");
        for (Map.Entry<String,Integer> entry : map.entrySet ()){
            System.out.println (entry.getKey ()+ "="+entry.getValue ());

        }

    }
}

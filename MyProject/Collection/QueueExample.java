package com.sachin.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main (String[] args) {
        //Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<> ();

        // Adding element to the Queue
        queue.add ("Apple");
        queue.add ("Banana");
        queue.add ("Cherry");

        //Displaying the Queue
        System.out.println ("Queue:" + queue);

        //Removing element (FIFO)
        System.out.println ("Removed element:" +queue.poll ());

        //Displaying the Queue after removal
        System.out.println ("Queue after poll:" +queue);

        //Iterating over the Queue
        System.out.println ("Iterating using for-each loop:");
        for (String fruit : queue){
            System.out.println (fruit);
        }

    }
}

package com.sachin.pattern;

public class ZeroOneTriangle {
    // Method to generate the Zero-One triangle pattern
    public void generatePattern (int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                //Print 1 if (i + 1) is even, else print 0
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println("");
        }
    }

    public static void main (String[] args) {
        //Example usage
        ZeroOneTriangle pattern = new ZeroOneTriangle();

        //Example: Generate a pattern with 5 rows
        pattern.generatePattern(5);
    }
}
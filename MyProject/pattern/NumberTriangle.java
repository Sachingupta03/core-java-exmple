package com.sachin.pattern;

public class NumberTriangle {
    // Method  to generate the Number Triangle pattern
    public void generatePattern (int rows){
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                // Print the colum number (j)
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        // Example usage
        NumberTriangle pattern = new NumberTriangle();

        // Example: Generate a triangle pattern with 5 rows
        pattern.generatePattern(5);
    }
}

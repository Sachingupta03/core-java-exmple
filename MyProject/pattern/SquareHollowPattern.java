package com.sachin.pattern;

public class SquareHollowPattern {
    public void printHollowSquare(int size){

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++) {

                // Print '*' for boundary,otherwise a space

                if (i == 1 || i == size || j == size){

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {

        SquareHollowPattern pattern = new SquareHollowPattern();

        int size =5;
        pattern.printHollowSquare(size);
    }
}

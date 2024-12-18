package com.sachin.pattern;

public class WhileNest {
    public WhileNest() {
     int  i = 10;
    }
    public static void main(String[] args) {
        int rows = 5, i = 1, j = 1;
        while (i <= rows) {
            while (j <= 1) {
                System.out.println("*");
                j++;
            }
            System.out.println("\n");
            i++;
            j = 1;
        }
    }
}




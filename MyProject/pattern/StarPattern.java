package com.sachin.pattern;

public class StarPattern {
    // Pseudo code
    // print below pattern
    //*
    //**
    //***
    //****
    //*****
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            int innerCounter = 0;
            while (innerCounter <= i) {

                System.out.println("*");
                innerCounter++;
            }
            System.out.println();
            i++;
        }
    }
}

package com.sachin.stringConcat;

import java.util.Scanner;

public class StringConcatenationDemo {
    //concat = connect two string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter first string ");
        String fistString = scanner.nextLine();
        System.out.println("pls enter second string ");
        String secondString = scanner.nextLine();

        System.out.println("output;" + (fistString + secondString));
    }
}
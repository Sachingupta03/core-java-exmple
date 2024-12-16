package com.sachin.Operators.IncrementDecrement;

import java.util.Scanner;

public class DecrementOperators {

    public static void main(String[] args) {
        // Pseudo code
        // Decrement Operators - accept one number from user and print(no - 1)

        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter a negative  number:");
        int no= Integer.parseInt(scanner.nextLine());

        System.out.println("entered value:" + no);
        System.out.println("decrement value:" + --no);
    }
    }

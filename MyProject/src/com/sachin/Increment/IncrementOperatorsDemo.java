package com.sachin.Increment;

import java.util.Scanner;
public class IncrementOperatorsDemo {

    public static void main(String[] args) {
        // Pseudo code
        // Increment Operators - accept one number from user and print(no + 1)

        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter a positive number:");
        int no = Integer.parseInt(scanner.nextLine());

        System.out.println("entered value:" + no);
        System.out.println("Increment value:" +no++);
    }
}

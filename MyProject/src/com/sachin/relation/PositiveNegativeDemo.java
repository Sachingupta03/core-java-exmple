package com.sachin.relation;

import java.util.Scanner;

public class PositiveNegativeDemo {

    //Pseudo code
    //identity value is positive/negative

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("pls enter the value");
        int no = Integer.parseInt(scanner.nextLine());

        //if(no > 0) {// >, <, >=, <=, !=
        if (no > 0) {// >, <, >=, <=, !=
            //what to do it - if section is true
            System.out.println("no is positive");
        } else if (no == 0) {
            System.out.println("no is zero");
        } else {
            System.out.println("no is negative");
        }
        if (0 > no) { // >, <. >=, <=, !=
            // what to do it - if section is true
            System.out.println("no is negative");
        } else if (0 == no) {
            System.out.println("no is zero");
        } else {
            System.out.println("no is positive");

        }
    }
}

package com.sachin.pattern;

import java.awt.print.PrinterException;

public class PatternInter {

        public void printPattern() {
            int rows = 5; // Number of rows
            int currentRow = 1;

            while (currentRow <= rows) {
                int stars = 1;
                while (stars <= currentRow) {
                    System.out.print("*");
                    stars++;
                }
                System.out.println(); // Move to the next line
                currentRow++;
            }
        }

        public static void main(String[] args) {
            PatternInter printer = new PatternInter();
            printer.printPattern();
        }
    }



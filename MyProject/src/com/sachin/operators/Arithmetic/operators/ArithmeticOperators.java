package com.sachin.operators.Arithmetic.operators;

import java.util.Scanner;

public class ArithmeticOperators {

    //attributes or operands
    int firstNumber = 0;

    int secondNumber = 0;

    //behavior or methods
    void addition() {
        int total = firstNumber + secondNumber;
        System.out.println("totale of 2 number is:" + total);
    }

    void subtraction() {
        int subtraction = firstNumber - secondNumber;
        System.out.println("subtraction of 2 number is:" + subtraction);
    }

    void multiplication() {
        int total = firstNumber * secondNumber;
        System.out.println("multiplication of 2 number is:" + total);
    }

    void division() {
        int division = firstNumber / secondNumber;
        System.out.println("division of 2 number is:" + division);
    }

    void modulation() {
        int modulo = firstNumber % secondNumber;
        System.out.println("Remainder enter 2 number is:" + modulo);
    }

    public static void main(String[] args) {
        System.out.println("pls enter 2 values:");
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        arithmeticOperators.firstNumber = Integer.parseInt(firstInput);
        arithmeticOperators.secondNumber = Integer.valueOf(secondInput);

        arithmeticOperators.addition(); // 5 + 4 = 9
        arithmeticOperators.subtraction(); // 5 - 4 = 1;
        arithmeticOperators.multiplication(); // 5*4 = 20;

        if (arithmeticOperators.secondNumber != 0 || arithmeticOperators.firstNumber > 0) {
            arithmeticOperators.division(); // 5/4=1
            arithmeticOperators.modulation(); // 5%4 =1
        } else {

            System.out.println("execution without division and modulation");
        }
    }
}



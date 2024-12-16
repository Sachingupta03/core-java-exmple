package com.sachin.Operators.StaticDemo;

import java.util.Scanner;

public class AdvanceStaticDemo {

    static int staticNo;
    static int nonstaticNo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter the value");
        staticNo = Integer.parseInt(scanner.nextLine());

        AdvanceStaticDemo Object1 = new AdvanceStaticDemo();
        Object1.nonstaticNo = Integer.parseInt(scanner.nextLine());
        Object1.printNo();

        AdvanceStaticDemo Object2 = new AdvanceStaticDemo();
        Object2.nonstaticNo =Integer.parseInt(scanner.nextLine());
        Object2.printNo();

        staticNo = 25;
        Object1.printNo();
        Object2.printNo();
        System.out.println("staticNo=" + staticNo);

    }

    private void printNo() {
    }

}

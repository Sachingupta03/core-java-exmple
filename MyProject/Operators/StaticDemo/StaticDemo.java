package com.sachin.Operators.StaticDemo;

public class StaticDemo {

    int no;

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        staticDemo. no = 10;
        staticDemo.printNO();

    }

    public void printNO(){
        System.out.println("Currently no's value" + no);
    }
}

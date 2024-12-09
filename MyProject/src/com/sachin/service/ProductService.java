package com.sachin.service;

import com.sachin.model.Prouct;

import java.util.Scanner;

public class ProductService {
    // void = blank
    public Prouct acceptProductData(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter product id");
       // int id = scanner.nextInt();
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("pls enter product name");
        String name = scanner.nextLine();
        System.out.println("pls ente product price");
        double price  = scanner.nextDouble();

        // initialize entity
        Prouct prouct = new Prouct();
        prouct.id = id;
        prouct.name = name;
        prouct.price = price;
        return prouct;
    }
}

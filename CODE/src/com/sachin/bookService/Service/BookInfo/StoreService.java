package com.sachin.bookService.Service.BookInfo;

import com.sachin.bookService.model.StoreInfo;

import java.util.Scanner;

public class StoreService {
    public StoreInfo acceptingStore() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter store id");
        int storeId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter book price");
        double price = scanner.nextDouble();

        System.out.println("Enter store location");
        String storeLocation = scanner.nextLine();

        // initialize entities
        StoreInfo store =new StoreInfo();

        store.storeId = storeId;
        store.price = price;
        store.storeLocation =storeLocation;

        return store;
    }
}

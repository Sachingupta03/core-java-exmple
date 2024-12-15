package com.sachin.bookService.Service.BookInfo;

import com.sachin.bookService.model.BookInfo;
import com.sachin.bookService.model.InventoryInfo;
import com.sachin.bookService.model.StoreInfo;

import java.awt.print.Book;
import java.util.Scanner;

public class BookSystemDemo {
    public static <Inventory> void main(String[] args) {
        System.out.println("*** BooK Collection Store ***");

        BookService bookService = new BookService();
        BookInfo book = bookService.acceptingBookInfo();

        InventoryService inventoryService = new InventoryService();
        InventoryInfo inventory = inventoryService.acceptingInventory();

        StoreService storeService = new StoreService();
        StoreInfo store = storeService.acceptingStore();

        // Complete all processing
        // print Data

        System.out.println("User detail are" + book);
        System.out.println("Product details are:" + inventory);
        System.out.println("Review details are:" + store);
    }
}

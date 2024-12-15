package com.sachin.bookService.Service.BookInfo;

import com.sachin.bookService.model.InventoryInfo;

import java.util.Scanner;

public class InventoryService {
     public InventoryInfo acceptingInventory(){
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter inventory id ");
         int invId = Integer.parseInt(scanner.nextLine());

         System.out.println("enter boolQuntity name");
         int bookQnt = Integer.parseInt(scanner.nextLine());

         // initialize entity
         InventoryInfo inventory = new InventoryInfo();
         inventory.invId = invId;
         inventory.bookQuantity =bookQnt;

         return inventory;
     }
}

package com.sachin.bookService.Service.BookInfo;

import com.sachin.bookService.model.BookInfo;

import java.util.Scanner;

public class BookService {
    public BookInfo acceptingBookInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Emter book name");
        String name = scanner.nextLine();

        System.out.println("Enter title name");
        String title = scanner.nextLine();

        System.out.println("Enter author name");
        String author = scanner.nextLine();

        System.out.println("Enter publication name");
        String publication = scanner.nextLine();

        System.out.println("Enter language name");
        String language = scanner.nextLine();

        //initialize entities
        BookInfo book = new BookInfo();
        book.bookId =id;
        book.Name = name;
        book.Title =title;
        book.Author= author;
        book.Publication = publication;
        book.language = language;

        return book;
    }
}

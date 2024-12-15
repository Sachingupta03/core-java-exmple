package com.sachin.bookService.model;

public class BookInfo {
    public int bookId;
    public String Name;
    public String Title;
    public String Author;
    public String Publication;
    public String language;

    @Override
    public String toString() {
        return "BookInfo{" +
                "bookId=" + bookId +
                ", Name='" + Name + '\'' +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Publication='" + Publication + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}

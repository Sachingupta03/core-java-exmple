package com.sachin.bookService.model;

public class StoreInfo {
    public int storeId;
    public double price;
    public String storeLocation;

    @Override
    public String toString() {
        return "StoreInfo{" +
                "storeId=" + storeId +
                ", price=" + price +
                ", storeLocation='" + storeLocation + '\'' +
                '}';
    }
}

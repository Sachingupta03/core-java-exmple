package com.sachin.bookService.model;

public class InventoryInfo {
    public int invId;
    public int bookQuantity;

    @Override
    public String toString() {
        return "InventoryInfo{" +
                "invId=" + invId +
                ", bookQuantity=" + bookQuantity +
                '}';
    }
}

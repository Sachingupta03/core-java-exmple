package com.sachin.model;

public class Prouct {
    public int id;
    public String name;
    public double price;

    @Override
    public String toString() {
        return "Prouct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


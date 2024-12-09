package com.sachin.model;

public class Review {
    public int id;

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", heading='" + heading + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }

    public String heading;
    public String description;
    public int rating;


}

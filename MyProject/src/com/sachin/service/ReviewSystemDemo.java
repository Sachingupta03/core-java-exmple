package com.sachin.service;

import com.sachin.model.Prouct;
import com.sachin.model.Review;
import com.sachin.model.User;

public class ReviewSystemDemo {

    public static void main(String[] args) {
        System.out.println("***E-Commerce Review Sysetm***");
        UserService userService = new UserService();
       User user = userService.acceptUserData();

        ProductService productService = new ProductService();
       Prouct prouct = productService.acceptProductData();

        ReviewService reviewService = new ReviewService();
       Review review = reviewService.acceptReviewData();

        //Completed all processing
        //print Data


        System.out.println("User detal are" + user);
        System.out.println("Product detail are" + prouct);
        System.out.println("Review detail are" + review);
    }
}


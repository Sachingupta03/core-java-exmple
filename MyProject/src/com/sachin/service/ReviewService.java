package com.sachin.service;

import com.sachin.model.Review;

import java.util.Scanner;

public class ReviewService {

    public Review acceptReviewData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter review id ");
        //int id = scanner.nextInt();
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("pls enter review heading");
        String heading = scanner.nextLine();
        System.out.println("pls enter review description");
        String description = scanner.nextLine();
        System.out.println("pls enter review rating");
        int rating = scanner.nextInt();

        //initialize entity
        Review review = new Review();
        review.id = id;
        review.heading = heading;
        review.description = description;
        return review;
    }
}

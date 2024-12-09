package com.sachin.service;

import com.sachin.model.User;

import java.util.Scanner;

public class UserService {

    public User acceptUserData(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter user id");
       //int id = scanner.nextInt();
        int id = Integer.parseInt(scanner.next());
        System.out.println("pls enter user firstname");
        String firstName = scanner.next();
        System.out.println("pls enter user lastName");
        String lastName = scanner.next();

        //initialize entity
        User user = new User();
        user.id = id;
        user.firstName = firstName;
        user.lastName = lastName;
        return user;
    }
}

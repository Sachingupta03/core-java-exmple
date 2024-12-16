package com.sachin.Operators.AccessSepcifiers.publicSepcfiers.modale;

public class Student {
     public int id; // Public fields for demo purposes
     public String name;
     public String city;

     @Override
     public String toString() {
          return "Student{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  ", city='" + city + '\'' +
                  '}';
     }
}

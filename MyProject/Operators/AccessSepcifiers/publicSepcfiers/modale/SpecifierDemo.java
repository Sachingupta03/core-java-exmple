package com.sachin.Operators.AccessSepcifiers.publicSepcfiers.modale;

import com.sachin.Operators.AccessSepcifiers.publicSepcfiers.modale.modal.Vehicle;

public class SpecifierDemo {

    public static void main(String[] args) {

        SpecifierDemo specifierDemo = new SpecifierDemo();
        SpecifierDemo.publicSpecifierDemo();
        privateSpecifireDemo();
    }

    private static void privateSpecifireDemo() {
    }

    static void publicSpecifierDemo(){
        Student student = new Student();
        student.id = 1;
        student.name = "sachin";
        student.city = "pune";


        System.out.println("Student = " + student);
    }

       private void privateSpecifierDemo(){

        Vehicle vehicle =new Vehicle();
        vehicle.setId(1);
        vehicle.setMake("Creata");
        vehicle.setMake("SUV900");
        System.out.println("Vehile=" + vehicle);

    }

}

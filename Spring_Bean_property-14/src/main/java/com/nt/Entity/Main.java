package com.nt.Entity;
public class Main {
    public static void main(String[] args) {
        // Create an Address object
        Address address = new Address("123 Main St", "Anytown", "CA", "12345");

        // Create an Employee object with the Address object as a reference
        Employee employee = new Employee(1, "John Doe", 50000.0, address);

        // Display the Employee details
        System.out.println(employee.toString());
    }
}


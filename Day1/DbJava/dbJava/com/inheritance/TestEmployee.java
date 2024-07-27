package com.inheritance;

public class TestEmployee {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp1 = new Employee(1, "John Doe", 50000);
        
        // Create a Manager object
        Manager mgr1 = new Manager(2, "Jane Smith", 70000, 10000);

        // Display Employee information
        System.out.println(emp1);

        // Display Manager information
        System.out.println(mgr1);
    }
}


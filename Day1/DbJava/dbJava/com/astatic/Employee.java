package com.astatic;

public class Employee {

    // Static variable to count the number of Employee instances
    private static int employeeCount = 0;

    // Instance variables
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        // Increment the employee count whenever a new instance is created
        employeeCount++;
    }

    // Static method to get the number of Employee instances created
    public static int getEmployeeCount() {
        return employeeCount;
    }

    // Getters and setters for instance variables
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override toString() method for easy display of Employee information
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Mark Zukerberg", 50000);
        Employee emp2 = new Employee(2, "Elon Mask", 60000);
        Employee emp3 = new Employee(3, "Bill Gates", 55000);

        // Display Employee information
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        // Display the number of Employee instances created
        System.out.println("Total number of employees: " + Employee.getEmployeeCount());
    }
}



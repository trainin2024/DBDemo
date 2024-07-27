package com.inheritance;

public class Manager extends Employee {

    // Additional instance variable for Manager
    private double bonus;

    // Constructor
    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary); // Call the constructor of the superclass (Employee)
        this.bonus = bonus;
    }

    // Getter and setter for bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Override toString() method for easy display of Manager information
    @Override
    public String toString() {
        return "Manager{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", bonus=" + bonus +
                '}';
    }
}

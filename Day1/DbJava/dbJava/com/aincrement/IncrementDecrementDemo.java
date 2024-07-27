package com.aincrement;

public class IncrementDecrementDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        // Pre-increment
        System.out.println("Pre-increment:");
        System.out.println("Value of a before pre-increment: " + a); // 10
        System.out.println("Value of ++a: " + (++a)); // 11
        System.out.println("Value of a after pre-increment: " + a); // 11
        
        // Post-increment
        System.out.println("\nPost-increment:");
        System.out.println("Value of b before post-increment: " + b); // 20
        System.out.println("Value of b++: " + (b++)); // 20
        System.out.println("Value of b after post-increment: " + b); // 21
        
        // Pre-decrement
        int x = 15;
        System.out.println("\nPre-decrement:");
        System.out.println("Value of x before pre-decrement: " + x); // 15
        System.out.println("Value of --x: " + (--x)); // 14
        System.out.println("Value of x after pre-decrement: " + x); // 14
        
        // Post-decrement
        int y = 25;
        System.out.println("\nPost-decrement:");
        System.out.println("Value of y before post-decrement: " + y); // 25
        System.out.println("Value of y--: " + (y--)); // 25
        System.out.println("Value of y after post-decrement: " + y); // 24
    }
}

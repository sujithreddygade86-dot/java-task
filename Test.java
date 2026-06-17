package com.exceptions.in;

class Handling {

    public static void tiMethod(int n) {

        try {

            System.out.println("10000");

            tilmethod(n);

            System.out.println("Coders");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public static void tilmethod(int n) {

        try {

            int result = 100 / n;

            System.out.println("Completed");

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException: " + e.getMessage());

        } finally {

            System.out.println("Finally");
        }
    }
}

public class Test {

    public static void main(String[] args) {

        System.out.println("Test Case 1");
        Handling.tiMethod(0);

        System.out.println();

        System.out.println("Test Case 2");
        Handling.tiMethod(1);

        System.out.println();

        System.out.println("Test Case 3");
        Handling.tiMethod(10);

        System.out.println();

        System.out.println("Test Case 4");
        Handling.tiMethod(15);
    }
}
package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        hello("world");
        hello("user");
        hello("Jane");

        double len = 5;
        System.out.println("area of a square with a side " + len + " = " + area(len));

        double a = 4;
        double b = 5;
        System.out.println("area of a rectangle with a sides " + a + " and " + b + " = " + area(a, b));


    }

    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + " !");
    }

    public static double area(double l) {
        return l * l;
    }

    public static double area(double a, double b) {
        return a * b;

    }
}

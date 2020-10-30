package ru.stqa.ptf.sandbox;

import org.testng.annotations.Test;

public class MyFirstProgram {

    public static void main(String[] args) {

        hello("world");
        hello("user");
        hello("Jane");

        Square s = new Square(5);
        System.out.println("area of a square with a side " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 5);
        System.out.println("area of a rectangle with a sides " + r.a + " and " + r.b + " = " + r.area());

    }

    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + " !");
    }







}

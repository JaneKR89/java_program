package ru.stqa.ptf.sandbox;

import com.sun.org.apache.regexp.internal.RE;

public class Rectangle {
    public double a;
    public double b;

    public Rectangle (double a, double b ){
        this.a = a;
        this.b = b;
    }

    public double area() {
        return this.a * this.b;

    }
}

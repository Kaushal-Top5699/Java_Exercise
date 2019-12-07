package com.company;

public class AreaCalculator {

    public static double area(double radius) {

        if (radius < 0) {

            return -1.0;

        }

        System.out.println(Math.PI*radius*radius);

        return Math.PI*radius*radius;
    }

    public static double area(double x, double y) {

        if (x < 0 || y < 0) {

            return -1.0;

        }
        System.out.println(x*y);
        return x*y;
    }

}

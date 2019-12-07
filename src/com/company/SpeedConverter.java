package com.company;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {

            return -1;

        } else {
            //1mph is 1.609kph

            return Math.round(kilometersPerHour/1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {

            System.out.println("Invalid Value");

        } else {

            long milesPerHour = toMilesPerHour(kilometersPerHour);

            System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");

        }

    }

}

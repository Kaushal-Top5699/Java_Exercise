package com.company;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0) {

            System.out.println("Invalid Value: return false");

            return false;

        } else if (barking && hourOfDay<8 || hourOfDay>22) {

            System.out.println("Wake Up: return true");

            return true;

        } else {

            System.out.println("No need to wake up: return false");

            return false;

        }
    }
}

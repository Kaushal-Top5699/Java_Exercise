package com.company;

public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c) {

        if (a>=13 && a<=19) {

            System.out.println(a+" is in the range");
            return true;

        } else if (b>=13 && b<=19) {

            System.out.println(b+" is in the range");
            return true;

        } else if (c>=13 && c<=19) {

            System.out.println(c+" is in the range");
            return true;

        }

        System.out.println("No numbers are in the range.\n");
        return false;
    }

    public static boolean isTeen(int num) {

        if (num>=13 && num<=19) {

            System.out.println("Number is teen.");
            return true;

        } else {

            System.out.println("Number is not in the range.");
            return false;

        }
    }

}

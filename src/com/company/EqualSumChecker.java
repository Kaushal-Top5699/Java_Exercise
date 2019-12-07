package com.company;

public class EqualSumChecker {

    public static boolean hasEqualSum(int a, int b, int c) {

        int result = a + b;

        if (result == c) {

            return true;

        }
        return false;
    }

}

package com.company;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        DecimalFormat df = new DecimalFormat("#.###");

        df.setRoundingMode(RoundingMode.DOWN);

        String n1 = df.format(num1);

        String n2 = df.format(num2);

        if (n1.equals(n2)) {

            System.out.println("Equal");

            return true;
        } else {

            System.out.println("Not Equal");

            return false;
        }
    }
}

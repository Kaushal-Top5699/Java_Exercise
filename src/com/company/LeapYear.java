package com.company;

public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year >=1 && year<=9999) {

            int remainder = year%4;

            if (remainder == 0) {

                int remainder2 = year%100;

                if (remainder2 != 0) {

                    //System.out.println("Year "+year+" is a leap year");//step 4
                    return true;

                } else {

                    int remainder3 = year%400;//step 3

                    if (remainder3 == 0) {

                        //System.out.println("Year "+year+" is a leap year");//step 4
                        return true;

                    } else {

                        //System.out.println("This is not a leap year(it has 365 days)");//step 5
                        return false;
                    }
                }

            } else {

                //System.out.println("This is not a leap year(it has 365 days)");//step 5
                return false;
            }
        }

        //System.out.println("Year "+year+" not in range.");
        return false;
    }

}

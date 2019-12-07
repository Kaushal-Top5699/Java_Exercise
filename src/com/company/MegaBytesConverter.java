package com.company;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {

            System.out.println("Invalid Value");

        } else {

            int toMegaBytes = kiloBytes/1024;

            int multi = toMegaBytes*1024;

            int remainder = kiloBytes%multi;

            System.out.println(kiloBytes+" KB = "+toMegaBytes+" MB and "+remainder+" KB");


        }

    }

}

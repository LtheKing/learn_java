package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else  {
            int result = kiloBytes / 1024;
            int remainKB = kiloBytes % 1024;
            System.out.println(kiloBytes+" KB = " + result + " MB and " + remainKB + " KB ");
        }
    }
}

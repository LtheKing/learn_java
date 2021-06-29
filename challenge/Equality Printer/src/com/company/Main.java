package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printEqual(1,22,2);
    }

    public static void printEqual(int bil1, int bil2, int bil3) {
        if  (bil1 < 0 || bil2 < 0 || bil3 < 0) {
            System.out.println("Invalid Value");
        } else if (bil1 == bil2 && bil2 == bil3) {
            System.out.println("All numbers are equal");
        }  else if((bil1 == bil2 && bil2 != bil3) || (bil2 == bil3 && bil3 != bil1) || (bil1 == bil3 && bil3 != bil2)) {
            System.out.println("Neither all are equal or different");
        } else  {
            System.out.println("All numbers are different");
        }
    }
}

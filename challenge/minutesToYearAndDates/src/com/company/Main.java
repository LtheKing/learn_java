package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int d = 877;
//        int y = d % 365   ;
//        System.out.println(y);
        printYearsAndDays(1788480);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long mainDays = hours % 24;
            long days = hours / 24;
            long years = days / 365;
            long mainYears = days % 365;
            if (mainYears == 0){
                System.out.println(minutes+ " min = " +years + " y and 0 d ");
            }else if(days > 365) {
                System.out.println(minutes+ " min = " +years + " y and " +mainYears+ " d ");
            } else {
                System.out.println(minutes+ " min = " +years + " y and " +days+ " d ");
            }

        }
    }
}

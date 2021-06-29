package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean result = isLeapYear(-1800);
        System.out.println(result);
        int ex = 1924;
        int res = ex % 4;
        System.out.println(res);
    }

    public static boolean isLeapYear(int year) {
        if(year >= 1 && year <=9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if(year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }

            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

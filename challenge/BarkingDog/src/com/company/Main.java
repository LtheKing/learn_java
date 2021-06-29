package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean result = shouldWakeUp(true, 8);
        System.out.println(result);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if(barking == true && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else  {
            return false;
        }
    }
}

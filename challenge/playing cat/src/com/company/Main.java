package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean result = isCatPlaying(false,35);
        System.out.println(result);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((temperature >= 25 && temperature <= 45) && (summer == true)) {
            return true;
        } else if ( (temperature >= 25 && temperature <=35) && summer == false ) {
            return true;
        } else  {
            return false;
        }
    }
}

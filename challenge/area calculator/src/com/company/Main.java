package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double hasil = area(10, 15);
        System.out.println(hasil);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        double result = (radius * radius) * Math.PI;
        return result;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        double result = x * y;
        return result;
    }

}

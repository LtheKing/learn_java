package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        long result = toMilesPerHour(10.25);
//        System.out.println(result);
        printConversion(0.0);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            long result = Math.round(kilometersPerHour / 1.609);
            return result;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long result = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +" km/h = " + result + " mi/h ");
        }
    }
}

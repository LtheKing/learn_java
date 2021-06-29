package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2;
        System.out.println("1 + 2 =" + result);
        int previousResult = result;
        System.out.println("Previous Result = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous Result = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; //1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3;
        System.out.println("30 / 3" + result);

        //result = result - 2
        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien");
            System.out.println("Iam scared of alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the top score !");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top scrore and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of condition are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error !");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to Happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
        // operators challenge created by aldi
        double first = 20.00;
        double second = 80.00;
        double together = (first + second) * 100;
        double remainder = together % 50.00;
        System.out.println(remainder);
        boolean jadi = false;
        if (remainder == 0){
            jadi = true;
        } else {
            jadi = false;
        }
        System.out.println(jadi);
        if (jadi != true){
            System.out.println("Got Some Remainder");
        } else {
            System.out.println("failed");
        }

        //the right code from udemy
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("The Remainder : " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("Is No Remainder : " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder !");
        }

    }
}

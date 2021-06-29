package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your Final Score was = " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Final Score was = " + finalScore);
        }
    }
}

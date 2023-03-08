//********************************************************************
//  Guessing.java       Java Foundations
//
//  Demonstrates the use of a block statement in an if-else.
//********************************************************************

import java.util.*;

public class HigherOrLower {
    //-----------------------------------------------------------------
    //  Plays a simple guessing game with the user.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        final int MAX = 10;
        int answer, guess;
        boolean isCorrect, isValid;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        answer = generator.nextInt(MAX) + 1;
       
        do {
            System.out.print("I'm thinking of a number between 1 and "
                + MAX + ". Guess what it is: ");
            do {
                guess = scan.nextInt();

                if(guess <= 0 || guess > MAX) {
                    System.out.println("That number is out of range please try again within 1 - 10");
                    isValid = false;
                } else {
                    isValid = true;
                }
            } while (!isValid);
            

            if (guess == answer) {
                System.out.println("You got it! Good guessing!");
                isCorrect = true;
            } else if (guess > answer) {
                System.out.println("Please choose a lower number");
                isCorrect = false;
            }else {
                System.out.println("Please choose a higher number");
                isCorrect = false;
            }

        } while(!isCorrect);
        scan.close();
    }
}

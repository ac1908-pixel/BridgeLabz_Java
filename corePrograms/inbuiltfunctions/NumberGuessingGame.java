package corePrograms.inbuiltfunctions;

import java.util.Scanner;

/*
 Program for number guessing game
*/
class NumberGuessingGame {

    // method to generate guess
    static int generateGuess(int low, int high) {
        return low + (int)(Math.random() * (high - low + 1));
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Computer Guess: " + guess);
            feedback = sc.next();

            if (feedback.equals("correct"))
                break;
            else if (feedback.equals("low"))
                low = guess + 1;
            else if (feedback.equals("high"))
                high = guess - 1;
        }
        System.out.println("Number guessed successfully!");
    }
}


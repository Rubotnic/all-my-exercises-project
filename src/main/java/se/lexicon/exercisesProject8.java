package se.lexicon;
/*
8. Write a program that first generates a random number between 1 and 500 and stores it into a variable (see the Random class).
Then let the user make a guess for which number it is. If the user types the correct number, he should be presented
with a message (including the number of guesses he has made). If he types a number that is greater or smaller
than the given number, display either “Your guess was too small” or “Your guess was too big”.
The program should keep executing until the user input the correct guess.
 */
import java.util.Random;
import java.util.Scanner;

public class exercisesProject8 {
    public void randomNumber() {

        Random number = new Random();
        int numberToGuess = number.nextInt(500);
        Scanner input = new Scanner(System.in);

        boolean win = true;

        while (win == true) {
            System.out.println("Guess a number between 1 and 500");
            int guess = input.nextInt();

            if (numberToGuess == guess) {
                System.out.println("CONGRATS! This is the right number.");
                win = false;

            } else if (numberToGuess > guess) {
                System.out.println("Your number is too low.");

            } else if (numberToGuess < guess) {
                System.out.println("Your number is too high.");
            }
        }
    }
}
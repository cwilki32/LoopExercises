package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a new project in IntelliJ named Number Guess
        // Create an int property for targetNumber and assign it a value between 1 and 10
        // Using a while loop, get user input in the console to guess a number
        // If the number guessed is equal to targetNumber, congratulate the user and end the loop
        // If the number is not equal to targetNumber, allow the loop to repeat until the user guesses the correct number
        // Bonus: Find a way to assign a random number between 1 and 10 as the value of targetNumber
        // Super Bonus: If the user inputs a number that is not between 1 and 10 tell them the input is invalid and ask for a new number

        int targetNumber = 5;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(9) + 1;
        int guess;

        System.out.println("Please guess a number between 1-10:");
        guess = scan.nextInt();

        while (guess < 1 || guess > 10) {
            System.out.println("That number is not between 1-10, please guess again:");
            guess = scan.nextInt();
        }
        while (guess != target) {
            System.out.println("Not correct, please guess again:");
            guess = scan.nextInt();

            while (guess < 1 || guess > 10) {
                System.out.println("That number is not between 1-10, please guess again:");
                guess = scan.nextInt();
            }
        }
        System.out.println("Congratulations! The answer was " + guess + ". You Guessed Correct!");
    }
}
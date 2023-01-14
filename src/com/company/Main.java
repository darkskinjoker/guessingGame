package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create random number to guess
        Random rand = new Random();
        int numberToguess = rand.nextInt(1000);
        int numberofguesses = 0;

        boolean isCorrect = false;
        Scanner input = new Scanner(System.in);
        while (isCorrect == false) {
            System.out.println(numberToguess);
            // keeps track of number of guesses
            numberofguesses ++;
            //asks user to guess number
            input = new Scanner(System.in);
            System.out.println("guess a number between 0 and 1000:");
            //let user input number
            int guess = input.nextInt();
            System.out.println("guess:" + guess);
            // tell us whether we are guessing too high or too low
            if (guess > numberToguess) {
                System.out.println("Your guess is too high");
            } else if (guess < numberToguess) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is correct");
                isCorrect =true;
            }
            //keeps playing until we guess correct number
        } System.out.println("Congratulations CORRECT ANSWER IS " + numberToguess + " YOU HAD " + numberofguesses + " TRIES");

    }
}

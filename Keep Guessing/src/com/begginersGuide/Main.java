// Guess a random number between 1-10, keep guessing till you guess right

package com.begginersGuide;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(10) + 1;

        Scanner in = new Scanner(System.in);

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.println("Your guess: ");
        int userNumber = in.nextInt();

        while (userNumber != number) {
            System.out.println("That is incorrect. Guess Again.");
            userNumber = in.nextInt();

        }
        System.out.println("That's right! You're a good guesser.");
    }
}
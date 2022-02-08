package com.begginersGuide;
import java.util.Scanner;
/*
Take a list, say for example this one:
 a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
and write a program that prints out all the elements of the list that are less than 5.

Extras:
Instead of printing the elements one by one,
make a new list that has all the elements less than 5
from this list in it and print out this new list.
Ask the user for a number and return a list that contains
only elements from the original list a that are smaller than that number given by the user.
 */
public class Main {

    public static void main(String[] args) {
        int a[] = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        int b[] = new int[a.length];

        Scanner scanObj = new Scanner(System.in);
        System.out.println("Please enter an Integer");
        int userInput = scanObj.nextInt(); // Read user input
        for (int i = 0; i < a.length; i++) { // Fill b array with values less than user input
            if (a[i] < userInput) {
                b[i] = a[i];
            }
            System.out.println(b[i]);

        }


    }
}
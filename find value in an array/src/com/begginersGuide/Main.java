/*Finding a Value in an Array
        Create an array that can hold ten integers, and fill each slot with a different random value from 1-50.
        Display those values on the screen, and then prompt the user for an integer.
        Search through the array, and if the item is present, say so. It is not necessary to display anything
        if the value was not found. If the item is in the array multiple times,
        it's okay if the program prints the message more than once.
*/
package com.begginersGuide;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] array1 = new int[10];
    Random randNum = new Random();

    for (int i = 0; i < array1.length; i++){
        array1[i] = randNum.nextInt(50 + 1);
        System.out.print(array1[i] + " ");


    }
    System.out.println("");
    System.out.print("Value to find: ");
    Scanner in = new Scanner(System.in);

    int userInput = in.nextInt();

    for (int i = 0; i < array1.length; i++){
        if (userInput == array1[i]){
            System.out.println(userInput + " is in the array.");
        }
    }

    System.out.println(userInput + " is not in the array");


    }
}

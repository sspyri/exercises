/*      Write a program that creates an array which can hold ten values.
        Fill the array with random numbers from 1 to 100.
        Display the values in the array on the screen.
        Then use a linear search to find the largest value in the array, and display that value and its slot number.
 */
package com.begginersGuide;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[10];

        int maxValue = 0;
        int slot = 0;

        Random rand = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(50 + 1);

            System.out.print(array1[i] + " ");
        }
        for (int i = 0; i < array1.length; i++){
            if (array1[i] > maxValue){
                maxValue=  array1[i] ;
                slot = i;
        }

    }   System.out.println("");
        System.out.println("The largest value is " + maxValue);
        System.out.println("It is in slot " + slot);
}
}
package com.begginersGuide;
   /* Write a method that takes a sorted array Aof integers and a key kand
        returns the index of first occurrence of k in A. Return -1 if k does not
        appear in A. Write tests to verify your code.*/

import java.util.Arrays;

public class Main {
    public static int SearchForK (int [] arr, int k){
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array = {10, 20, 30 , 15 };
        System.out.println(SearchForK(array, 6));

    }
}

package com.begginersGuide;
import java.util.Scanner;



public class Main {
    private static int binarySearch(int[] array, int start, int end, int target){
        int middle = (start + end) / 2;
        if (end < start){
            return -1;
        }
        if (target==array[middle]){
            return middle;
        }
        else if (target < array[middle]){
                return binarySearch(array, start, middle -1, target);

        }else{
            return binarySearch(array, middle+1, end, target);
        }
    }

    public static void main(String[] args) {

    }
}
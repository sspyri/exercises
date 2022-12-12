// Given an array of integers, where all elements but one occur twice, find the unique element.
package com.begginersGuide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static int lonelyInteger(List<Integer> a) {
        for (int i : a) {
            if (Collections.frequency(a, i) == 1) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 1, 2, 2, 3, 3, 4);
        System.out.print(lonelyInteger(arr));
    }
}


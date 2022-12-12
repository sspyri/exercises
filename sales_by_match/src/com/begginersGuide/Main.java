/*      There is a large pile of socks that must be paired by color.
        Given an array of integers representing the color of each sock,
        determine how many pairs of socks with matching colors there are.*/

/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */
package com.begginersGuide;

import java.util.Collections;

public class Main {
    public static int sockMerchant(int n, List<Integer> ar) {
        int sum = 0;
        Collections.sort(ar);

        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i).equals(ar.get(i + 1))) {
                sum++;
                ar.remove(ar.get(i));
                ar.remove(ar.get(i));
                i--;
            }
        }
        return sum;
    }
}
    public static void main(String[] args) {
	// write your code here
    }
}

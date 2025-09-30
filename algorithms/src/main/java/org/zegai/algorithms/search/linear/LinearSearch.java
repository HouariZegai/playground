package org.zegai.algorithms.search.linear;

import org.zegai.algorithms.Utils;

public class LinearSearch {

    public static void main(String[] args) {
        int[] array = Utils.generateRandomTable(10, 20);
        Utils.displayTable(array);

        System.out.println(10 + ":" + linearSearch(array, 10));
        System.out.println(15 + ":" + linearSearch(array, 15));
        System.out.println(0 + ":" + linearSearch(array, 0));

    }

    private static boolean linearSearch(int[] array, int target) {
        for (int j : array) { // brute force
            if (j == target)
                return true;
        }
        return false;
    }
}

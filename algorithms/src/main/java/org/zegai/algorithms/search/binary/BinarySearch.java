package org.zegai.algorithms.search.binary;

import org.zegai.algorithms.Utils;

public class BinarySearch {

    public static void main(String[] args) {
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + i * 2;
        }
        Utils.displayTable(data);

        // PS: Binary search work only in ordered table
        System.out.println(27 + ": " + binarySearch(data, 27));
        System.out.println(10 + ": " + binarySearch(data, 10));
        System.out.println(0 + ": " + binarySearch(data, 0));
    }

    private static boolean binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int middle;
        boolean isFound = false;

        while (!isFound && low <= high) {
            middle = low + (high - low) / 2;

            if (target == array[middle]) {
                isFound = true;
            } else if (target > array[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return isFound;
    }
}

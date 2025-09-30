package org.zegai.algorithms.search.interpolation;

import org.zegai.algorithms.Utils;

public class InterpolationSearch {

    public static void main(String[] args) {
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) { // use can make any numbers
            data[i] = i + i * 2;
            if (data[i] < 10)
                data[i] += 10;
        }
        Utils.displayTable(data);

        System.out.println(27 + ": " + interpolationSearch(data, 27));
        System.out.println(10 + ": " + interpolationSearch(data, 10));
        System.out.println(0 + ": " + interpolationSearch(data, 0));
    }

    public static boolean interpolationSearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int middle;
        boolean isFound = false;

        while (!isFound && low <= high) {
            middle = low + ((high - low) / (array[high] - array[low])) * (target - array[low]);

            if (target == array[middle]) {
                isFound = true;
                break;
            } else if (target > array[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }

            isFound = low == high && array[low] == target; // for last/first element case
        }

        return isFound;
    }

}

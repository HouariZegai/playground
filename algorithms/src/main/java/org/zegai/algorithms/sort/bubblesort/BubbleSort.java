package org.zegai.algorithms.sort.bubblesort;

import org.zegai.algorithms.Utils;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = Utils.generateRandomTable(15, 50);
        Utils.displayTable(array);
        bubbleSort(array);
        Utils.displayTable(array);
    }

    public static void bubbleSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }
    }
}

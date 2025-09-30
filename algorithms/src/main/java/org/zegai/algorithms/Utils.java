package org.zegai.algorithms;

import java.util.Random;

public class Utils {

    private Utils() {
    }

    public static void displayTable(int[] array) {
        System.out.print("Array:[ ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println(" ]");
    }

    public static int[] generateRandomTable(int size, int randomBound) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(randomBound);
        }
        return array;
    }
}

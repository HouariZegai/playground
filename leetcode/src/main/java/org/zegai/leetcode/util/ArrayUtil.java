package org.zegai.leetcode.util;

public class ArrayUtil<T> {

    public void print(T[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public void print(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}

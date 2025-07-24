package org.zegai.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(new FizzBuzz().fizzBuzz(3));
        System.out.println(new FizzBuzz().fizzBuzz(5));
    }

    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr.add("FizzBuzz");
            } else if(i % 3 == 0) {
                arr.add("Fizz");
            } else if (i % 5 == 0) {
                arr.add("Buzz");
            } else {
                arr.add(i + "");
            }
        }

        return arr;
    }
}

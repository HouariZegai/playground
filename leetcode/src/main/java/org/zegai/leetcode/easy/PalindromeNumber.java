package org.zegai.leetcode.easy;

import java.util.Stack;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(121));
        System.out.println(new PalindromeNumber().isPalindrome(-121));
        System.out.println(new PalindromeNumber().isPalindrome(10));
        System.out.println(new PalindromeNumber().isPalindrome(1234321));
        System.out.println(new PalindromeNumber().isPalindrome(1000030001));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        int y = x;
        Stack<Integer> stack = new Stack<>();
        while (y > 9) {
            stack.push(y % 10);
            y /= 10;
        }
        stack.push(y);

        y = x;
        int len = stack.size();
        for (int i = 0; i < len / 2; i++) {
            if (y > 9) {
                if (!stack.pop().equals(y % 10))
                    return false;
            } else {
                if (!stack.pop().equals(y))
                    return false;
            }

            y /= 10;
        }

        return true;
    }
}

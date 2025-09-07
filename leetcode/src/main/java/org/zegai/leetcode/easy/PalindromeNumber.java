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

        int y = 0;
        int n = x;
        while (n != 0) {
            y = y * 10 + n % 10;
            n /= 10;
        }

        return x == y;
    }
}

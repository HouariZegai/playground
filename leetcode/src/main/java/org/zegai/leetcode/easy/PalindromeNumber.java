package org.zegai.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(121));
        System.out.println(new PalindromeNumber().isPalindrome(-121));
        System.out.println(new PalindromeNumber().isPalindrome(10));
        System.out.println(new PalindromeNumber().isPalindrome(1234321));
    }

    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        if(x < 10) {
            return true;
        }

        List<Integer> arr = new LinkedList<>();
        while(x >= 10) {
            arr.add(x % 10);
            x /= 10;
        }
        arr.add(x);

        for (int i = 0; i < arr.size() / 2; i++) {
            if(!arr.get(i).equals(arr.get(arr.size() - 1 - i))) {
                return false;
            }
        }

        return true;
    }
}

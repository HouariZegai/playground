package org.zegai.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(new LongestPalindrome().longestPalindrome("abccccdd") == 7);
        System.out.println(new LongestPalindrome().longestPalindrome("a") == 1);
    }

    public int longestPalindrome(String s) {
        Map<Character, Boolean> map = new HashMap<>();

        short num = 0;
        for(short i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                num+=2;
                map.remove(s.charAt(i));
            } else {
                map.put(s.charAt(i), false);
            }
        }

        if(num < s.length()) {
            num++;
        }

        return num;
    }
}

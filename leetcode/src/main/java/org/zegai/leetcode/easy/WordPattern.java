package org.zegai.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(new WordPattern().wordPattern("abba", "dog cat cat dog"));
        System.out.println(new WordPattern().wordPattern("abba", "dog cat cat fish"));
        System.out.println(new WordPattern().wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(new WordPattern().wordPattern("abca", "dog cat cat dog"));
        System.out.println(new WordPattern().wordPattern("a", " a"));
    }

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();

        String[] arr = s.trim().split(" ");
        if (arr.length != pattern.length()) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(!arr[i].equals(map.get(pattern.charAt(i)))) {
                    return false;
                }
            } else {
                if(map.containsValue(arr[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), arr[i]);
            }
        }

        return true;
    }
}

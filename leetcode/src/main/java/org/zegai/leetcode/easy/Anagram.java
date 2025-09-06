package org.zegai.leetcode.easy;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(new Anagram().isAnagram("anagram", "nagaram"));
        System.out.println(new Anagram().isAnagram("rat", "car"));
        System.out.println(new Anagram().isAnagram("rat", "rta"));
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c: t.toCharArray()) {
            if(!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }

            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}

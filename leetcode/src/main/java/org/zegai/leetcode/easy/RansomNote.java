package org.zegai.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {
        System.out.println(new RansomNote().canConstruct("a", "b"));
        System.out.println(new RansomNote().canConstruct("aa", "ab"));
        System.out.println(new RansomNote().canConstruct("aa", "aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c: ransomNote.toCharArray()) {
            if(map.getOrDefault(c, 0) == 0) {
                return false;
            }

            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}
